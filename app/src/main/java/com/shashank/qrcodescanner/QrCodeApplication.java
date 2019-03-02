package com.shashank.qrcodescanner;

import android.app.Application;
import android.content.Context;

public class QrCodeApplication extends Application {

    public static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }
}
