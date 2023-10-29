package com.example.archivomultimediadrive;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videito = findViewById(R.id.videoView);
        String videoUrl = "https://drive.google.com/file/d/1Cp61L8lkApkgHK6GMV5XcZl7FZ7cAJei/view";
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videito);
        videito.setMediaController(mediaController);

        videito.setVideoURI(Uri.parse(videoUrl));
        videito.start();
    }
}