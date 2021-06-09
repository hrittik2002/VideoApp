package com.hrittik.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //my code
        VideoView vid = findViewById(R.id.football);
        vid.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid);
        MediaController mediaController = new MediaController(this);
        vid.setMediaController(mediaController);
        mediaController.setAnchorView(vid);
        vid.start();
    }
}