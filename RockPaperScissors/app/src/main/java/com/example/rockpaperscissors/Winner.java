package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
    Main2Activity obj2 = new Main2Activity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        display("Your score = " + obj2.User_score + "\nCPU score = " + obj2.CPU_score);
    }
    public void display(String sc) {

        TextView display = (TextView) findViewById(R.id.results);
        display.setText(sc);

    }

    public void reset(View v){
        obj2.User_score = 0;
        obj2.CPU_score = 0;
        obj2.loopFinal=0;
        Intent reset = new Intent(Winner.this,MainActivity.class);
        startActivity(reset);
    }
}
