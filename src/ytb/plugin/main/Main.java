package ytb.plugin.main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ytb.plugin.main.Events.join;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("YTB���x�贡��w�g�ҥ�!");
		getServer().getPluginManager().registerEvents(new join(), this);
	}
}
