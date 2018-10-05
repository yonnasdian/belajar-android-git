package com.example.abdalim.abdielalim;

import android.content.Intent;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    PreferenceHelper instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        instance = Preference.getInstance(getApplicationContext());
        int spalshscreen = 10;
        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!instance.isLogin) () {
                    startActivities(new Intent[SplashScreen.this, LoginActivity.class]);
                }
                else {
                    startActivities(new Intent[SplashScreen.this, MainActivity.class]);
            }
        }
        splashInterval);
    }
}
