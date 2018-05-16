package com.example.android.playindarts;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameRules extends AppCompatActivity {

    Button goToScoreTracker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_rules);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        goToScoreTracker = findViewById(R.id.goToScoreTracker);
        goToScoreTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToScoreTracker = new Intent(GameRules.this, ScoreTracker.class);
                startActivity(goToScoreTracker);
            }
       });
    }}

