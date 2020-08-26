package com.github.selott.tulip;

import com.github.selott.tulip.commands.TulipCommand;
import com.github.selott.tulip.modules.TulipModule;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Tulip extends JavaPlugin {

    @Inject private TulipCommand tulipCommand;

    private List<Plugin> transmitting;

    @Override
    public void onEnable() {
        this.transmitting = new ArrayList<>();

        TulipModule module = new TulipModule(this);
        Injector injector = module.createInjector();
        injector.injectMembers(this);


        this.getCommand("tulip").setExecutor(this.tulipCommand);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
