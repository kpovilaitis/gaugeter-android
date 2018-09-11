package com.example.kestutis.cargauges;

import android.app.Application;
import android.content.Context;

import controllers.BluetoothController;

public class App extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        BluetoothController.setInstance(base);
    }
}
