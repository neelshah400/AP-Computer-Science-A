import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class Runner{

	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

		world.add(new Location(2,1), new Actor());
		world.add(new Location(2,2), new DarthMaul());
		world.add(new Location(2,3), new ChameleonCritter());
		world.add(new Location(2,5), new Actor());
		world.add(new Location(2,6), new Actor());
		world.add(new Location(2,7), new Actor());
		world.add(new Location(3,2), new Actor());
		world.add(new Location(3,5), new Actor());
		world.add(new Location(3,6), new DarthMaul());
		world.add(new Location(3,7), new Actor());
		world.add(new Location(6,0), new DarthMaul());
		world.add(new Location(6,4), new Actor());
		world.add(new Location(7,5), new DarthMaul(45));
		world.add(new Location(8,6), new Actor());

		world.show();

	}

}