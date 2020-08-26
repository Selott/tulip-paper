package com.github.selott.tulip.modules;

import com.github.selott.tulip.Tulip;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TulipModule extends AbstractModule {

    private final Tulip plugin;

    public TulipModule(Tulip plugin) {
        this.plugin = plugin;
    }

    public Injector createInjector() {
        return Guice.createInjector(this);
    }

    @Override
    protected void configure() {
        this.bind(Tulip.class).toInstance(this.plugin);
    }
}
