package hra.listenery;

import hra.mista.MistoAreny;
import hra.vybava.VybavaVidlak;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static hra.vybava.MecNaTeleportery.MEC_NA_TELEPORTERY;


public class VidlakListener implements Listener {

    @EventHandler
    public void uderVesnicana(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        var hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var vesnican = event.getEntity();
        var jmenoVesnicana = vesnican.getCustomName();

        if (Teleporteri.VIDLAK.getJmeno().equals(jmenoVesnicana)) {
            if ((Teleporteri.VIDLAK.getJmeno().equals(event.getEntity().getCustomName())) &&
                    ((MEC_NA_TELEPORTERY.equals(hrac.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
                event.getEntity().remove();
            } else {
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
            }
        }
    }
}


