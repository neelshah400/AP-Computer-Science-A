import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class RockEater extends Critter{

	private static int trackerId = 0;
	private int critterId;
	private static ArrayList<Integer> rocksEatenPerCritter = new ArrayList<>();
	private int rocksEaten = 0;
	private static boolean dropPurpleRock = false;

	public RockEater(){

		critterId = trackerId;
		trackerId++;
		rocksEatenPerCritter.add(critterId, 0);

	}

	public void processActors(ArrayList<Actor> actors){

		rocksEatenPerCritter.set(critterId, rocksEaten);
		for(Actor a : actors){
			if(a instanceof PurpleRock || a instanceof RockEater)
				break;
			a.removeSelfFromGrid();
			rocksEaten++;
			dropPurpleRock = true;
			for(int i = 0; i < rocksEatenPerCritter.size(); i++){
				if(rocksEatenPerCritter.get(i) <= 0 || rocksEatenPerCritter.get(i) % 10 != 0)
					dropPurpleRock = false;
			}
		}

	}

	public void makeMove(Location loc){

        Location origLoc = getLocation();
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
		if(dropPurpleRock){
			PurpleRock purpleRock = new PurpleRock();
			purpleRock.putSelfInGrid(getGrid(), origLoc);
			dropPurpleRock = false;
		}

	}

}