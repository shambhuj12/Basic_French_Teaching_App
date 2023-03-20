package com.example.basicfrenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Saythecolor(View view){
        // we are passing View view since we are using the .onclick() methods for the buttons

        Button clicked_btn = (Button) view;
        // Instead of declaring separate buttons everytime we are defining it once only (common for all)

        // First parameter is the context,second is the button that we pressed,third is flode,then we getthepackagename
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                getResources().getIdentifier(
                        clicked_btn.getTag().toString(),
                        "raw",
                        getPackageName()
                )
        );
        mediaPlayer.start();

    }
}