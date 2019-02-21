import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug{

	private int steps;
	private int sideLength;
	private int part;

	public ZBug(int length){

		setDirection(Location.EAST);
		steps = 0;
		sideLength = length;
		part = 1;

	}

    public void act(){

        if(steps < sideLength && canMove()){
            move();
            steps++;
        }
        else if(canMove()){
            part++;
            if(part == 2)
            	setDirection(Location.SOUTHWEST);
			if(part == 3)
				setDirection(Location.EAST);
			if(part == 4)
				sideLength = -1;
            steps = 0;
        }
        else{
			steps = 0;
			part = 0;
		}

    }

}