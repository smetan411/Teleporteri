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

public class Ohnivak implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!commandSender.isOp()) return false;
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        vytvorOhnivaka(player.getWorld(), player.getLocation());
        return true;
    }


    public void vytvorOhnivaka(World svet, Location misto) {
        var ohnivak = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        ohnivak.setCustomName(Teleporteri.OHNIVAK.getJmeno());
        ohnivak.setAI(false);
    }
}
