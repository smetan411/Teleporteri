package hra.commands;

import hra.listenery.Teleporteri;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class Vidlak implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        vytvorVidlaka(player.getWorld(), player.getLocation());
        return true;
    }
    public void vytvorVidlaka(World svet, Location misto) {
        var vidlak = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        vidlak.setCustomName(Teleporteri.VIDLAK.getJmeno());
        vidlak.setAI(false);
    }
}
