package teleporteri.listenery;

import teleporteri.mista.MistoAreny;
import teleporteri.mista.Teleporteri;
import teleporteri.vybava.VybavaVidlak;
import org.bukkit.entity.LivingEntity;
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
        var hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var vesnican = event.getEntity();
        var jmenoVesnicana = vesnican.getCustomName();

        if (Teleporteri.VIDLAK.getJmeno().equals(jmenoVesnicana)) {
            var vybavaVidlak = new VybavaVidlak();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999999, 0, true, false, false));
            hrac.getInventory().clear();
            hrac.getInventory().setBoots(vybavaVidlak.vyrobBoty());
            hrac.getInventory().setHelmet(vybavaVidlak.vyrobHelmu());
            hrac.getInventory().setLeggings(vybavaVidlak.vyrobLeginy());
            hrac.getInventory().setChestplate(vybavaVidlak.vyrobBrneni());
            hrac.getInventory().addItem(vybavaVidlak.vyrobMec());
            hrac.getInventory().addItem(vybavaVidlak.vyrobSekeru());
            hrac.getInventory().addItem(vybavaVidlak.vyrobJabka());
            hrac.getInventory().addItem(vybavaVidlak.vyrobLuk());
            hrac.getInventory().addItem(vybavaVidlak.vyrobEnderPerlu());
            hrac.getInventory().addItem(vybavaVidlak.vyrobSip());
            hrac.getInventory().setItemInOffHand(vybavaVidlak.vyrobStit());

            if (vesnican instanceof LivingEntity) {
                LivingEntity zijciVesnican = (LivingEntity) vesnican;
                zijciVesnican.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10, 5));
            }
            event.setCancelled(true);
        }
    }
}


