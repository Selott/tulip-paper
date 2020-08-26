package com.github.selott.tulip;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TulipLogger {

    private static List<TulipLogRecord> logRecords = new ArrayList<>();


    private TulipPrinter printer;

    public TulipLogger() {}

    public TulipLogRecord log(TulipLogLevel level, String message, long time) {
        TulipLogRecord record = new TulipLogRecord(level, message, time);

        /*
        TODO: Enable printer output
         */
        Bukkit.getOnlinePlayers().stream().filter(p -> p.hasPermission("tulip.access")).forEach(player -> player.sendMessage(record.getGameMessage()));

        return record;
    }

    public static List<TulipLogRecord> getLogRecords() {
        return logRecords;
    }
}
