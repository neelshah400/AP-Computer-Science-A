import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class DarthMaul extends Critter{

	public DarthMaul(){

		setColor(null);

	}

	public DarthMaul(int direction){

		setColor(null);
		setDirection(direction);

	}

	public ArrayList<Actor> getActors(){

		ArrayList<Actor> actors = new ArrayList<Actor>();
		int [] dirs = {Location.LEFT, Location.RIGHT};
		for(Location loc : getLocationsInDirections(dirs)){
			Actor a = getGrid().get(loc);
			if(a != null)
				actors.add(a);
		}
		return actors;

	}

	public void processActors(ArrayList<Actor> actors){

        for(Actor a : actors){
            if(!(a instanceof Critter))
                a.removeSelfFromGrid();
        }

	}

	public void makeMove(Location loc){

        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);

	}

    public ArrayList<Location> getLocationsInDirections(int [] dirs){

        ArrayList<Location> locs = new ArrayList<Location>();
        for(int d : dirs){
            Location neighbor = getLocation().getAdjacentLocation(getDirection() + d);
            if(getGrid().isValid(neighbor))
                locs.add(neighbor);
        }
        return locs;

    }

}