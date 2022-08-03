package me.xrexyuwu.bgdivisions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class rewardsGuiManager implements Listener {
	Main plugin;

	public rewardsGuiManager(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	@EventHandler
	public void clickEvent(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "Division Rewards")) {
			// if (e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN
			// + "Division Rewards")) {
			e.setCancelled(true);
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&eBronze&8)"))) {
				plugin.bronzeReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Bronze", false);
				plugin.bronzeClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".BronzeClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/kit bronze" + player.getName());
				player.closeInventory();
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&fSilver&8)"))) {
				plugin.silverReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Silver", false);
				plugin.silverClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".SilverClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kit silver" + player.getName());
				player.closeInventory();
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&6Gold&8)"))) {
				plugin.goldReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Gold", false);
				plugin.goldClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".GoldClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kit gold" + player.getName());
				player.closeInventory();
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&3Platinum&8)"))) {
				plugin.platinumReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Platinum", false);
				plugin.platinumClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".PlatinumClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kit platinum" + player.getName());
				player.closeInventory();
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&9Champion&8)"))) {
				plugin.championReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Champion", false);
				plugin.championClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".ChampionClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kit champion" + player.getName());
				player.closeInventory();

			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&5Challenger&8)"))) {

				plugin.challengerReward.put(player.getName().toLowerCase(), false);
				plugin.getConfig().set(player.getName().toLowerCase() + ".Challenger", false);
				plugin.challengerClaimed.put(player.getName().toLowerCase(), true);
				plugin.getConfig().set(player.getName().toLowerCase() + ".ChallengerClaimed", true);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kit challenger" + player.getName());
				player.closeInventory();
			}
		}
	}

}
