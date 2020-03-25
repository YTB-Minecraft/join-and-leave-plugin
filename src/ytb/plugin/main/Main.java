package ytb.plugin.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ytb.plugin.main.Events.join;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("YTB的官方插件已經啟用!");
		getServer().getPluginManager().registerEvents(new join(), this);
	}
}
