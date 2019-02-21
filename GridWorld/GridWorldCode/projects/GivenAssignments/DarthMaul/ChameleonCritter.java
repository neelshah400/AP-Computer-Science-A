import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ChameleonCritter extends Critter{

    public void processActors(ArrayList<Actor> actors){

        int size = actors.size();
        if(size == 0)
            return;
        int rand = (int)(Math.random() * size);
        Actor other = actors.get(rand);
        setColor(other.getColor());

    }

    public void makeMove(Location loc){

        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);

    }

}
