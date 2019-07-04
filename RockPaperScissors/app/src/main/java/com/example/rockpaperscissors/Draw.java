package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Draw extends AppCompatActivity {
    Main2Activity obj3 = new Main2Activity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        display("Your score = " + obj3.User_score + "\nCPU score = " + obj3.CPU_score);
    }
    public void display(String sc) {

        TextView display = (TextView) findViewById(R.id.results);
        display.setText(sc);

    }

    public void reset(View v){
        obj3.User_score = 0;
        obj3.CPU_score = 0;
        obj3.loopFinal=0;
        Intent reset = new Intent(Draw.this,MainActivity.class);
        startActivity(reset);
    }


}
