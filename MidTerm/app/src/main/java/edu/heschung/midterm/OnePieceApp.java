package edu.heschung.midterm;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class OnePieceApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
