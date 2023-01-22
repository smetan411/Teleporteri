package hra.vybava;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class VybavaVidlak {


    public ItemStack vyrobBoty() {
        var boty = new ItemStack(Material.DIAMOND_BOOTS);
        var itemMeta = boty.getItemMeta();
        itemMeta.setUnbreakable(true);
        boty.setItemMeta(itemMeta);
        return boty;
    }


    public ItemStack vyrobHelmu() {
        var helma = new ItemStack(Material.DIAMOND_HELMET);
        var itemMeta = helma.getItemMeta();
        itemMeta.setUnbreakable(true);
        helma.setItemMeta(itemMeta);
        return helma;
    }


    public ItemStack vyrobBrneni() {
        var brneni = new ItemStack(Material.DIAMOND_CHESTPLATE);
        var itemMeta = brneni.getItemMeta();
        itemMeta.setUnbreakable(true);
        brneni.setItemMeta(itemMeta);
        return brneni;
    }

    public ItemStack vyrobLeginy() {
        var leginy = new ItemStack(Material.DIAMOND_LEGGINGS);
        var itemMeta = leginy.getItemMeta();
        itemMeta.setUnbreakable(true);
        leginy.setItemMeta(itemMeta);
        return leginy;
    }


    public ItemStack vyrobMec() {
        var mec = new ItemStack(Material.DIAMOND_SWORD);
        var itemMeta = mec.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",8 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        mec.setItemMeta(itemMeta);
        return mec;
    }


    public ItemStack vyrobLuk() {
        var luk = new ItemStack(Material.BOW);
        luk.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        var itemMeta = luk.getItemMeta();
        itemMeta.setUnbreakable(true);
        luk.setItemMeta(itemMeta);
        return luk;
    }

    public ItemStack vyrobSip() {
        var sip = new ItemStack(Material.ARROW);
        return sip;
    }

    public ItemStack vyrobStit() {
        var stit = new ItemStack(Material.SHIELD);
        var itemMeta = stit.getItemMeta();
        itemMeta.setUnbreakable(true);
        stit.setItemMeta(itemMeta);
        return stit;
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
        sekera.addEnchantment(Enchantment.MENDING,1);
        var itemMeta = sekera.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",4 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        sekera.setItemMeta(itemMeta);
        return sekera;
    }
}
