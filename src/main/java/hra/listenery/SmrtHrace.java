package hra.listenery;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class SmrtHrace implements Listener {

    @EventHandler
    public static void smrtHrace(PlayerDeathEvent event) {
        var jablko = new ItemStack(Material.GOLDEN_APPLE, 2);
        var enderPerla = new ItemStack(Material.ENDER_PEARL, 1);
        event.getDrops().clear();
        event.getDrops().add(jablko);
        event.getDrops().add(enderPerla);
        var player = event.getEntity();
        player.getInventory().clear();
        player.setGameMode(GameMode.ADVENTURE);
    }
}