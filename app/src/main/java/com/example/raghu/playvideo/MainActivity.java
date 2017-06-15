package com.example.raghu.playvideo;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView =(VideoView)findViewById(R.id.videoView1);

        String uripath="android.resource://"+getPackageName()+"/"+R.raw.sample;

        videoView.setVideoURI(Uri.parse(uripath));
        videoView.requestFocus();
        videoView.start();
    }
}
