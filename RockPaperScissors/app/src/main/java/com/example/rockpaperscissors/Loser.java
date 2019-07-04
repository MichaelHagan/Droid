package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Loser extends AppCompatActivity {
    Main2Activity obj1 = new Main2Activity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);
        display("Your score = " + obj1.User_score + "\nCPU score = " + obj1.CPU_score);
    }


    public void display(String sc) {

        TextView display = (TextView) findViewById(R.id.results);
        display.setText(sc);

    }

    public void reset(View v){
        obj1.User_score = 0;
        obj1.CPU_score = 0;
        obj1.loopFinal=0;
        Intent reset = new Intent(Loser.this,MainActivity.class);
        startActivity(reset);
    }
}
