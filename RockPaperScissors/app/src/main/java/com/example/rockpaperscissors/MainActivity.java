package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    static int rounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Submit(View v) {

        try {

            EditText Submit = (EditText) findViewById(R.id.Rounds);
            rounds = Integer.parseInt(Submit.getText().toString());
            Intent m_act = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(m_act);

        } catch (Exception e) {

            Toast.makeText(this, "Enter value", Toast.LENGTH_SHORT);

        }


    }

}
