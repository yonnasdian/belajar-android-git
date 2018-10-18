package com.example.belajarandroidgit.belajarandroidgit;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.example.rajapulau.projectview.room.AppDatabase;

public class AppApplication extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();
    }

}
