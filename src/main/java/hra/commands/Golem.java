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

public class Golem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!commandSender.isOp()) return false;
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        vytvorGolema(player.getWorld(), player.getLocation());
        return true;
    }

    public void vytvorGolema(World svet, Location misto) {
        var golem = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        golem.setCustomName(Teleporteri.GOLEM.getJmeno());
        golem.setAI(false);
    }

    /*
    pro novou verzi:
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!commandSender.isOp())return false;
        if (! (commandSender instanceof Player))return false;
        Player player = (Player) commandSender;
        vytvorGolema(player.getWorld(),player.getLocation());
        return true;
    }

    public void vytvorGolema(World world, Location location){
      var golem = world.spawn(location, Villager.class);
      golem.customName(Component.text(Teleporteri.GOLEM.getJmeno()));
      golem.setAI(false);
    }
     */

}
