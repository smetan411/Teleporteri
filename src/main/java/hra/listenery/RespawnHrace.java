package hra.listenery;

import hra.mista.MistoLobby;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import static hra.vybava.MecNaTeleportery.MEC_NA_TELEPORTERY;

public class RespawnHrace implements Listener {

    @EventHandler
    public void respawn(PlayerRespawnEvent respawnEvent){
        Player player = respawnEvent.getPlayer();
        var mistoLoby = new MistoLobby(player.getWorld());
        respawnEvent.setRespawnLocation(mistoLoby.get());
        player.teleport(mistoLoby.get());
        player.getInventory().clear();
        respawnEvent.getPlayer().getInventory().addItem(mecTeleporteru());
    }

    private ItemStack mecTeleporteru() {
        ItemStack telemec = new ItemStack(Material.GOLDEN_SWORD);
        var itemMeta = telemec.getItemMeta();
        itemMeta.setDisplayName(MEC_NA_TELEPORTERY);
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage", 5, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        telemec.setItemMeta(itemMeta);
        return telemec;
    }
}