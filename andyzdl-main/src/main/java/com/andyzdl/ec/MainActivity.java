package com.andyzdl.ec;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.andyzdl.ec.andyzdl_core.activitys.ProxyActivity;
import com.andyzdl.ec.andyzdl_core.app.AndyZDL;
import com.andyzdl.ec.andyzdl_core.delegates.AndyZDLDelegate;
import com.andyzdl.ec.andyzdl_ec.icon.FontECModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import me.yokeyword.fragmentation.SupportActivity;

/**
*@Description: 电商框架入口
*@File: MainActivity.java
*@Author: AndyDongDong
*@Time: 2018/11/2 17:39
*
*/
public class MainActivity extends ProxyActivity {

    @Override
    public AndyZDLDelegate setRootDelegate() {
        return new AppDelegate();
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndyZDL.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontECModule())
                .withApiHost("www.baidu.com")
                .configure();
    }*/
}
