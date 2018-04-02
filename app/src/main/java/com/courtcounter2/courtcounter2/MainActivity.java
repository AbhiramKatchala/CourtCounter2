package com.courtcounter2.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayScoreTeamA(){
        TextView totalScoreTeamA = (TextView) findViewById(R.id.team_a_score);
        totalScoreTeamA.setText("" + scoreTeamA);
    }

    public void threePoints(View v){
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA();
    }
    public void twoPoints(View v){
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA();
    }
    public void freeThrow(View v){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA();
    }

    public void displayScoreTeamB(){
        TextView totalScoreTeamB = (TextView) findViewById(R.id.team_b_score);
        totalScoreTeamB.setText("" + scoreTeamB);
    }

    public void threePointsB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB();
    }
    public void twoPointsB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB();
    }
    public void freeThrowB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB();
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }
}
