package me.ping.sistemas;

import org.bukkit.scheduler.BukkitRunnable;

import me.ping.main.Main;

public class LagAPI {

	public static double Tps = 0.00;

	public static void IntelicLag() {
		new BukkitRunnable() {
			public void run() {
				Tps = Main.getTps();
				
			}
		}.runTaskTimer(Main.getPlugin(), 0, 20 * 300);
	}

}
