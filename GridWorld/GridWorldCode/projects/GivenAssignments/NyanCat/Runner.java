import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class Runner{

	public static void main(String[]args){

		ActorWorld world = new ActorWorld();

        world.add(new Location(8,4), new NyanCat());
        world.add(new Location(9,5), new Bug());
        world.add(new Location(4,4), new Actor());
        world.add(new Location(2,4), new Rock());

        world.show();

	}

}