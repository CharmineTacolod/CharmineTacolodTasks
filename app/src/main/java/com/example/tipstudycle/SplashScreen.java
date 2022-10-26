package com.example.tipstudycle;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        MediaPlayer tipstudy_sound;
        tipstudy_sound = MediaPlayer.create(SplashScreen.this,R.raw.tipstudy_sound);
        tipstudy_sound.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                tipstudy_sound.stop();
                finish();
            }
        }, 6000);
    }
}