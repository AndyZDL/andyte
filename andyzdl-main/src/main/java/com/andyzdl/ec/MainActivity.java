package com.andyzdl.ec;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.andyzdl.ec.andyzdl_core.APP.AndyZDL;
import com.andyzdl.ec.andyzdl_ec.icon.FontECModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
*@Description: 电商框架入口
*@File: MainActivity.java
*@Author: AndyDongDong
*@Time: 2018/11/2 17:39
*
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndyZDL.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontECModule())
                .withApiHost("www.baidu.com")
                .configure();        
    }
}
