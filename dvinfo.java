package me.xrexyuwu.bgdivisions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.CommandExecute;

public class dvinfo extends CommandExecute implements CommandExecutor {

	Main plugin;

	public dvinfo(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage(" ");
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&l&m=======&f &2&lDivisionHelp&f &7&l&m======="));
			player.sendMessage(" ");
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"&a/division username &7- ����� ������ ��� �� ���� ����� ����������."));
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"&a/rewards &7- ���������� ������� �� ����� �������� �������."));
			player.sendMessage(" ");
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',
					"&c&o������ �� �������� ������ ���������� � ������ ������� ������."));
			return true;
		}
		return false;
	}

}
