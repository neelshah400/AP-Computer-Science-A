import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class Runner{

	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

		world.add(new Location(1,6), new Actor());
		world.add(new Location(2,6), new Actor());
		world.add(new Location(3,6), new Actor());
		world.add(new Location(4,0), new NeelShah(90));
		world.add(new Location(4,4), new Rock());
		world.add(new Location(4,5), new Actor());
		world.add(new Location(5,3), new Actor());
		world.add(new Location(6,2), new Actor());
		world.add(new Location(7,6), new NeelShah(0));
		world.add(new Location(8,0), new NeelShah(45));

		world.show();

	}

}