package me.CodenameS.AmongUsPlugin.Tasks;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnlockManifolds{



    public static Inventory gui = Bukkit.createInventory(null, 54, ChatColor.BLACK + "" + ChatColor.BOLD + "Unlock Manifolds:");

    public static int getRandom(List<Integer> array) {
        int rnd = new Random().nextInt(array.size());
        int result = array.get(rnd) + 20;
        array.remove(rnd);
        return result;
    }



    public void createInv() {

        List<Integer> numbs = new ArrayList<Integer>();

        for (int i = 1; i != 10; i++) {

            numbs.add(i);
        }

        int slot;






        ItemStack item = new ItemStack(Material.RED_STAINED_GLASS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("1");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);


        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("2");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("3");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("4");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("5");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("6");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("7");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("8");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("9");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);

        item.setType(Material.RED_STAINED_GLASS);
        meta.setDisplayName("10");
        item.setItemMeta(meta);
        slot = getRandom(numbs);
        this.gui.setItem(slot, item);
        item.setAmount(slot);


        item.setType(Material.BARRIER);
        meta.setDisplayName(ChatColor.RED + "Close Menu");
        List<String> lore = new ArrayList<String>();
        lore.set(0, ChatColor.GRAY + "Closes Menu");
        meta.setLore(lore);
        item.setItemMeta(meta);
        gui.setItem(8, item);



    }


}
