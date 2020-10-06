package me.CodenameS.AmongUsPlugin.Events;

import me.CodenameS.AmongUsPlugin.GameProcess;
import me.CodenameS.AmongUsPlugin.Tasks.UnlockManifolds;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.io.File;

public class Events implements Listener {
    public int playersInServer = 0;
    private Object BlockStoneButton;
    File dataFile = new File("plugins//Among Us Plugin//data.yml");
    YamlConfiguration data = YamlConfiguration.loadConfiguration(dataFile);

    public void taskComplete() {

    }







@EventHandler
public void taskOpenEvent(PlayerInteractEvent e) {
Player player = e.getPlayer();


        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            //Manifolds
            World wrld = (World) this.data.get("UnlockManifolds-coords.world");
            Double mX = data.getDouble("UnlockManifolds-coords.x");
            Double mY = data.getDouble("UnlockManifolds-coords.y");
            Double mZ = data.getDouble("UnlockManifolds-coords.Z");
            Location mLoc = new Location(wrld, mX, mY, mZ);

            Location pLoc = e.getPlayer().getLocation();

            if (pLoc == mLoc) {
            player.openInventory(UnlockManifolds.gui);
            }


        }

}

@EventHandler
public void taskInteractEvent( InventoryClickEvent e) {
    if(e.getCurrentItem() == null) return;
    else if (e.getCurrentItem().getItemMeta() == null) return;
    else if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;

e.setCancelled(true);
    String invString= e.getInventory().toString();


    String mString = UnlockManifolds.gui.toString();



if (invString == mString) {

for (boolean crct = false; crct = true;) {
    if (e.getCurrentItem().getAmount() == 1) {

    }




    }

}




















    }

    @EventHandler
    public void config(PlayerInteractEvent e) {



        if (GameProcess.configMode.contains(e.getPlayer())) {



            Location loc = e.getClickedBlock().getLocation();
            World wrld = loc.getWorld();
            Double x = loc.getX();
            Double y = loc.getY();
            Double z = loc.getZ();
            this.data.set("UnlockManifolds-coords.world", wrld);
            this.data.set("UnlockManifolds-coords.x", x);
            this.data.set("UnlockManifolds-coords.y", y);
            this.data.set("UnlockManifolds-coords.z", z);

            long idk = 0xCADF;

        }
        else return;
    }
}


