package ytb.plugin.main.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class join implements Listener{
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player joiner = event.getPlayer();
		event.setJoinMessage("");
		joiner.sendMessage(ChatColor.YELLOW + "YTB Minecraft >>�w��^��!" + joiner.getDisplayName() + "!"); //���a�[�J�T��
		System.out.println("[DEBUG] " + joiner.getDisplayName() + "�w�g�[�J"); //Console Message
	}
}
