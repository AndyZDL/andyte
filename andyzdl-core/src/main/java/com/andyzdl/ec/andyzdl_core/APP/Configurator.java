package com.andyzdl.ec.andyzdl_core.APP;

import java.util.HashMap;

public class Configurator {
    private static final HashMap<String, Object> ANDYZDL_CONFIGS = new HashMap<>();

    private Configurator() {
        ANDYZDL_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final HashMap<String, Object> getAndyzdlConfigs(){
        return ANDYZDL_CONFIGS;
    }

    //静态内部类单例模式的初始化
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();

    }

    public final void configure() {
        ANDYZDL_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }


}
