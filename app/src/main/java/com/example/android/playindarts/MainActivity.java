package com.example.android.playindarts;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String player120 = "";
    String player119 = "";
    String player118 = "";
    String player117 = "";
    String player116 = "";
    String player115 = "";
    String player1bull = "";
    String player220 = "";
    String player219 = "";
    String player218 = "";
    String player217 = "";
    String player216 = "";
    String player215 = "";
    String player2bull = "";

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void player1_20(View view) {
        player120 = player120 + "X";
        switch (player120) {
            case "XXXX":
                player120 = "XXX";
                scoreTeamA = scoreTeamA + 20;
                break;
        }
        displayPlayer120 (player120);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer120 (String player120) {
        TextView textView = findViewById(R.id.player1_20);
        textView.setText (player120);
    }

    public void player1_19 (View view) {
        player119 = player119 + "X";
        switch (player119) {
            case "XXXX":
                player119 = "XXX";
                scoreTeamA = scoreTeamA + 19;
                break;
        }
        displayPlayer119 (player119);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer119 (String player119) {
        TextView textView = findViewById(R.id.player1_19);
        textView.setText (player119);
    }

    public void player1_18 (View view) {
        player118 = player118 + "X";
        switch (player118) {
            case "XXXX":
                player118 = "XXX";
                scoreTeamA = scoreTeamA + 18;
                break;
        }
        displayPlayer118 (player118);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer118 (String player118) {
        TextView textView = findViewById(R.id.player1_18);
        textView.setText (player118);
    }

    public void player1_17 (View view) {
        player117 = player117 + "X";
        switch (player117) {
            case "XXXX":
                player117 = "XXX";
                scoreTeamA = scoreTeamA + 17;
                break;
        }
        displayPlayer117 (player117);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer117 (String player117) {
        TextView textView = findViewById(R.id.player1_17);
        textView.setText (player117);
    }

    public void player1_16 (View view) {
        player116 = player116 + "X";
        switch (player116) {
            case "XXXX":
                player116 = "XXX";
                scoreTeamA = scoreTeamA + 16;
                break;
        }
        displayPlayer116 (player116);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer116 (String player116) {
        TextView textView = findViewById(R.id.player1_16);
        textView.setText (player116);
    }

    public void player1_15 (View view) {
        player115 = player115 + "X";
        switch (player115) {
            case "XXXX":
                player115 = "XXX";
                scoreTeamA = scoreTeamA + 15;
                break;
        }
        displayPlayer115 (player115);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer115 (String player115) {
        TextView textView = findViewById(R.id.player1_15);
        textView.setText (player115);
    }

    public void player1_bull (View view) {
        player1bull = player1bull + "X";
        switch (player1bull) {
            case "XXXX":
                player1bull = "XXX";
                scoreTeamA = scoreTeamA + 25;
                break;
        }
        displayPlayer1bull (player1bull);
        displayForTeamA(scoreTeamA);
    }

    private void displayPlayer1bull (String player1bull) {
        TextView textView = findViewById(R.id.player1_bull);
        textView.setText (player1bull);
    }


    public void player2_20 (View view) {
        player220 = player220 + "X";
        switch (player220) {
            case "XXXX":
                player220 = "XXX";
                scoreTeamB = scoreTeamB + 20;
                break;
        }
        displayPlayer220 (player220);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer220 (String player220) {
        TextView textView = findViewById(R.id.player2_20);
        textView.setText (player220);
    }

    public void player2_19 (View view) {
        player219 = player219 + "X";
        switch (player219) {
            case "XXXX":
                player219 = "XXX";
                scoreTeamB = scoreTeamB + 19;
                break;
        }
        displayPlayer219 (player219);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer219 (String player219) {
        TextView textView = findViewById(R.id.player2_19);
        textView.setText (player219);
    }

    public void player2_18 (View view) {
        player218 = player218 + "X";
        switch (player218) {
            case "XXXX":
                player218 = "XXX";
                scoreTeamB = scoreTeamB + 18;
                break;
        }
        displayPlayer218 (player218);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer218 (String player218) {
        TextView textView = findViewById(R.id.player2_18);
        textView.setText (player218);
    }

    public void player2_17 (View view) {
        player217 = player217 + "X";
        switch (player217) {
            case "XXXX":
                player217 = "XXX";
                scoreTeamB = scoreTeamB + 17;
                break;
        }
        displayPlayer217 (player217);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer217 (String player217) {
        TextView textView = findViewById(R.id.player2_17);
        textView.setText (player217);
    }

    public void player2_16 (View view) {
        player216 = player216 + "X";
        switch (player216) {
            case "XXXX":
                player216 = "XXX";
                scoreTeamB = scoreTeamB + 16;
                break;
        }
        displayPlayer216 (player216);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer216 (String player216) {
        TextView textView = findViewById(R.id.player2_16);
        textView.setText (player216);
    }

    public void player2_15 (View view) {
        player215 = player215 + "X";
        switch (player215) {
            case "XXXX":
                player215 = "XXX";
                scoreTeamB = scoreTeamB + 15;
                break;
        }
        displayPlayer215 (player215);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer215 (String player215) {
        TextView textView = findViewById(R.id.player2_15);
        textView.setText (player215);
    }

    public void player2_bull (View view) {
        player2bull = player2bull + "X";
        switch (player2bull) {
            case "XXXX":
                player2bull = "XXX";
                scoreTeamB = scoreTeamB + 25;
                break;
        }
        displayPlayer2bull (player2bull);
        displayForTeamB(scoreTeamB);
    }

    private void displayPlayer2bull (String player2bull) {
        TextView textView = findViewById(R.id.player2_bull);
        textView.setText (player2bull);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void resetScores(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        player120 = "";
        player119 = "";
        player118 = "";
        player117 = "";
        player116 = "";
        player115 = "";
        player1bull = "";
        player220 = "";
        player219 = "";
        player218 = "";
        player217 = "";
        player216 = "";
        player215 = "";
        player2bull = "";
        displayPlayer120 (player120);
        displayPlayer119 (player119);
        displayPlayer118 (player118);
        displayPlayer117 (player117);
        displayPlayer116 (player116);
        displayPlayer115 (player115);
        displayPlayer1bull (player1bull);
        displayPlayer220 (player220);
        displayPlayer219 (player219);
        displayPlayer218 (player218);
        displayPlayer217 (player217);
        displayPlayer216 (player216);
        displayPlayer215 (player215);
        displayPlayer2bull (player2bull);
    }
}
