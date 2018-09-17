package com.example.android.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void increase_score(TextView score_text_view){
        int score = Integer.parseInt(score_text_view.getText().toString()) ;
        score +=1;

        score_text_view.setText(""+score);

    }

    public void goal(View view){
        String team = view.getTag().toString();

        if(team.equals("A")){
            TextView goal_text_view = (TextView) findViewById(R.id.textGoalA);
            increase_score(goal_text_view);
        }
        else{
            TextView goal_text_view = (TextView) findViewById(R.id.textGoalB);
            increase_score(goal_text_view);
        }

    }
    public void corner(View view){
        String team = view.getTag().toString();

        if(team.equals("A")){
            TextView corner_text_view = (TextView) findViewById(R.id.textCornerA);
            increase_score(corner_text_view);
        }
        else{
            TextView goal_text_view = (TextView) findViewById(R.id.textCornerB);
            increase_score(goal_text_view);
        }

    }

    public void yellow(View view){
        String team = view.getTag().toString();

        if(team.equals("A")){
            TextView corner_text_view = (TextView) findViewById(R.id.textYelloCardA);
            increase_score(corner_text_view);
        }
        else{
            TextView goal_text_view = (TextView) findViewById(R.id.textYelloCardB);
            increase_score(goal_text_view);
        }

    }

    public void red(View view){
        String team = view.getTag().toString();

        if(team.equals("A")){
            TextView corner_text_view = (TextView) findViewById(R.id.textRedCardA);
            increase_score(corner_text_view);
        }
        else{
            TextView goal_text_view = (TextView) findViewById(R.id.textRedCardB);
            increase_score(goal_text_view);
        }

    }

    public void reset(View view) {
        int[] score_view_ids = new int[]{R.id.textGoalA, R.id.textGoalB, R.id.textCornerA, R.id.textCornerB, R.id.textRedCardA,
                R.id.textRedCardB, R.id.textYelloCardA, R.id.textYelloCardB};

        for (int i = 0; i < score_view_ids.length; i++) {
            TextView tv = (TextView) findViewById(score_view_ids[i]);
            tv.setText("0");
        }
    }




}
