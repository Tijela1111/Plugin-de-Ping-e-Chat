package me.ping.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.ping.comandos.PingCMD;
import net.minecraft.server.v1_8_R3.MinecraftServer;

public class Main extends JavaPlugin {
	
	public static Plugin plugin;

	public void onLoad() {
		Bukkit.getConsoleSender().sendMessage("§e§lPLUGIN §fIniciando plugin...");
		this.Comandos();
	}
	
    public void onEnable() {
    	Bukkit.getConsoleSender().sendMessage("§a§lPLUGIN §fPlugin iniciado.");
    }

    public void Comandos() {
    this.getCommand("ping").setExecutor((CommandExecutor)new PingCMD());
    Bukkit.getConsoleSender().sendMessage("§a§lPLUGIN §fComandos iniciados.");
    
    }

       public static double getTps() {
	   return MinecraftServer.getServer().recentTps[0];
    }

       public static Plugin getPlugin() {
           return Main.plugin;
       }
}
