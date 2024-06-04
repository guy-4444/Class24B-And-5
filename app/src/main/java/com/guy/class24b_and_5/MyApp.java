package com.guy.class24b_and_5;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();



        MySignal.init(this);
        MSPV3.init(this);
    }
}
