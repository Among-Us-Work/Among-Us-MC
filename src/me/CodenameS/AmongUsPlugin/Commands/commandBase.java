package me.CodenameS.AmongUsPlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class commandBase {

    CommandSender sender;
    Command cmd;
    String label;
    String[] args;





    public commandBase(CommandSender sender, Command cmd, String label, String[] args) {
        this.sender = sender;
        this.cmd = cmd;
        this.label = label;
        this.args = args;

        process();
    }


    //command process
    public abstract void process();




}
