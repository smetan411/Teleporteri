package hra.listenery;

import hra.mista.MistoAreny;
import hra.vybava.MecNaTeleportery;
import hra.vybava.VybavaDuch;
import hra.vybava.VybavaGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static hra.vybava.MecNaTeleportery.MEC_NA_TELEPORTERY;
import static hra.vybava.MecNaTeleportery.mamMecNaTeleportery;

public class DuchListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var teleporter = event.getEntity();
        var jmenoTeleportera = teleporter.getCustomName();

        if (Teleporteri.DUCH.getJmeno().equals(jmenoTeleportera)  &&   !MecNaTeleportery.mamMecNaTeleportery(hrac)) {
            var vybavaDuch = new VybavaDuch();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999999, 5, true, false, false));
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 0, true, false, false));
            hrac.getInventory().clear();
            hrac.getInventory().addItem(vybavaDuch.vyrobMec());
            hrac.getInventory().addItem(vybavaDuch.vyrobSekeru());
            hrac.getInventory().addItem(vybavaDuch.vyrobJabka());
            hrac.getInventory().addItem(vybavaDuch.vyrobEnderPerlu());
            event.setCancelled(true);
        }
    }
}

