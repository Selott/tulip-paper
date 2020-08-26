package com.github.selott.tulip;

import org.bukkit.ChatColor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TulipLogRecord {

    private TulipLogLevel level;
    private String message;
    private long time;

    public TulipLogRecord(TulipLogLevel level, String message, long time) {
        this.level = level;
        this.message = message;
        this.time = time;
    }

    public String getGameMessage() {
        return level.getFormattedText() + " §8[§f" + new SimpleDateFormat("HH:mm:ss.SSS").format(getTimeAsDate())+ "§8] §7" + getMessage();
    }

    public String getLogMessage() {
        return ChatColor.stripColor(getGameMessage());
    }

    public long getTimeAsLong() {
        return time;
    }

    public String getTimeAsRawDate() {
        return new SimpleDateFormat("MMM dd, yyyy; HH:mm:ss.SSS").format(getTimeAsDate());
    }

    public Date getTimeAsDate() {
        return new Date(time);
    }

    public String getMessage() {
        return message;
    }

    public TulipLogLevel getLevel() {
        return level;
    }
}
