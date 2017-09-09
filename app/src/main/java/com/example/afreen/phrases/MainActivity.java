package com.example.afreen.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view)
    {
        int id=view.getId();//id garbage value that the system assigned to the buttons
        String ourId="";
        ourId=view.getResources().getResourceEntryName(id);

        int resourceId=getResources().getIdentifier(ourId,"raw","com.example.afreen.phrases");

        MediaPlayer mediaPlayer=MediaPlayer.create(this,resourceId);
        mediaPlayer.start();

        Log.i("button tapped", ourId);
    }
}
