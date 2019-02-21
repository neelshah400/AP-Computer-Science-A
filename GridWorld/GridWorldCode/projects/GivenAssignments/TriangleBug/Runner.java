import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class Runner{

	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

		TriangleBug defaultBug = new TriangleBug();
		world.add(new Location(4,1), defaultBug);

		TriangleBug otherBug = new TriangleBug(3);
		world.add(new Location(8,1), otherBug);

		world.show();

	}

}