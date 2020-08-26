package com.github.selott.tulip;

import org.bukkit.ChatColor;

public enum TulipLogLevel {
    INFO(ChatColor.GREEN, "Info"),
    WARN(ChatColor.YELLOW, "Warning"),
    ERROR(ChatColor.RED, "Error"),
    FATAL(ChatColor.DARK_RED, "Critical"),
    DEBUG(ChatColor.GRAY, "Debug");

    private ChatColor color;
    private String text;

    TulipLogLevel(ChatColor chatColor, String text) {
        this.color = chatColor;
        this.text = text;
    }

    public ChatColor getColor() {
        return color;
    }

    public String getText() {
        return text;
    }

    public String getFormattedText() {
        return ChatColor.DARK_GRAY + "[" + getColor() + getText() + ChatColor.DARK_GRAY + "]";
    }

    public String getRawText() {
        return ChatColor.stripColor(getFormattedText());
    }
}
