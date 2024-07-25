package hra.listenery;

import hra.mista.MistoLobby;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PripojeniListener implements Listener {
           @EventHandler
    public void pripojeni(PlayerJoinEvent event) {
        var mistoLoby = new MistoLobby(event.getPlayer().getWorld());
        event.getPlayer().teleport(mistoLoby.get());
        event.getPlayer().getInventory().clear();


//        event.getPlayer().getInventory().addItem(mecTeleporteru());
//    }
//
//    private ItemStack mecTeleporteru() {
//        ItemStack telemec = new ItemStack(Material.GOLDEN_SWORD);
//        var itemMeta = telemec.getItemMeta();
//        itemMeta.setDisplayName(MEC_NA_TELEPORTERY);
//        itemMeta.setUnbreakable(true);
//        AttributeModifier attributeModifier = new AttributeModifier("Damage", 5, AttributeModifier.Operation.ADD_NUMBER);
//        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
//        telemec.setItemMeta(itemMeta);
//        return telemec;



    }
}
