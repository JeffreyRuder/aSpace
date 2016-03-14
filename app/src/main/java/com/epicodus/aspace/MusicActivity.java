package com.epicodus.aspace;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MusicActivity extends AppCompatActivity {
    private Button karmaChameleon;
    private Button backInTheUSSR;
    private Button yellowSubmarine;
    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        karmaChameleon = (Button) findViewById(R.id.karmaChameleon);
        karmaChameleon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri youTubeLink = Uri.parse("https://www.youtube.com/results?search_query=karma+chameleon");
                Intent intent = new Intent(Intent.ACTION_VIEW, youTubeLink);
                startActivity(intent);
            }
        });

        backInTheUSSR = (Button) findViewById(R.id.backInTheUSSR);
        backInTheUSSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri youTubeLink = Uri.parse("https://www.youtube.com/results?search_query=back+In+The+USSR");
                Intent intent = new Intent(Intent.ACTION_VIEW, youTubeLink);
                startActivity(intent);
            }
        });

        yellowSubmarine = (Button) findViewById(R.id.yellowSubmarine);
        yellowSubmarine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri youTubeLink = Uri.parse("https://www.youtube.com/results?search_query=yellow+submarine");
                Intent intent = new Intent(Intent.ACTION_VIEW, youTubeLink);
                startActivity(intent);
            }
        });

        homeButton = (Button) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlogActivity.this, UserHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
