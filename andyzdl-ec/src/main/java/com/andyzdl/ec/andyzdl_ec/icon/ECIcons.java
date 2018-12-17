package com.andyzdl.ec.andyzdl_ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * File: ECIcons.java
 * Author: AndyDongDong
 * Create: 2018/12/4 15:44
 * Desc: ${DESC}
 */
public enum ECIcons implements Icon {
    icon_home('\ue62a'),
    icon_category('\ue609'),
    icon_shopcar('\ue610'),
    icon_mine('\ue645');

    private char character;
    ECIcons (char character){
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
