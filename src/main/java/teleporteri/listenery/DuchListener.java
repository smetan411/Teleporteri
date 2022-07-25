package teleporteri.listenery;

import teleporteri.mista.MistoAreny;
import teleporteri.mista.Teleporteri;
import teleporteri.vybava.VybavaDuch;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DuchListener implements Listener {

    @EventHandler
    public void uderDoTeleportera(EntityDamageByEntityEvent event) {

        if (!(event.getDamager() instanceof Player)) return;
        Player hrac = (Player) event.getDamager();
        var mistoAreny = new MistoAreny(hrac.getWorld());
        var vesnican = event.getEntity();
        var jmenoVesnicana = vesnican.getCustomName();

        if (Teleporteri.DUCH.getJmeno().equals(jmenoVesnicana)) {
            hrac.teleport(mistoAreny.get());
            hrac.sendMessage("Byl jsi úspěšně připojen do hry.");
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999999, 0, true, false, false));
            hrac.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 0, true, false, false));
            hrac.getInventory().clear();
            hrac.getInventory().addItem(VybavaDuch.vyrobMec());
            hrac.getInventory().addItem(VybavaDuch.vyrobSekeru());
            hrac.getInventory().addItem(VybavaDuch.vyrobJabka());
            hrac.getInventory().addItem(VybavaDuch.vyrobEnderPerlu());
            if (vesnican instanceof LivingEntity) {
                LivingEntity zijciVesnican = (LivingEntity) vesnican;
                zijciVesnican.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 10, 5));
            }
            event.setDamage(0);
            event.setCancelled(true);
        }
    }
}
