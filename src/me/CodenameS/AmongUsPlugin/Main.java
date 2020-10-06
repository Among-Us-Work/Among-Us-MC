package me.CodenameS.AmongUsPlugin;

import me.CodenameS.AmongUsPlugin.Events.Events;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;

public class Main extends JavaPlugin {




    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }





}


