package com.kabooa.extracy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info(ChatColor.RED + "Disabled Extracy!");
    }

    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "Enabled Extracy!");
    }
}
