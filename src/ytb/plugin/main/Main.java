package ytb.plugin.main;

import org.bukkit.plugin.java.JavaPlugin;

import ytb.plugin.main.Events.join;
import ytb.plugin.main.Events.leave;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("YTB的官方插件已經啟用!");
		getServer().getPluginManager().registerEvents(new join(), this);
		getServer().getPluginManager().registerEvents(new leave(), this);
		loadConfig();
	}
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}
}
