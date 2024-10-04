package hra.mista;

import org.bukkit.Location;
import org.bukkit.World;

public class MistoLobby {

    private final World world;

    public MistoLobby(World world) {

        this.world = world;
    }

    public Location get(){
        return new Location(world, -13, 67, 4);
    }
}
