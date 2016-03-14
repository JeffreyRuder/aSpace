package com.epicodus.aspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserHomeActivity extends AppCompatActivity {
    private Button blogButton;
    private Button friendsButton;
    private Button musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        blogButton = (Button) findViewById(R.id.blogButton);
        blogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeActivity.this, BlogActivity.class);
                startActivity(intent);
            }
        });

        friendsButton = (Button) findViewById(R.id.friendsButton);
        friendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeActivity.this, FriendsActivity.class);
                startActivity(intent);
            }
        });

        musicButton = (Button) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
    }
}
