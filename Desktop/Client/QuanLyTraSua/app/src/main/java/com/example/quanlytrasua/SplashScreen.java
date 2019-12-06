package com.example.quanlytrasua;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.splash_screen);
        imageView=findViewById(R.id.splash_logo);
        Animation animation= AnimationUtils.loadAnimation(SplashScreen.this, R.anim.transition_splash_screen);
        imageView.startAnimation(animation);

        final Intent intent=new Intent(this, MainActivity.class);
        Thread wait = new Thread(){
            public void run() {
                try {
                    sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                }
            }
        };
        wait.start();
    }
}
