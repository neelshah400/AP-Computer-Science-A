import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class Runner{

    public static void main(String[] args){

        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);

        CircleBug circleBug = new CircleBug(3);
        world.add(new Location(6, 0), circleBug);

        SpiralBug spiralBug = new SpiralBug(3);
        world.add(new Location(17, 28), spiralBug);

        ZBug zBug = new ZBug(4);
        world.add(new Location(24, 1), zBug);

        world.show();

    }

}