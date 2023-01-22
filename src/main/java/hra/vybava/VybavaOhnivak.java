package hra.vybava;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class VybavaOhnivak {

    public ItemStack vyrobOhnivakBoty() {
        var ohnivakovyBoty = new ItemStack(Material.LEATHER_BOOTS, 1);
        ohnivakovyBoty.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) ohnivakovyBoty.getItemMeta();
        meta.setColor(Color.RED);
        ohnivakovyBoty.setItemMeta(meta);

        var itemMeta = ohnivakovyBoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Ohnivakovy Boty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Bot Armor", 2, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        ohnivakovyBoty.setItemMeta(itemMeta);
        return ohnivakovyBoty;
    }

    public ItemStack vyrobOhnivakKalhoty() {
        var ohnivakovyKalhoty = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ohnivakovyKalhoty.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) ohnivakovyKalhoty.getItemMeta();
        meta.setColor(Color.RED);
        ohnivakovyKalhoty.setItemMeta(meta);

        var itemMeta = ohnivakovyKalhoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Ohnivakovy Kalhoty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Kalhot Armor", 4, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        ohnivakovyKalhoty.setItemMeta(itemMeta);
        return ohnivakovyKalhoty;
    }

    public ItemStack vyrobOhnivakBrneni() {
        var ohnivakovoBrneni = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ohnivakovoBrneni.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) ohnivakovoBrneni.getItemMeta();
        meta.setColor(Color.RED);
        ohnivakovoBrneni.setItemMeta(meta);

        var itemMeta = ohnivakovoBrneni.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Ohnivakovo Brneni");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Brneni Armor", 7, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        ohnivakovoBrneni.setItemMeta(itemMeta);
        return ohnivakovoBrneni;
    }

    public ItemStack vyrobOhnivakHelma() {
        var ohnivakovaHelma = new ItemStack(Material.LEATHER_HELMET, 1);
        ohnivakovaHelma.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) ohnivakovaHelma.getItemMeta();
        meta.setColor(Color.RED);
        ohnivakovaHelma.setItemMeta(meta);

        var itemMeta = ohnivakovaHelma.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Ohnivakova Helma");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Helmy Armor", 3, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        ohnivakovaHelma.setItemMeta(itemMeta);
        return ohnivakovaHelma;
    }

    public ItemStack vyrobOhnivakMec() {
        var ohnivakuvMec = new ItemStack(Material.GOLDEN_SWORD, 1);
        ohnivakuvMec.addEnchantment(Enchantment.FIRE_ASPECT, 1);
        var itemMeta = ohnivakuvMec.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Ohnivakuv Mec");
        AttributeModifier attributeModifier = new AttributeModifier("Defence", 5, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        ohnivakuvMec.setItemMeta(itemMeta);
        return ohnivakuvMec;
    }

    public ItemStack vyrobOhnivakStit() {
        var ohnivakuvStit = new ItemStack(Material.SHIELD, 1);
        ohnivakuvStit.addEnchantment(Enchantment.MENDING, 1);
        var itemMeta = ohnivakuvStit.getItemMeta();
        itemMeta.setUnbreakable(true);
        ohnivakuvStit.setItemMeta(itemMeta);
        return ohnivakuvStit;
    }


    public ItemStack vyrobLuk() {
        var luk = new ItemStack(Material.BOW);
        luk.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        luk.addEnchantment(Enchantment.ARROW_FIRE, 1);
        var itemMeta = luk.getItemMeta();
        itemMeta.setUnbreakable(true);
        luk.setItemMeta(itemMeta);
        return luk;
    }

    public ItemStack vyrobSip() {
        var sip = new ItemStack(Material.ARROW);
        return sip;
    }

    public ItemStack vyrobEnderPerlu() {
        var perla = new ItemStack(Material.ENDER_PEARL);
        return perla;
    }

    public ItemStack vyrobJabka() {
        var jablko = new ItemStack(Material.GOLDEN_APPLE, 6);
        return jablko;
    }

    public ItemStack vyrobSekeru() {
        var sekera = new ItemStack(Material.GOLDEN_AXE);
        var itemMeta = sekera.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",4 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        sekera.setItemMeta(itemMeta);
        return sekera;
    }

}
