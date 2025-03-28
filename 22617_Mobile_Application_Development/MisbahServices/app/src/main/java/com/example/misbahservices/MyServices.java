package com.example.misbahservices;
        import android.app.Service;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.IBinder;
public class MyServices extends Service {
    MediaPlayer mediaPlayer;
    public IBinder onBind(Intent intent){
        return null;
    }
    @Override
    public void onStart(Intent intent, int startId) {
        mediaPlayer = MediaPlayer.create(this,R.raw.abc);
        mediaPlayer.start();
        super.onStart(intent,startId);
    }
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }
}


