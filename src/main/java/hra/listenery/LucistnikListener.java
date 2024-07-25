package hra.listenery;

import hra.mista.MistoAreny;
import hra.commands.MecNaTeleportery;
import hra.vybava.VybavaLucistnik;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LucistnikListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var teleporter = event.getEntity();
        var jmenoTeleportera = teleporter.getCustomName();

        if (Teleporteri.LUCISTNIK.getJmeno().equals(jmenoTeleportera)  &&   !MecNaTeleportery.mamMecNaTeleportery(hrac)) {
            var vybavaLucistnik = new VybavaLucistnik();
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999999, 5, true, false, false));
            hrac.getInventory().clear();
            hrac.getInventory().setBoots(vybavaLucistnik.vyrobLucistnikBoty());
            hrac.getInventory().setHelmet(vybavaLucistnik.vyrobLucistnikHelma());
            hrac.getInventory().setLeggings(vybavaLucistnik.vyrobLucistnikKalhoty());
            hrac.getInventory().setChestplate(vybavaLucistnik.vyrobLucistnikBrneni());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikMec());
            hrac.getInventory().setItemInOffHand(vybavaLucistnik.vyrobLucistnikStit());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobSekeru());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobLuk());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobSip());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobLucistnikKus());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobJabka());
            hrac.getInventory().addItem(vybavaLucistnik.vyrobEnderPerlu());
            event.setCancelled(true);
        }
    }
}


