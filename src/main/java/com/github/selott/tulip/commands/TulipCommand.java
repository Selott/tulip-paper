package com.github.selott.tulip.commands;

import com.github.selott.tulip.Tulip;
import com.google.inject.Inject;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TulipCommand implements CommandExecutor {

    @Inject
    private Tulip plugin;

    private String gamePrefix = ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "TULIP" + ChatColor.DARK_GRAY + "] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;
            if(player.hasPermission("tulip.access")) {

            }

        } else {
            sender.sendMessage("[TULIP] Consoles only have limited access to Tulip. (-show_ver)");
            sender.sendMessage("[TULIP] TULIP - Totally Useful and Levelheaded Information Processor");
            sender.sendMessage("[TULIP] Author: " + plugin.getDescription().getAuthors().get(0) + "; Version: " + plugin.getDescription().getVersion());
        }

        return true;
    }
}
