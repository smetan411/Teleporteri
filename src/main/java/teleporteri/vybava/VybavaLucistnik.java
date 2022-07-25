package teleporteri.vybava;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class VybavaLucistnik {

    public ItemStack vyrobLucistnikBoty() {
        var lucistnikovyBoty = new ItemStack(Material.LEATHER_BOOTS, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) lucistnikovyBoty.getItemMeta();
        meta.setColor(Color.GREEN);
        lucistnikovyBoty.setItemMeta(meta);
        var itemMeta = lucistnikovyBoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikovy Boty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Bot Armor", 2, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        lucistnikovyBoty.setItemMeta(itemMeta);
        return lucistnikovyBoty;
    }

    public ItemStack vyrobLucistnikKalhoty() {
        var lucistnikovyKalhoty = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) lucistnikovyKalhoty.getItemMeta();
        meta.setColor(Color.GREEN);
        lucistnikovyKalhoty.setItemMeta(meta);
        var itemMeta = lucistnikovyKalhoty.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikovy Kalhoty");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Kalhot Armor", 4, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        lucistnikovyKalhoty.setItemMeta(itemMeta);
        return lucistnikovyKalhoty;
    }

    public ItemStack vyrobLucistnikBrneni() {
        var lucistnikovoBrneni = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) lucistnikovoBrneni.getItemMeta();
        meta.setColor(Color.GREEN);
        lucistnikovoBrneni.setItemMeta(meta);
        var itemMeta = lucistnikovoBrneni.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikovo Brneni");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Brneni Armor", 8, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        lucistnikovoBrneni.setItemMeta(itemMeta);
        return lucistnikovoBrneni;
    }

    public ItemStack vyrobLucistnikHelma() {
        var lucistnikovaHelma = new ItemStack(Material.LEATHER_HELMET, 1);
        // tvorba barev:
        LeatherArmorMeta meta = (LeatherArmorMeta) lucistnikovaHelma.getItemMeta();
        meta.setColor(Color.GREEN);
        lucistnikovaHelma.setItemMeta(meta);
        var itemMeta = lucistnikovaHelma.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikova Helma");
        AttributeModifier attributeModifier = new AttributeModifier("Sila Helmy Armor", 4, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, attributeModifier);
        lucistnikovaHelma.setItemMeta(itemMeta);
        return lucistnikovaHelma;
    }

    public ItemStack vyrobLucistnikMec() {
        var lucistnikuvMec = new ItemStack(Material.DIAMOND_SWORD, 1);
        var itemMeta = lucistnikuvMec.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikuv Mec");
        AttributeModifier attributeModifier = new AttributeModifier("Defence", 7, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        lucistnikuvMec.setItemMeta(itemMeta);
        return lucistnikuvMec;
    }

    public ItemStack vyrobLucistnikKus() {
        var lucistnikovaKus = new ItemStack(Material.CROSSBOW, 1);
        lucistnikovaKus.addEnchantment(Enchantment.MULTISHOT, 1);
        lucistnikovaKus.addEnchantment(Enchantment.QUICK_CHARGE, 3);
        lucistnikovaKus.addEnchantment(Enchantment.ARROW_FIRE, 1);
        lucistnikovaKus.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        var itemMeta = lucistnikovaKus.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName("Lucistnikova Kus");
        AttributeModifier attributeModifier = new AttributeModifier("Defence", 7, AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        lucistnikovaKus.setItemMeta(itemMeta);
        return lucistnikovaKus;
    }

    public ItemStack vyrobLucistnikStit() {
        var lucistnikuvStit = new ItemStack(Material.SHIELD, 1);
        var itemMeta = lucistnikuvStit.getItemMeta();
        itemMeta.setUnbreakable(true);
        lucistnikuvStit.setItemMeta(itemMeta);
        return lucistnikuvStit;
    }


    public ItemStack vyrobLuk() {
        var luk = new ItemStack(Material.BOW);
        luk.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        luk.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
        var itemMeta = luk.getItemMeta();
        itemMeta.setUnbreakable(true);
        luk.setItemMeta(itemMeta);
        return luk;
    }

    public ItemStack vyrobSip() {
        var sip = new ItemStack(Material.ARROW, 64);
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
        var sekera = new ItemStack(Material.DIAMOND_AXE);
        var itemMeta = sekera.getItemMeta();
        itemMeta.setUnbreakable(true);
        AttributeModifier attributeModifier = new AttributeModifier("Damage",4 , AttributeModifier.Operation.ADD_NUMBER);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attributeModifier);
        sekera.setItemMeta(itemMeta);
        return sekera;
    }

}
