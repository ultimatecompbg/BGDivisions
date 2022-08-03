package me.xrexyuwu.bgdivisions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.CommandExecute;

public class Commands extends CommandExecute implements CommandExecutor {

	Main plugin;

	public Commands(Main passedPlugin) {
		this.plugin = passedPlugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		Player player = (Player) sender;
		String pName = player.getName();
		if (sender instanceof Player) {
			if (args.length == 0) {
				sender.sendMessage(
						ChatColor.translateAlternateColorCodes('&', "&c" + sender.getName() + "&7's Rankings\n")
								+ "\n \n" + ChatColor.GRAY + "\nTotal Points: " + ChatColor.YELLOW
								+ plugin.playerPoints.get(pName.toLowerCase()) + "\n" + ChatColor.GRAY
								+ "Division: "
								+ ChatColor.translateAlternateColorCodes('&', plugin.divColor.get(pName.toLowerCase() + plugin.playerDiv.get(pName.toLowerCase()))));
				return true;
			} else {
				if (Bukkit.getServer().getPlayer(args[0]) != null) {
					Player player_arg = player.getServer().getPlayer(args[0]);
					String pSName = player_arg.getName();

					sender.sendMessage(
							ChatColor.translateAlternateColorCodes('&',
									"&c" + player_arg.getName() + "&7's Rankings\n\n") + "\n \n" + ChatColor.GRAY
									+ "\nTotal Points: " + ChatColor.YELLOW
									+ plugin.playerPoints.get(pSName.toLowerCase()) + "\n"
									+ ChatColor.GRAY + "Division: "
									+ ChatColor.translateAlternateColorCodes('&',
											plugin.divColor.get(pSName.toLowerCase())
													+ plugin.playerDiv.get(pSName.toLowerCase())));
					return true;
				} else {
					sender.sendMessage(ChatColor.RED + "Този играч не е онлайн или не съществува!");
					return true;
				}
			}

		} else {
			System.out.print("ONLY PLAYERS CAN EXECUTE COMMANDS");
			return true;
		}
	}
}
