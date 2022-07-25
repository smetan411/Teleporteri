package teleporteri.listenery;

import teleporteri.mista.MistoLobby;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PripojeniListener implements Listener {

    @EventHandler
    public void pripojeni(PlayerJoinEvent event) {
        var mistoLoby = new MistoLobby(event.getPlayer().getWorld());
        event.getPlayer().teleport(mistoLoby.get());
    }
}
