import info.gridworld.grid.Grid;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class Jumper extends Bug{

	public void act(){

		if(canMove())
			move();
		else{
			Location origLoc = getLocation();
			Location nextLoc = getLocation().getAdjacentLocation(getDirection());
			if(getGrid().isValid(nextLoc)){
				nextLoc = nextLoc.getAdjacentLocation(getDirection());
				ArrayList<Location> occLocs = getGrid().getOccupiedLocations();
				if(occLocs.contains(nextLoc))
					turn();
				else
					moveTo(nextLoc);
			}
			else
				turn();
		}

	}

}