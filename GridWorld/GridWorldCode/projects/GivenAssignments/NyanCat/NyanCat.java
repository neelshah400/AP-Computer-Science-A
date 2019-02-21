import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class NyanCat extends Bug{

	public NyanCat(){

		setColor(null);

	}

	public boolean canMove(){

		if(getGrid() == null)
			return false;
		Location origLoc = getLocation();
		Location nextLoc = origLoc.getAdjacentLocation(getDirection());
		if(!getGrid().isValid(nextLoc))
			return false;
		return true;


	}

	public void move(){

		if(getGrid() == null)
			return;
		Location origLoc = getLocation();
		Location nextLoc = origLoc.getAdjacentLocation(getDirection());
		if(getGrid().isValid(nextLoc))
			moveTo(nextLoc);
		else
			removeSelfFromGrid();
		Rainbow rainbow = new Rainbow(getDirection());
		rainbow.putSelfInGrid(getGrid(), origLoc);

	}

}