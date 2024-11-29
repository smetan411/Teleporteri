package hra.commands;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MecNaTeleportery implements CommandExecutor {

    public static final String MEC_NA_TELEPORTERY = "MEC NA TELEPORTERY";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender.isOp())) return false;
        if (!(commandSender instanceof Player)) return false;
        var player = (Player) commandSender;

        ItemStack mecNaTeleportery = new ItemStack(Material.GOLDEN_SWORD);
        var vlastnosti = mecNaTeleportery.getItemMeta();
        vlastnosti.setDisplayName(MEC_NA_TELEPORTERY);
        vlastnosti.setUnbreakable(true);
       // AttributeModifier attributeModifier = new AttributeModifier("Damage", 5, AttributeModifier.Operation.ADD_NUMBER); // do verze 1.21.1
       // AttributeModifier attributeModifier = new AttributeModifier(NamespacedKey.minecraft("Deffense"), 5, AttributeModifier.Operation.ADD_NUMBER // od verye 1.21.1);
        AttributeModifier attributeModifier = new AttributeModifier(NamespacedKey.minecraft("mec"), 1, AttributeModifier.Operation.ADD_NUMBER );
        vlastnosti.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        mecNaTeleportery.setItemMeta(vlastnosti);
        player.getInventory().addItem(mecNaTeleportery);
        return true;
    }

    public static boolean mamMecNaTeleportery(Player player) {
        var vlastnosti = player.getInventory().getItemInMainHand().getItemMeta();
        if (vlastnosti == null) {
            return false;
        }
        return MEC_NA_TELEPORTERY.equals(vlastnosti.getDisplayName());
    }

}
