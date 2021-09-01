package fr.oximov.nosaria.lobby;


import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.oximov.nosaria.lobby.listeners.ListennersSecurity;
import fr.oximov.nosaria.lobby.listeners.joinListenners;

public class Main extends JavaPlugin {

  public static String prefix = "§3§lNosa§f§lria §7» ";

  //« »

  @Override
  public void onEnable() {
    getServer().getMessenger().registerOutgoingPluginChannel((Plugin) this, "BungeeCord");
    PluginManager pm = Bukkit.getServer().getPluginManager();

    /*
     * Custom listeners
     */
    pm.registerEvents(new CommandsSpawn(), this);
    pm.registerEvents(new joinListenners(), this);
    pm.registerEvents(new ListennersSecurity(), this);
  }
}
