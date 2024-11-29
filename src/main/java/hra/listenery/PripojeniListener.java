package hra.listenery;

import hra.mista.MistoLobby;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PripojeniListener implements Listener {
           @EventHandler
    public void pripojeni(PlayerJoinEvent event) {
        var mistoLoby = new MistoLobby(event.getPlayer().getWorld());
        event.getPlayer().teleport(mistoLoby.get());
        event.getPlayer().getInventory().clear();
        event.getPlayer().setGameMode(GameMode.ADVENTURE);
    }
}
