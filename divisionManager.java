package me.xrexyuwu.bgdivisions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class divisionManager {
	Main plugin;

	public divisionManager(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	boolean broadcasted = false;

	public void calcDiv(Player player) {
		String pName = player.getName();
		if (plugin.playerPoints.get(pName.toLowerCase()) <= 49) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("bronze v")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lDEMOTION &8[&cBronze V &f> &aUnRanked&8]"));
				plugin.playerDiv.put(pName.toLowerCase(), "UnRaked");
				plugin.getConfig().set(pName.toLowerCase() + ".Division", "UnRanked");
				plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&a");
			}
			plugin.playerDiv.put(pName.toLowerCase(), "UnRanked");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "UnRanked");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&a");
			plugin.divColor.put(pName.toLowerCase(), "&a");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()).intValue() >= 50
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 99) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("UnRanked")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lPROMOTION &8[&cUnRanked &f> &aBronze V&8]"));
				plugin.bronzeReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Bronze", true);
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cBronze IV &f> &aBronze V&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Bronze V");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Bronze V");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()).intValue() >= 100
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 149) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze V")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cBronze V &f> &aBronze IV&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cBronze III &f> &aBronze IV&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Bronze IV");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Bronze IV");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()).intValue() >= 150
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 299) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cBronze IV &f> &aBronze III&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cBronze II &f> &aBronze III&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Bronze III");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Bronze III");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()).intValue() >= 300
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 419) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze III")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cBronze III &f> &aBronze II&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cBronze I &f> &aBronze II&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Bronze II");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Bronze II");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 420
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 649) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze II")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cBronze II &f> &aBronze I&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver V")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lDEMOTION &8[&cSilver V &f> &aBronze I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Bronze I");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Bronze I");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 650
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 789) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Bronze I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lPROMOTION &8[&cBronze I &f> &aSilver V&8]"));
				plugin.silverReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Silver", true);
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cSilver IV &f> &aSilver V&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Silver V");
			plugin.divColor.put(pName.toLowerCase(), "&f");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Silver V");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&f");
		}
		if (plugin.playerPoints.get(pName.toLowerCase())		 >= 790
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 849) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver V")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cSilver V &f> &aSilver IV&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cSilver III &f> &aSilver IV&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Silver IV");
			plugin.divColor.put(pName.toLowerCase(), "&f");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Silver IV");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&f");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 850
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 989) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cSilver IV &f> &aSilver III&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cSilver II &f> &aSilver III&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Silver III");
			plugin.divColor.put(pName.toLowerCase(), "&f");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Silver III");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&f");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 990
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 1199) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver III")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cSilver III &f> &aSilver II&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cSilver I &f> &aSilver II&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Silver II");
			plugin.divColor.put(pName.toLowerCase(), "&f");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Silver II");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&f");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 1200
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 1549) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver II")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cSilver II &f> &aSilver I&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold V")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lDEMOTION &8[&cGold V &f> &aSilver I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Silver I");
			plugin.divColor.put(pName.toLowerCase(), "&f");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Silver I");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&f");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 1550
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 1849) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Silver I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lPROMOTION &8[&cSilver I &f> &aGold V&8]"));
				plugin.goldReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Gold", true);
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cGold IV &f> &aGold V&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Gold V");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Gold V");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 1850
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 1949) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold V")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cGold V &f> &aGold IV&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold III")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cGold III &f> &aGold IV&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Gold IV");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Gold IV");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 1950
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 2649) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cGold IV &f> &aGold III&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold II")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cGold II &f> &aGold III&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Gold III");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Gold III");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 2650
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 3499) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold III")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cGold III &f> &aGold II&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lRANK DOWN &8[&cGold I &f> &aGold II&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Gold II");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Gold II");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 3500
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 4199) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold II")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lRank UP &8[&cGold II &f> &aGold I&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum IV")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c&lDEMOTION &8[&cPlatinum IV &f> &aGold I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Gold I");
			plugin.divColor.put(pName.toLowerCase(), "&6");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Gold I");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&6");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 4200
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 5599) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Gold I")) {
				player.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&a&lPROMOTION &8[&cGold I &f> &aPlatinum IV&8]"));
				plugin.platinumReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Platinum", true);
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cPlatinum III &f> &aPlatinum IV&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Platinum IV");
			plugin.divColor.put(pName.toLowerCase(), "&3");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Platinum IV");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&3");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 5600
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 5799) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum IV")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lRank UP &8[&cPlatinum IV &f> &aPlatinum III&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cPlatinum II &f> &aPlatinum III&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Platinum III");
			plugin.divColor.put(pName.toLowerCase(), "&3");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Platinum III");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&3");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 5800
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 5999) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lRank UP &8[&cPlatinum III &f> &aPlatinum II&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum I")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cPlatinum I &f> &aPlatinum II&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Platinum II");
			plugin.divColor.put(pName.toLowerCase(), "&3");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Platinum II");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&3");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 6000
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 7499) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lRank UP &8[&cPlatinum II &f> &aPlatinum I&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lDEMOTION &8[&cChampion III &f> &aPlatinum I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Platinum I");
			plugin.divColor.put(pName.toLowerCase(), "&3");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Platinum I");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&3");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 7500
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 9499) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Platinum I")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lPROMOTION &8[&cPlatinum I &f> &aChampion III&8]"));
				plugin.championReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Champion", true);
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cChampion II &f> &aChampion III&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Champion III");
			plugin.divColor.put(pName.toLowerCase(), "&9");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Champion III");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&9");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 9500
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 14999) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion III")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lRank UP &8[&cChampion III &f> &aChampion II&8]"));
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion I")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lRANK DOWN &8[&cChampion I &f> &aChampion II&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Champion II");
			plugin.divColor.put(pName.toLowerCase(), "&9");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Champion II");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&9");
		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 15000
				&& plugin.playerPoints.get(pName.toLowerCase()).intValue() <= 19999) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion II")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lRank UP &8[&cChampion II &f> &aChampion I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Champion I");
			plugin.divColor.put(pName.toLowerCase(), "&9");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Champion I");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&9");

		}
		if (plugin.playerPoints.get(pName.toLowerCase()) >= 20000) {
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Champion I")) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&a&lPROMOTION &8[&cChampion I &f> &aChallenger&8]"));
				plugin.challengerReward.put(pName.toLowerCase(), true);
				plugin.getConfig().set(pName.toLowerCase() + ".Challenger", true);
				if (!broadcasted) {
					Bukkit.broadcastMessage(player.getName() + "&f&lBulgaria&9&lCraft&7>> &7Woww! &c" + player.getName()
							+ "&7 вдигна &5Challenger&7, пази се от него!");
					broadcasted = true;
				}
			}
			if (plugin.playerDiv.get(pName.toLowerCase()).equalsIgnoreCase("Challenger")
					|| plugin.playerPoints.get(pName.toLowerCase()) <= 19999) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&c&lDEMOTION &8[&cChallenger &f> &aChampion I&8]"));
			}
			plugin.playerDiv.put(pName.toLowerCase(), "Challenger");
			plugin.divColor.put(pName.toLowerCase(), "&5");
			plugin.getConfig().set(pName.toLowerCase() + ".Division", "Challenger");
			plugin.getConfig().set(pName.toLowerCase() + ".DivColor", "&5");
		}
	}
}
