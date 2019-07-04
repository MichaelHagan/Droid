package com.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class Main2Activity extends AppCompatActivity {

    static int User_score = 0;
    static int CPU_score = 0;
    int CPU_value;
    String Ro = "Rock";
    String Pa = "Paper";
    String Sc = "Scissors";
    String User_string;
    String CPU_string;
    Random ra = new Random();
    String scan;
    MainActivity obj = new MainActivity();
    int loopFinal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button Scissors = (Button) findViewById(R.id.Scissors);
        Button Rock = (Button) findViewById(R.id.Rock);
        Button Paper = (Button) findViewById(R.id.Paper);
        Scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CPU_string = CPU_decide();
                User_string = Sc;
                scan = "You: " + User_string + "\nCPU: " + CPU_string+"\n\n";

                if (CPU_string.equals(User_string)) {

                    scan += "Draw!\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                if (CPU_string.equals(Ro) && User_string.equals(Sc)) {

                    CPU_score += 1;
                    scan +="You lost, Sorry.\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                if (CPU_string.equals(Pa) && User_string.equals(Sc)) {
                    User_score += 1;
                    scan += "You Win!\n\nRock paper Scissors Shoot!";
                    display(scan);
                }
                loopFinal++;
                if(loopFinal == obj.rounds){
                    if(CPU_score > User_score){

                        Intent lose = new Intent(Main2Activity.this, Loser.class);
                        startActivity(lose);

                    }

                    if(CPU_score < User_score){

                        Intent win = new Intent(Main2Activity.this, Winner.class);
                        startActivity(win);

                    }

                    if(CPU_score == User_score){

                        Intent draw = new Intent(Main2Activity.this, Draw.class);
                        startActivity(draw);
                    }


                }


            }
        });

        Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CPU_string = CPU_decide();
                User_string = Ro;
                scan = "You: " + User_string + "\nCPU: " + CPU_string+"\n\n";

                if (CPU_string.equals(User_string)) {
                    scan += "Draw!\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                if (CPU_string.equals(Pa) && User_string.equals(Ro)) {
                    CPU_score += 1;
                    scan += "You lost, Sorry.\n\nRock paper Scissors Shoot!";
                    display(scan);


                }
                if (CPU_string.equals(Sc) && User_string.equals(Ro)) {

                    User_score += 1;
                    scan +="You Win!\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                loopFinal++;
                if(loopFinal == obj.rounds){
                    if(CPU_score > User_score){

                        Intent lose = new Intent(Main2Activity.this, Loser.class);
                        startActivity(lose);

                    }

                    if(CPU_score < User_score){

                        Intent win = new Intent(Main2Activity.this, Winner.class);
                        startActivity(win);

                    }

                    if(CPU_score == User_score){

                        Intent draw = new Intent(Main2Activity.this, Draw.class);
                        startActivity(draw);
                    }


                }

            }
        });

        Paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CPU_string = CPU_decide();
                User_string = Pa;
                scan = "You: " + User_string + "\nCPU: " + CPU_string+"\n\n";

                if (CPU_string.equals(User_string)) {
                    scan += "Draw!\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                if (CPU_string.equals(Ro) && User_string.equals(Pa)) {
                    User_score += 1;
                    scan +="You Win!\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                if (CPU_string.equals(Sc) && User_string.equals(Pa)) {
                    CPU_score += 1;
                    scan +="You lost, Sorry.\n\nRock paper Scissors Shoot!";
                    display(scan);

                }
                loopFinal++;
                if(loopFinal == obj.rounds){
                    if(CPU_score > User_score){

                        Intent lose = new Intent(Main2Activity.this, Loser.class);
                        startActivity(lose);

                    }

                    if(CPU_score < User_score){

                        Intent win = new Intent(Main2Activity.this, Winner.class);
                        startActivity(win);

                    }

                    if(CPU_score == User_score){

                        Intent draw = new Intent(Main2Activity.this, Draw.class);
                        startActivity(draw);
                    }


                }

            }
        });

        
            display("Rock paper Scissors Shoot!");


        
    }

    public String CPU_decide() {

        CPU_value = ra.nextInt(3);
        String Select = Ro;
        switch (CPU_value) {
            case 0:
                Select = Ro;
                break;
            case 1:
                Select = Pa;
                break;
            case 2:
                Select = Sc;
                break;

        }

        return Select;
    }

    
    public void display(String sc) {

        TextView display = (TextView) findViewById(R.id.show);
        display.setText(sc);

    }


    } 

