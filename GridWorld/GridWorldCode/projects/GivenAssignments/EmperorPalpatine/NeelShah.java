import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class NeelShah extends Critter{

	private int exists;

	public NeelShah(){

		setColor(null);

	}

	public NeelShah(int direction){

		setColor(null);
		setDirection(direction);

	}

	public ArrayList<Actor> getActors(){

		exists = 0;
		ArrayList<Actor> possibleLocations = new ArrayList<Actor>();
		Location nextLocation = getLocation();
		while(exists == 0){
			if(getGrid().isValid(nextLocation.getAdjacentLocation(getDirection()))){
				nextLocation = nextLocation.getAdjacentLocation(getDirection());
				if(getGrid().get(nextLocation) instanceof Rock)
					exists = 2;
				else{
					if(getGrid().get(nextLocation) instanceof Actor && !(getGrid().get(nextLocation) instanceof NeelShah)){
						possibleLocations.add(getGrid().get(nextLocation));
						exists = 1;
					}
				}
			}
			else
				exists = 2;
		}
		return possibleLocations;

	}

	public void processActors(ArrayList<Actor> actors){

		if(exists == 1){
			for(Actor a : actors){
				Location newLoc = a.getLocation();
				a.removeSelfFromGrid();
				Ash ash = new Ash();
				ash.putSelfInGrid(getGrid(), newLoc);
			}
		}

	}

	public void makeMove(Location loc){

        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);

	}

}