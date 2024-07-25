package hra.listenery;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import static hra.commands.MecNaTeleportery.MEC_NA_TELEPORTERY;


public class TeleporteriNesmrtelnost implements Listener {

    @EventHandler
    public void nastavNesmrtelnost(EntityDamageByEntityEvent udalost) {

        var utocnik = (Player) udalost.getDamager();


        if ((Teleporteri.LUCISTNIK.getJmeno().equals(udalost.getEntity().getCustomName())) &&
                (!(MEC_NA_TELEPORTERY.equals(utocnik.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
            udalost.setCancelled(true);
        } else if ((Teleporteri.VIDLAK.getJmeno().equals(udalost.getEntity().getCustomName())) &&
                (!(MEC_NA_TELEPORTERY.equals(utocnik.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
            udalost.setCancelled(true);
        } else if ((Teleporteri.DUCH.getJmeno().equals(udalost.getEntity().getCustomName())) &&
                (!(MEC_NA_TELEPORTERY.equals(utocnik.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
            udalost.setCancelled(true);
        } else if ((Teleporteri.GOLEM.getJmeno().equals(udalost.getEntity().getCustomName())) &&
                (!(MEC_NA_TELEPORTERY.equals(utocnik.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
            udalost.setCancelled(true);
        } else if ((Teleporteri.OHNIVAK.getJmeno().equals(udalost.getEntity().getCustomName())) &&
                (!(MEC_NA_TELEPORTERY.equals(utocnik.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
            udalost.setCancelled(true);
        }
    }
}
