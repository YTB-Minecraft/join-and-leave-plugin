package ytb.plugin.main.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import ytb.plugin.main.Main;

public class join implements Listener{
	private Plugin plugin = Main.getPlugin(Main.class);
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player joiner = event.getPlayer();
		event.setJoinMessage("");
		joiner.sendMessage(ChatColor.YELLOW + "YTB Minecraft >>歡迎回來!" + joiner.getDisplayName() + "!"); //玩家加入訊息
		System.out.println("[DEBUG] " + joiner.getDisplayName() + "已經加入"); //Console Message
		String joinmsg = plugin.getConfig().get("joinmsg").toString();
	}
}
