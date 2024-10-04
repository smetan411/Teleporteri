package hra.listenery;

import hra.mista.MistoAreny;
import hra.commands.MecNaTeleportery;
import hra.vybava.VybavaGolem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GolemListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var teleporter = event.getEntity();
        var jmenoTeleportera = teleporter.getCustomName();

        if (Teleporteri.GOLEM.getJmeno().equals(jmenoTeleportera)  &&   !MecNaTeleportery.mamMecNaTeleportery(hrac)) {
            var vybavaGolem = new VybavaGolem();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.getInventory().clear();
            hrac.getInventory().setBoots(vybavaGolem.vyrobGolemBoty());
            hrac.getInventory().setHelmet(vybavaGolem.vyrobGolemDyne());
            hrac.getInventory().setLeggings(vybavaGolem.vyrobGolemKalhoty());
            hrac.getInventory().setChestplate(vybavaGolem.vyrobGolemBrneni());
            hrac.getInventory().addItem(vybavaGolem.vyrobGolemMec());
            hrac.getInventory().setItemInOffHand(vybavaGolem.vyrobGolemStit());
            hrac.getInventory().addItem(vybavaGolem.vyrobSekeru());
            hrac.getInventory().addItem(vybavaGolem.vyrobJabka());
            hrac.getInventory().addItem(vybavaGolem.vyrobEnderPerlu());
            event.setCancelled(true);
        }
    }
}



