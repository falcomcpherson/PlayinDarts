package com.example.android.playindarts;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button goToRules;
    Button goToScoreTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        goToRules = findViewById(R.id.goToRules);
        goToRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRules = new Intent(MainActivity.this, GameRules.class);
                startActivity(goToRules);
            }
        });

        goToScoreTracker = findViewById(R.id.goToScoreTracker);
        goToScoreTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToScoreTracker = new Intent(MainActivity.this, ScoreTracker.class);
                startActivity(goToScoreTracker);
            }
        });
    }}