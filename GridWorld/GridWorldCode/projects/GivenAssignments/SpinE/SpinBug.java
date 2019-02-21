import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpinBug extends Bug{

	private int steps;
	private int sideLength;
	private boolean turnClockwise;
	private boolean collision = false;

	public SpinBug(boolean clockwise){

		steps = 0;
		sideLength = 9;
		turnClockwise = clockwise;

	}

    public void act(){

		if(collision){
			move();
			collision = false;
		}
		else if(steps < sideLength){
			if(steps > 0)
				correctTurn();
			else{
				if(canMove())
					move();
				else{
					turn();
					collision = true;
					steps = 0;
				}
			}
			steps++;
		}
        else
            steps = 0;

    }

    public void correctTurn(){

		if(turnClockwise)
			turn();
		else
			setDirection(getDirection() + Location.HALF_LEFT);

	}

}