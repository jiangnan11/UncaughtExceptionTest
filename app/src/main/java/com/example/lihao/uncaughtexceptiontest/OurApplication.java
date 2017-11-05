package com.example.lihao.uncaughtexceptiontest;

import android.app.Application;

/**
 * Created by lihao on 2017/11/5.
 */

public class OurApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler handler = CrashHandler.getInstance();
        handler.init(getApplicationContext()); //在Appliction里面设置我们的异常处理器为UncaughtExceptionHandler处理器
//        LogcatHelper.getInstance(this).start();
    }
}
