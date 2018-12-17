package com.andyzdl.ec.andyzdl_ec.icon;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * File: FontECModule.java
 * Author: AndyDongDong
 * Create: 2018/12/4 15:38
 * Desc: ${DESC}
 */
public class FontECModule implements IconFontDescriptor {
    @Override
    public String ttfFileName() {
        return "iconfont.ttf";
    }

    @Override
    public Icon[] characters() {
        return ECIcons.values();
    }
}
