package ytb.plugin.main.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class leave implements Listener{
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player joiner = event.getPlayer();
		event.setJoinMessage("");
		System.out.println("[DEBUG] " + joiner.getDisplayName() + "¤w¸gÂ÷¶}"); //Console Message
	}
}
