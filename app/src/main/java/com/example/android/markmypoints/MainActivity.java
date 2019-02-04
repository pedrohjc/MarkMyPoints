package com.example.android.markmypoints;

//Author Pedro Henrique Carvalho
//December - 2018

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String teamAname,teamBname,teamAColor;
    EditText nameTeam_a, nameTeam_b;
    int team_A = 0;
    int team_B = 0;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Enter you teams names", Toast.LENGTH_SHORT).show();

    }


    //get the team A name
    public void nameTeamA(View view){
        nameTeam_a = (EditText)findViewById(R.id.team_A_box);
        teamAname =  nameTeam_a.getText().toString();
        if(teamAname.matches("")){
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            displayNameTeamAWrong("TEAM A");
        }else {
            displayNameTeamA(teamAname);
        }
    }

    //get team B name
    public void nameTeamB(View view){
        nameTeam_b = (EditText)findViewById(R.id.team_B_box);
        teamBname =  nameTeam_b.getText().toString();
        if(teamBname.matches("")){
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            displayNameTeamBWrong("TEAM B");
        }else {
            displayNameTeamB(teamBname);
        }
    }


    // Team A control
    public void add2A(View view){
        team_A+=2;
        displayTeamA(team_A);
    }

    public void add3A(View view){
        team_A+=3;
        displayTeamA(team_A);
    }
    public void ft_A(View view){
        team_A+=1;
        displayTeamA(team_A);
    }
    public void minus1teamA(View view){
        team_A--;
        displayTeamA(team_A);
    }


    //------------------------------------------

    //Team B control
    public void add2B(View view){
        team_B+=2;
        displayTeamB(team_B);
    }

    public void add3B(View view){
        team_B+=3;
        displayTeamB(team_B);
    }
    public void ft_B(View view){
        team_B+=1;
        displayTeamB(team_B);
    }
    public void minus1teamB(View view){
        team_B--;
        displayTeamB(team_B);
    }

    //Control - reset Button

    public void reset_button(View view){
        team_A = 0;
        team_B = 0;
        displayTeamA(team_A);
        displayTeamB(team_B);
        displayNameTeamA("Team A");
        displayNameTeamB("Team B");
        Toast.makeText(this, "Enter you teams names", Toast.LENGTH_SHORT).show();

    }
    private void displayNameTeamA(String name){
        TextView quantityTextView = (TextView) findViewById(R.id.team_A_name);
        quantityTextView.setTextColor(Color.GRAY);
        quantityTextView.setText("" + name);
    }

    private void displayNameTeamB(String name){
        TextView quantityTextView = (TextView) findViewById(R.id.team_B_name);
        quantityTextView.setTextColor(Color.GRAY);
        quantityTextView.setText("" + name);
    }

    private void displayTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_team_a);
        quantityTextView.setText("" + number);
    }

    private void displayTeamB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_team_b);
        quantityTextView.setText("" + number);
    }

    private void displayNameTeamAWrong(String name){
        TextView quantityTextView = (TextView) findViewById(R.id.team_A_name);
        quantityTextView.setTextColor(Color.RED);
        quantityTextView.setText("" + name);
    }
    private void displayNameTeamBWrong(String name){
        TextView quantityTextView = findViewById(R.id.team_B_name);
        quantityTextView.setTextColor(Color.RED);
        quantityTextView.setText("" + name);
    }

}
