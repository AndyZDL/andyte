package com.andyzdl.ec.andyzdl_core.APP;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

import static com.andyzdl.ec.andyzdl_core.APP.ConfigType.ICON;

public class Configurator {
    private static final HashMap<String, Object> ANDYZDL_CONFIGS = new HashMap<>();
    private static ArrayList<IconFontDescriptor> iconFontDescriptors = new ArrayList<>();

    private Configurator() {
        ANDYZDL_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }


    final HashMap<String, Object> getAndyzdlConfigs() {
        return ANDYZDL_CONFIGS;
    }

    //静态内部类单例模式的初始化
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();

    }

    public final void configure() {
        initIcons();
        ANDYZDL_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    private void initIcons() {
        if (iconFontDescriptors.size() > 0) {
            Iconify.IconifyInitializer initializer = Iconify.with(iconFontDescriptors.get(0));
            for(int i=1; i<iconFontDescriptors.size(); i++){
                initializer.with(iconFontDescriptors.get(i));
            }

        }
    }

    public final Configurator withApiHost(String host) {
        ANDYZDL_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    public final  Configurator withIcon(IconFontDescriptor descriptor){
        iconFontDescriptors.add(descriptor);
        return this;
    }

    private void checkConfiguration() {
        boolean isReady = (boolean) ANDYZDL_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready, call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) ANDYZDL_CONFIGS.get(key.name());
    }


}
