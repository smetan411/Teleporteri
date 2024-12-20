package hra.listenery;

import hra.mista.MistoAreny;
import hra.commands.MecNaTeleportery;
import hra.vybava.VybavaVidlak;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class VidlakListener implements Listener {

    @EventHandler
    public void uderVesnicana(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var teleporter = event.getEntity();
        var jmenoTeleportera = teleporter.getCustomName();

        if (Teleporteri.VIDLAK.getJmeno().equals(jmenoTeleportera)  &&   !MecNaTeleportery.mamMecNaTeleportery(hrac)) {
            var vybavaVidlak = new VybavaVidlak();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.getInventory().clear();
            hrac.getInventory().setBoots(vybavaVidlak.vyrobBoty());
            hrac.getInventory().setHelmet(vybavaVidlak.vyrobHelmu());
            hrac.getInventory().setLeggings(vybavaVidlak.vyrobLeginy());
            hrac.getInventory().setChestplate(vybavaVidlak.vyrobBrneni());
            hrac.getInventory().addItem(vybavaVidlak.vyrobMec());
            hrac.getInventory().setItemInOffHand(vybavaVidlak.vyrobStit());
            hrac.getInventory().addItem(vybavaVidlak.vyrobSekeru());
            hrac.getInventory().addItem(vybavaVidlak.vyrobLuk());
            hrac.getInventory().addItem(vybavaVidlak.vyrobSip());
            hrac.getInventory().addItem(vybavaVidlak.vyrobJabka());
            hrac.getInventory().addItem(vybavaVidlak.vyrobEnderPerlu());
            hrac.setGameMode(GameMode.ADVENTURE);
            event.setCancelled(true);
        }
    }
}



