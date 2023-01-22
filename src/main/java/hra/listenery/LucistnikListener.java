package hra.listenery;

import hra.mista.MistoAreny;
import hra.vybava.VybavaLucistnik;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static hra.vybava.MecNaTeleportery.MEC_NA_TELEPORTERY;

public class LucistnikListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        var hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var vesnican = event.getEntity();
        var jmenoVesnicana = vesnican.getCustomName();

        if (Teleporteri.LUCISTNIK.getJmeno().equals(jmenoVesnicana)) {
            if ((Teleporteri.LUCISTNIK.getJmeno().equals(event.getEntity().getCustomName())) &&
                    ((MEC_NA_TELEPORTERY.equals(hrac.getInventory().getItemInMainHand().getItemMeta().getDisplayName())))) {
                event.getEntity().remove();
            } else {
                var vybavaLucistnik = new VybavaLucistnik();
                hrac.teleport(mistoAreny.get());
                hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
                hrac.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999999, 0, true, false, false));
                hrac.getInventory().clear();
                hrac.getInventory().setBoots(vybavaLucistnik.vyrobLucistnikBoty());
                hrac.getInventory().setHelmet(vybavaLucistnik.vyrobLucistnikHelma());
                hrac.getInventory().setLeggings(vybavaLucistnik.vyrobLucistnikKalhoty());
                hrac.getInventory().setChestplate(vybavaLucistnik.vyrobLucistnikBrneni());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikMec());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobSekeru());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLuk());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobSip());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobSip());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikKus());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikKus());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikKus());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikKus());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobEnderPerlu());
                hrac.getInventory().addItem(vybavaLucistnik.vyrobJabka());
                hrac.getInventory().setItemInOffHand(vybavaLucistnik.vyrobLucistnikStit());

                if (vesnican instanceof LivingEntity) {
                    LivingEntity zijciVesnican = (LivingEntity) vesnican;
                    zijciVesnican.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10, 5));
                }
            }
        }
    }
}


