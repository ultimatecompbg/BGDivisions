package me.xrexyuwu.bgdivisions;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_8_R3.CommandExecute;

public class rewardsCommand extends CommandExecute implements CommandExecutor {
	Main plugin;

	public rewardsCommand(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lvl, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			Inventory rewardsGui = Bukkit.createInventory(player, 9, ChatColor.DARK_GREEN + "Division Rewards");

			ItemStack bronze = new ItemStack(Material.CHEST);
			ItemMeta bronze_meta = bronze.getItemMeta();
			bronze_meta
					.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&6Bronze&8)"));
			ArrayList<String> bronze_lore = new ArrayList<>();
			bronze_lore.add(" ");
			bronze_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			bronze_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Bronze"));
			bronze_lore.add(" ");
			bronze_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			bronze_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			bronze_meta.setLore(bronze_lore);
			bronze.setItemMeta(bronze_meta);

			ItemStack silver = new ItemStack(Material.CHEST);
			ItemMeta silver_meta = silver.getItemMeta();
			silver_meta
					.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&fSilver&8)"));
			ArrayList<String> silver_lore = new ArrayList<>();
			silver_lore.add(" ");
			silver_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			silver_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Silver"));
			silver_lore.add(" ");
			silver_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			silver_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			silver_meta.setLore(silver_lore);
			silver.setItemMeta(silver_meta);

			ItemStack gold = new ItemStack(Material.CHEST);
			ItemMeta gold_meta = gold.getItemMeta();
			gold_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&6Gold&8)"));
			ArrayList<String> gold_lore = new ArrayList<>();
			gold_lore.add(" ");
			gold_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			gold_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Gold"));
			gold_lore.add(" ");
			gold_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			gold_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			gold_meta.setLore(gold_lore);
			gold.setItemMeta(gold_meta);

			ItemStack platinum = new ItemStack(Material.CHEST);
			ItemMeta platinum_meta = platinum.getItemMeta();
			platinum_meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&3Platinum&8)"));
			ArrayList<String> platinum_lore = new ArrayList<>();
			platinum_lore.add(" ");
			platinum_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			platinum_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Platinum"));
			platinum_lore.add(" ");
			platinum_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			platinum_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			platinum_meta.setLore(platinum_lore);
			platinum.setItemMeta(platinum_meta);

			ItemStack champion = new ItemStack(Material.CHEST);
			ItemMeta champion_meta = platinum.getItemMeta();
			champion_meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&9Champion&8)"));
			ArrayList<String> champion_lore = new ArrayList<>();
			champion_lore.add(" ");
			champion_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			champion_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Champion"));
			champion_lore.add(" ");
			champion_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			champion_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			champion_meta.setLore(champion_lore);
			champion.setItemMeta(champion_meta);

			ItemStack challenger = new ItemStack(Material.CHEST);
			ItemMeta challenger_meta = platinum.getItemMeta();
			challenger_meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', "&b&lPROMOTION REWARD &8(&5Challenger&8)"));
			ArrayList<String> challenger_lore = new ArrayList<>();
			challenger_lore.add(" ");
			challenger_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&lВие спечелихте:"));
			challenger_lore.add(ChatColor.translateAlternateColorCodes('&', "&7* &ckit Challenger"));
			challenger_lore.add(" ");
			challenger_lore.add(
					ChatColor.translateAlternateColorCodes('&', "&a&lНатиснете предемта за да вземете наградата си! "));
			challenger_lore.add(ChatColor.translateAlternateColorCodes('&',
					"&8&oМоля изпразнете инвентара си преди да получите наградите си!"));
			challenger_meta.setLore(challenger_lore);
			challenger.setItemMeta(challenger_meta);
			if (plugin.bronzeReward.get(player.getName().toLowerCase())) {
				if (!plugin.bronzeClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(bronze);
				}
			}
			if (plugin.silverReward.get(player.getName().toLowerCase())) {
				if (!plugin.silverClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(silver);
				}
			}

			if (plugin.goldReward.get(player.getName().toLowerCase())) {
				if (!plugin.goldClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(gold);
				}
			}
			if (plugin.platinumReward.get(player.getName().toLowerCase())) {
				if (!plugin.platinumClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(platinum);
				}

			}
			if (plugin.championReward.get(player.getName().toLowerCase())) {
				if (!plugin.championClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(champion);
				}

			}
			if (plugin.challengerReward.get(player.getName().toLowerCase())) {
				if (!plugin.challengerClaimed.get(player.getName().toLowerCase())) {
					rewardsGui.addItem(challenger);
				}
			}

			player.openInventory(rewardsGui);
			return true;
		}

		return false;
	}
}
