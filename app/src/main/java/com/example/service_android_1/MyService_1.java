package com.example.service_android_1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyService_1 extends Service {
    private MediaPlayer player;
    public int onStartCommand(Intent intent, int flags,int startId)
    {
        player=MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;  // tells the system to create a fresh copy of the service
    }
    public void onDestroy()
    {
        super.onDestroy();
    }





    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
