package hra.vybava;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class VybavaDuch {

    public static ItemStack vyrobMec() {
        var mec = new ItemStack(Material.DIAMOND_SWORD);
        mec.addEnchantment(Enchantment.MENDING,1);
        var itemMeta = mec.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",10 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        mec.setItemMeta(itemMeta);
        return mec;
    }

    public static ItemStack vyrobEnderPerlu() {
        return new ItemStack(Material.ENDER_PEARL);
    }

    public static ItemStack vyrobJabka() {
        return new ItemStack(Material.GOLDEN_APPLE, 6);
    }

    public static ItemStack vyrobSekeru() {
        var sekera = new ItemStack(Material.DIAMOND_AXE);
        sekera.addEnchantment(Enchantment.MENDING,1);
        var itemMeta = sekera.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",4 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        sekera.setItemMeta(itemMeta);
        return sekera;
    }
}
