package me.beastchat.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.beastchat.comandos.ChatCMD;
import me.beastchat.comandos.ClearChatCMD;

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
    this.getCommand("cc").setExecutor((CommandExecutor)new ClearChatCMD());
    this.getCommand("chat").setExecutor((CommandExecutor)new ChatCMD());
    Bukkit.getConsoleSender().sendMessage("§a§lPLUGIN §fComandos iniciados.");
    }
}
