import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class EBug extends Bug{

	private int steps;
	private int sideLength;
	private int part;

	public EBug(){

		setDirection(Location.WEST);
		steps = 0;
		sideLength = 2;
		part = 1;

	}

    public void act(){

        if(steps < (sideLength && canMove()){
            if(part == 1)
            	setDirection(Location.WEST);
            move();
            steps++;
        }
        else if(canMove()){
            part++;
            if(part == 2)
            	setDirection(Location.SOUTH);
			if(part == 3)
				setDirection(Location.EAST);
			if(part == 4)
				setDirection(Location.WEST);
			if(part == 5)
				setDirection(Location.SOUTH);
			if(part == 6)
				setDirection(Location.EAST);
			if(part == 7)
				sideLength = 0;
            steps = 0;
        }
        else{
			steps = 0;
			part = 0;
		}

    }

}