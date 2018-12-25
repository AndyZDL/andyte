package com.andyzdl.ec;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.andyzdl.ec.andyzdl_core.delegates.AndyZDLDelegate;
import com.andyzdl.ec.databinding.ActivityMainBinding;

/**
 * File: AppDelegate.java
 * Author: AndyDongDong
 * Create: 2018/12/19 18:19
 * Desc: ${DESC}
 */
public class AppDelegate extends AndyZDLDelegate {
    @Override
    public int setlayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, ViewDataBinding binding) {
        ( (ActivityMainBinding) binding).datatest.setText("fdsafsdafsda");
    }
}
