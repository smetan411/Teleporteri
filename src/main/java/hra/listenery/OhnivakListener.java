package hra.listenery;

import hra.mista.MistoAreny;
import hra.commands.MecNaTeleportery;
import hra.vybava.VybavaOhnivak;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class OhnivakListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var teleporter = event.getEntity();
        var jmenoTeleportera = teleporter.getCustomName();

        if (Teleporteri.OHNIVAK.getJmeno().equals(jmenoTeleportera)  &&   !MecNaTeleportery.mamMecNaTeleportery(hrac)) {
            var vybavaOhnivak = new VybavaOhnivak();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.getInventory().clear();
            hrac.getInventory().setBoots(vybavaOhnivak.vyrobOhnivakBoty());
            hrac.getInventory().setHelmet(vybavaOhnivak.vyrobOhnivakHelma());
            hrac.getInventory().setLeggings(vybavaOhnivak.vyrobOhnivakKalhoty());
            hrac.getInventory().setChestplate(vybavaOhnivak.vyrobOhnivakBrneni());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobOhnivakMec());
            hrac.getInventory().setItemInOffHand(vybavaOhnivak.vyrobOhnivakStit());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobSekeru());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobLuk());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobSip());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobJabka());
            hrac.getInventory().addItem(vybavaOhnivak.vyrobEnderPerlu());
            event.setCancelled(true);
        }
    }
}


