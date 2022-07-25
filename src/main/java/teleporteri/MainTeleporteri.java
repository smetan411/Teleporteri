package teleporteri;

import teleporteri.listenery.*;
import org.bukkit.plugin.java.JavaPlugin;

public class MainTeleporteri extends JavaPlugin {

    @Override
    public void onEnable() {
        //Listenery
        getServer().getPluginManager().registerEvents(new VidlakListener(), this);
        getServer().getPluginManager().registerEvents(new GolemListener(), this);
        getServer().getPluginManager().registerEvents(new OhnivakListener(), this);
        getServer().getPluginManager().registerEvents(new LucistnikListener(), this);
        getServer().getPluginManager().registerEvents(new DuchListener(), this);
        getServer().getPluginManager().registerEvents(new SmrtHrace(), this);
        getServer().getPluginManager().registerEvents(new RespawnHrace(), this);
        getServer().getPluginManager().registerEvents(new PripojeniListener(), this);
    }
}
