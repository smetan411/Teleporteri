package teleporteri.mista;

import org.bukkit.Location;
import org.bukkit.World;

public class MistoAreny {

    private final World world;

    public MistoAreny(World world) {
        this.world = world;
    }


    public Location get(){
        return new Location(world, 808, 64, 1113);
    }
}
