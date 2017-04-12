package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int scoreTeam1;
    int scoreTeam2;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam1(0);
        displayForTeam2(0);
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        super.onRestoreInstanceState(savedState);
    }

    /**
     * Increase the score for Team 1 by 5 points for a try.
     */
    public void tryT1(View v) {
        scoreTeam1 = scoreTeam1 + 5;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 2 points for a sucessful conversion.
     */
    public void conT1(View v) {
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 3 points for a drop goal.
     */
    public void dropGoalT1(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 3 points for a Penalty Kick.
     */
    public void penaltyT1(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team 2 by 5 points for a try.
     */
    public void tryT2(View v) {
        scoreTeam2 = scoreTeam2 + 5;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Increase the score for Team 2 by 2 points for a sucessful conversion.
     */
    public void conT2(View v) {
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Increase the score for Team 2 by 3 points for a drop goal.
     */
    public void dropGoalT2(View v) {
        scoreTeam2 = scoreTeam2 +3;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Increase the score for Team 2 by 3 points for a Penalty Kick.
     */
    public void penaltyT2(View v) {
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View v) {
        scoreTeam2 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam2);
        displayForTeam2(scoreTeam2);

    }



}