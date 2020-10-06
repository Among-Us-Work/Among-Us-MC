package me.CodenameS.AmongUsPlugin.Commands;

import me.CodenameS.AmongUsPlugin.GameProcess;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.CodenameS.AmongUsPlugin.GameProcess.configMode;

public class auconfig extends commandBase {



    public auconfig(CommandSender sender, Command cmd, String label, String[] args) {
        super(sender, cmd, label, args);
    }


    public void process() {
        Player player = (Player) sender;
        configMode.add(player);
        if (configMode.contains(player)) {
            configMode.remove(player);
        }
    }

}
