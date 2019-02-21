import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class Runner{

	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

		for(int i = 0; i < 20; i++)
			world.add(new Rock());

		for(int i = 0; i < 2; i++)
			world.add(new RockEater());

		world.show();

	}

}