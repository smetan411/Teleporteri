package hra.vybava;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;

public class VybavaGolem {

    public ItemStack vyrobGolemBoty() {
        var golemBoty = new ItemStack(Material.IRON_BOOTS, 1);
        var itemMeta = golemBoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Golemovy Boty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Bot Armor", 3, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        golemBoty.setItemMeta(itemMeta);
        return golemBoty;
    }

    public ItemStack vyrobGolemKalhoty() {
        var golemKalhoty = new ItemStack(Material.IRON_LEGGINGS, 1);
        var itemMeta = golemKalhoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Golemovy Kalhoty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Kalhot Armor", 6, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        golemKalhoty.setItemMeta(itemMeta);
        return golemKalhoty;
    }

    public ItemStack vyrobGolemBrneni() {
        var golemBrneni = new ItemStack(Material.IRON_CHESTPLATE, 1);
        var itemMeta = golemBrneni.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Golemovo Brneni");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Brneni Armor", 8, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        golemBrneni.setItemMeta(itemMeta);
        return golemBrneni;
    }

    public ItemStack vyrobGolemDyne() {
        var golemDyne = new ItemStack(Material.CARVED_PUMPKIN, 1);
        var itemMeta = golemDyne.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Golemova Dyne");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Dyne Armor", 20, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        golemDyne.setItemMeta(itemMeta);
        return golemDyne;
    }

    public ItemStack vyrobGolemMec() {
        var golemMec = new ItemStack(Material.IRON_SWORD, 1);
        var itemMeta = golemMec.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Golem Mec");
        AttributeModifier attributeModifier = new AttributeModifier("Defence", 6, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        golemMec.setItemMeta(itemMeta);
        return golemMec;
    }

    public ItemStack vyrobGolemStit() {
        var golemStit = new ItemStack(Material.SHIELD, 1);
        var itemMeta = golemStit.getItemMeta();
        itemMeta.setUnbreakable(true);
        golemStit.setItemMeta(itemMeta);
        return golemStit;
    }

    public ItemStack vyrobEnderPerlu() {
        return new ItemStack(Material.ENDER_PEARL, 10);
    }

    public ItemStack vyrobJabka() {
        return new ItemStack(Material.GOLDEN_APPLE, 6);
    }

    public ItemStack vyrobSekeru() {
        var sekera = new ItemStack(Material.IRON_AXE);
        var itemMeta = sekera.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",4 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        sekera.setItemMeta(itemMeta);
        return sekera;
    }

}

