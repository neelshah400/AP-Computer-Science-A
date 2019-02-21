import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class JumperRunner{

    public static void main(String[] args){

        ActorWorld world = new ActorWorld();

        Jumper jumper = new Jumper();
        world.add(new Location(9,4),jumper);

        world.add(new Location(7,4),new Rock());
        world.add(new Location(3,4),new Rock());
        world.add(new Location(2,4),new Rock());

        world.show();

    }

}