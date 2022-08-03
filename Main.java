package me.xrexyuwu.bgdivisions;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	int kill_xp = 10;
	int death_penalty = 5;

	private divisionManager divManager = new divisionManager(this);

	protected HashMap<String, Integer> playerPoints = new HashMap<String, Integer>();
	protected HashMap<String, String> playerDiv = new HashMap<String, String>();
	protected HashMap<String, String> divColor = new HashMap<String, String>();

	protected HashMap<String, Boolean> bronzeReward = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> silverReward = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> goldReward = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> platinumReward = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> championReward = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> challengerReward = new HashMap<String, Boolean>();

	protected HashMap<String, Boolean> bronzeClaimed = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> silverClaimed = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> goldClaimed = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> platinumClaimed = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> championClaimed = new HashMap<String, Boolean>();
	protected HashMap<String, Boolean> challengerClaimed = new HashMap<String, Boolean>();

	@Override
	public void onEnable() {
		this.getCommand("division").setExecutor(new Commands(this));
		this.getCommand("rewards").setExecutor(new rewardsCommand(this));
		this.getCommand("dvinfo").setExecutor(new dvinfo(this));
		getServer().getPluginManager().registerEvents(new rewardsGuiManager(this), this);
		getServer().getPluginManager().registerEvents(this, this);
		saveConfig();
	}

	public void onDisable() {
		for (Player current : Bukkit.getServer().getOnlinePlayers()) {
			getConfig().set(current.getName().toLowerCase() + ".Points",
					playerPoints.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Division",
					playerDiv.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".DivColor",
					divColor.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Bronze",
					bronzeReward.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Silver",
					silverReward.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Gold", goldReward.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Platinum",
					platinumReward.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Champion",
					championReward.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".Challenger",
					challengerReward.get(current.getName().toLowerCase()));

			getConfig().set(current.getName().toLowerCase() + ".BronzeClaimed",
					bronzeClaimed.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".SilverClaimed",
					silverClaimed.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".GoldClaimed",
					goldClaimed.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".PlatinumClaimed",
					platinumClaimed.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".ChampionClaimed",
					championClaimed.get(current.getName().toLowerCase()));
			getConfig().set(current.getName().toLowerCase() + ".ChallengerClaimed",
					challengerClaimed.get(current.getName().toLowerCase()));
			saveConfig();
		}
	}

	public void onLoad() {
		for (Player p : getServer().getOnlinePlayers()) {
			Player player = p;
			String pName = player.getName();
			if (playerPoints.containsKey(pName.toLowerCase())) {
				playerPoints.putIfAbsent(pName.toLowerCase(), 0);
			} else {
				playerPoints.put(pName.toLowerCase(), 0);
			}
			if (playerDiv.containsKey(pName.toLowerCase())) {
				playerDiv.putIfAbsent(pName.toLowerCase(), "UnRanked");
			} else {
				playerDiv.put(pName.toLowerCase(), "UnRanked");
			}
			if (divColor.containsKey(pName.toLowerCase())) {
				divColor.putIfAbsent(pName.toLowerCase(), "&a");
			} else {
				divColor.put(pName.toLowerCase(), "&a");
			}
			if (bronzeReward.containsKey(pName.toLowerCase())) {
				bronzeReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				bronzeReward.put(pName.toLowerCase(), false);
			}
			if (silverReward.containsKey(pName.toLowerCase())) {
				silverReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				silverReward.put(pName.toLowerCase(), false);
			}
			if (goldReward.containsKey(pName.toLowerCase())) {
				goldReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				goldReward.put(pName.toLowerCase(), false);
			}
			if (platinumReward.containsKey(pName.toLowerCase())) {
				platinumReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				platinumReward.put(pName.toLowerCase(), false);
			}
			if (championReward.containsKey(pName.toLowerCase())) {
				championReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				championReward.put(pName.toLowerCase(), false);
			}
			if (challengerReward.containsKey(pName.toLowerCase())) {
				challengerReward.putIfAbsent(pName.toLowerCase(), false);
			} else {
				challengerReward.put(pName.toLowerCase(), false);
			}
			if (bronzeClaimed.containsKey(pName.toLowerCase())) {
				bronzeClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				bronzeClaimed.put(pName.toLowerCase(), false);
			}
			if (silverClaimed.containsKey(pName.toLowerCase())) {
				silverClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				silverClaimed.put(pName.toLowerCase(), false);
			}
			if (goldClaimed.containsKey(pName.toLowerCase())) {
				goldClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				goldClaimed.put(pName.toLowerCase(), false);
			}
			if (platinumClaimed.containsKey(pName.toLowerCase())) {
				platinumClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				platinumClaimed.put(pName.toLowerCase(), false);
			}
			if (championClaimed.containsKey(pName.toLowerCase())) {
				championClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				championClaimed.put(pName.toLowerCase(), false);
			}
			if (challengerClaimed.containsKey(pName.toLowerCase())) {
				challengerClaimed.putIfAbsent(pName.toLowerCase(), false);
			} else {
				challengerClaimed.put(pName.toLowerCase(), false);
			}

			playerPoints.put(pName.toLowerCase(), getConfig().getInt(pName.toLowerCase() + ".Points"));
			playerDiv.put(pName.toLowerCase(), getConfig().getString(pName.toLowerCase() + ".Division"));
			divColor.put(pName.toLowerCase(), getConfig().getString(pName.toLowerCase() + ".DivColor"));
			bronzeReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Bronze"));
			silverReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Silver"));
			goldReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Gold"));
			platinumReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Platinum"));
			championReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Champion"));
			challengerReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Challenger"));

			bronzeClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".BronzeClaimed"));
			silverClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".SilverClaimed"));
			goldClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".GoldClaimed"));
			platinumClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".PlatinumClaimed"));
			championClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".ChampionClaimed"));
			challengerClaimed.put(pName.toLowerCase(),
					getConfig().getBoolean(pName.toLowerCase() + ".ChallengerClaimed"));

			divManager.calcDiv(player);
		}
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		String pName = player.getName();
		if (playerPoints.containsKey(pName.toLowerCase())) {
			playerPoints.putIfAbsent(pName.toLowerCase(), 0);
		} else {
			playerPoints.put(pName.toLowerCase(), 0);
		}
		if (playerDiv.containsKey(pName.toLowerCase())) {
			playerDiv.putIfAbsent(pName.toLowerCase(), "UnRanked");
		} else {
			playerDiv.put(pName.toLowerCase(), "UnRanked");
		}
		if (divColor.containsKey(pName.toLowerCase())) {
			divColor.putIfAbsent(pName.toLowerCase(), "&a");
		} else {
			divColor.put(pName.toLowerCase(), "&a");
		}
		if (bronzeReward.containsKey(pName.toLowerCase())) {
			bronzeReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			bronzeReward.put(pName.toLowerCase(), false);
		}
		if (silverReward.containsKey(pName.toLowerCase())) {
			silverReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			silverReward.put(pName.toLowerCase(), false);
		}
		if (goldReward.containsKey(pName.toLowerCase())) {
			goldReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			goldReward.put(pName.toLowerCase(), false);
		}
		if (platinumReward.containsKey(pName.toLowerCase())) {
			platinumReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			platinumReward.put(pName.toLowerCase(), false);
		}
		if (championReward.containsKey(pName.toLowerCase())) {
			championReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			championReward.put(pName.toLowerCase(), false);
		}
		if (challengerReward.containsKey(pName.toLowerCase())) {
			challengerReward.putIfAbsent(pName.toLowerCase(), false);
		} else {
			challengerReward.put(pName.toLowerCase(), false);
		}
		if (bronzeClaimed.containsKey(pName.toLowerCase())) {
			bronzeClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			bronzeClaimed.put(pName.toLowerCase(), false);
		}
		if (silverClaimed.containsKey(pName.toLowerCase())) {
			silverClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			silverClaimed.put(pName.toLowerCase(), false);
		}
		if (goldClaimed.containsKey(pName.toLowerCase())) {
			goldClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			goldClaimed.put(pName.toLowerCase(), false);
		}
		if (platinumClaimed.containsKey(pName.toLowerCase())) {
			platinumClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			platinumClaimed.put(pName.toLowerCase(), false);
		}
		if (championClaimed.containsKey(pName.toLowerCase())) {
			championClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			championClaimed.put(pName.toLowerCase(), false);
		}
		if (challengerClaimed.containsKey(pName.toLowerCase())) {
			challengerClaimed.putIfAbsent(pName.toLowerCase(), false);
		} else {
			challengerClaimed.put(pName.toLowerCase(), false);
		}
		playerPoints.put(pName.toLowerCase(), getConfig().getInt(pName.toLowerCase() + ".Points"));
		playerDiv.put(pName.toLowerCase(), getConfig().getString(pName.toLowerCase() + ".Division"));
		divColor.put(pName.toLowerCase(), getConfig().getString(pName.toLowerCase() + ".DivColor"));
		bronzeReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Bronze"));
		silverReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Silver"));
		goldReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Gold"));
		platinumReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Platinum"));
		championReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Champion"));
		challengerReward.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".Challenger"));

		bronzeClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".BronzeClaimed"));
		silverClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".SilverClaimed"));
		goldClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".GoldClaimed"));
		platinumClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".PlatinumClaimed"));
		championClaimed.put(pName.toLowerCase(), getConfig().getBoolean(pName.toLowerCase() + ".ChampionClaimed"));
		challengerClaimed.put(pName.toLowerCase(),
				getConfig().getBoolean(pName.toLowerCase() + ".ChallengerClaimed"));
		divManager.calcDiv(player);
	}

	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		String pName = player.getName();
		if (player.getKiller() instanceof Player) {
			Player killer = player.getKiller();
			String pNameKiller = killer.getName();
			if (killer.getName().equalsIgnoreCase(player.toString())) {
				killer.sendMessage(ChatColor.RED + "Може би другият път..");
			} else {

				playerPoints.put(pNameKiller.toLowerCase(), playerPoints.get(pNameKiller.toLowerCase()) + kill_xp);
				getConfig().set(pNameKiller.toLowerCase() + ".Points", playerPoints.get(pNameKiller.toLowerCase()));
				if (playerPoints.get(pName.toLowerCase()).intValue() >= death_penalty) {
					playerPoints.put(pName.toLowerCase(), playerPoints.get(pName.toLowerCase()) - death_penalty);
					getConfig().set(pName.toLowerCase() + ".Points", playerPoints.get(pName.toLowerCase()));
				}
			}
			divManager.calcDiv(player);
			divManager.calcDiv(killer);

			saveConfig();
		}
	}
}
