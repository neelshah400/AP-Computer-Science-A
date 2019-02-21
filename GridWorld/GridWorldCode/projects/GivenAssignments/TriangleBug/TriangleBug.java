import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class TriangleBug extends Bug{

	private int legLength;
	private int sideLength;
	private int steps;
	private int part;
	int turns = 0;

	public TriangleBug(){

		setDirection(45);

		legLength = 4;
		sideLength = legLength;
		steps = 0;
		part = 1;
		turns = 0;

	}

	public TriangleBug(int legLength){

		setDirection(45);

		this.legLength = legLength;
		sideLength = legLength;
		steps = 0;
		part = 1;
		turns = 0;

	}

	public void act(){

		if(steps < (sideLength - 1) && canMove() && turns == 0){
			move();
			steps++;
		}
		else if(canMove()){
			if(turns == 0){
				part++;
				if(part == 2)
					turns = 2;
				if(part == 3)
					turns = 3;
				if(part == 4)
					turns = 3;
			}
			if(part == 2){
				turn();
				turns--;
			}
			if(part == 3){
				turn();
				turns--;
				sideLength = (2 * legLength) - 1;
			}
			if(part == 4){
				turn();
				turns--;
				if(turns == 0){
					part = 1;
					sideLength = legLength;
				}
			}
			steps = 0;
		}
		else{
			steps = 0;
			part = 0;
		}

	}

}