package com.example.vignesh_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubCategory5 extends AppCompatActivity {
    public Button button1;
    MediaPlayer player;
    //play music
    public void play(View view){
        player.start();
    }
    //pause
    public void pause(View view){
        player.pause();
    }
    //stop
    public void stop(View view){
        player.stop();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category5);
        player = MediaPlayer.create(this,R.raw.harmoniumnew);
        button1=(Button) findViewById(R.id.button7);

        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://simple.wikipedia.org/wiki/Harmonium";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        }));

    }
}