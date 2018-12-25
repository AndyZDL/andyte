package com.andyzdl.ec.andyzdl_core.app;

import android.content.Context;

import java.util.HashMap;

public final class AndyZDL {
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.CONFIG_READY.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getAndyzdlConfigs();
    }


}
