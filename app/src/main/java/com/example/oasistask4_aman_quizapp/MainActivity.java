package com.example.oasistask4_aman_quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Tea contains more caffeine than coffee and soda.", "Bill Gates is the founder of Amazon.",
            "The star is the most common symbol used in all national flags around the world.",
            "The World War II began in 1939 when Germany invaded Poland.",
            "India shares its border with Isreal"};
    private boolean[] answers={false,false,true,true,false};
    private int score=0;
    private int index=0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length - 1) {
                    if (answers[index]==true) {
                        score++;
                        Toast.makeText(MainActivity.this, "Right Answer !", Toast.LENGTH_SHORT).show();
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length - 1) {
                    if (answers[index] == false) {
                        score++;
                        Toast.makeText(MainActivity.this, "Right Answer !", Toast.LENGTH_SHORT).show();
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}