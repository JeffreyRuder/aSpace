package com.epicodus.aspace;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTitle = (TextView) findViewById(R.id.mainTitle);
        TextView aboutUs = (TextView) findViewById(R.id.aboutUs);

        Typeface amatic = Typeface.createFromAsset(getAssets(), "fonts/amatic.ttf");
        mainTitle.setTypeface(amatic);
        aboutUs.setTypeface(amatic);

        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
