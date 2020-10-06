package me.CodenameS.AmongUsPlugin;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.inventivetalent.title.TitleAPI;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class GameProcess {
    File dataFile = new File("plugins//Among Us Plugin//pluginFile.yml");
    YamlConfiguration pluginConfig = YamlConfiguration.loadConfiguration(dataFile);

ArrayList<Player> imposters;


public static ArrayList<Player> configMode;



public void gameProcess() {

    //Making sure we are not configuring
    Player[] list;
    list = (Bukkit.getOnlinePlayers().toArray(new Player[0]));
    for (Player player: list) {
        if (configMode.contains(player)) {
            return;
        }
    }

    pickImposters();

    countdown();

    for (Player player: list) {
        if (isImpostor(player)) {
            TextComponent roleImpos = new TextComponent("IMPOSTOR");
            roleImpos.setColor(ChatColor.RED);
            roleImpos.setBold(true);
            TitleAPI.sendTitle(player, roleImpos);
        }
        else {
            TextComponent crewmate = new TextComponent("CREWMATE");
            crewmate.setColor(ChatColor.AQUA);
            crewmate.setBold(true);
            TitleAPI.sendTitle(player, crewmate);
        }
    }




    if (imposters.size() == 0) {







        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "restart");
    }










}

//5 Second Countdown
    public void countdown() {
        //BigO(5x)
        for (int i = 5; i > -1; i++) {

            String x = String.valueOf(i);
            TextComponent cDown = new TextComponent(x);
            cDown.setColor(ChatColor.RED);

            for (Player player : Bukkit.getOnlinePlayers()) {
                TitleAPI.sendTitle(player, cDown);
            }
        }
    }
//Picking impostor among players
    public void pickImposters() {

        //1 impostor
        if (Bukkit.getOnlinePlayers().size() <= 6) {
            Player[] list;
            list = (Bukkit.getOnlinePlayers().toArray(new Player[0]));


            Random rNum = new Random();
            int impostor = rNum.nextInt(Bukkit.getOnlinePlayers().size());
            imposters.add(list[impostor]);
        }



        //2 impostors
        else {
            Player[] list;
            list = (Bukkit.getOnlinePlayers().toArray(new Player[0]));
            int x = 0;
            int impos1;
            int impos2;


        while(x==0) {

            Random rNum1 = new Random();
            Random rNum2 = new Random();
            impos1 = rNum1.nextInt(Bukkit.getOnlinePlayers().size());
            impos2 = rNum2.nextInt(Bukkit.getOnlinePlayers().size());

            //Making sure it doesn't pick same person twice
            if(impos1==impos2) {
            }
            else{
                x++;
        }
            imposters.add(list[impos1]);
            imposters.add(list[impos2]);

        }
        }
    }




    public boolean isImpostor(Player player) {
        if (imposters.contains(player)) {
            return true;
        }
        return false;
    }



    //Process



}
