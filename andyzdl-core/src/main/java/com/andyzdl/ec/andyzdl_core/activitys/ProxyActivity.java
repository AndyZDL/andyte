package com.andyzdl.ec.andyzdl_core.activitys;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ContentFrameLayout;
import com.andyzdl.ec.andyzdl_core.R;
import com.andyzdl.ec.andyzdl_core.delegates.AndyZDLDelegate;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * File: ProxyActivity.java
 * Author: AndyDongDong
 * Create: 2018/12/19 16:41
 * Desc: ${DESC}
 */
public abstract class ProxyActivity extends SupportActivity {
    public abstract AndyZDLDelegate setRootDelegate();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContainer(savedInstanceState);
    }

    @SuppressLint("RestrictedApi")
    private void initContainer(@Nullable Bundle savedInstanceState){
       final ContentFrameLayout contentFrameLayout = new ContentFrameLayout(this);
       contentFrameLayout.setId(R.id.delegate_container);
       setContentView(contentFrameLayout);
        if (savedInstanceState == null) {
            loadRootFragment(R.id.delegate_container, setRootDelegate());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
        System.runFinalization();
    }
}
