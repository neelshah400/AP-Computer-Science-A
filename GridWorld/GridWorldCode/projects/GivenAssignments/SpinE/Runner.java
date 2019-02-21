import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.grid.UnboundedGrid;

public class Runner{

    public static void main(String[] args){

        UnboundedGrid grid = new UnboundedGrid<ActorWorld>();
        ActorWorld world = new ActorWorld(grid);

        EBug bug = new EBug();
        world.add(new Location(20, 5), bug);

        SpinBug bug1 = new SpinBug(true);
        bug1.setDirection(Location.NORTH);
        world.add(new Location(20, 17), bug1);

        SpinBug bug2 = new SpinBug(false);
        bug2.setDirection(Location.EAST);
        world.add(new Location(27, 19), bug2);

        world.add(new Location(5, 17), new Rock());

        world.show();

    }

}