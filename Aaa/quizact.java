package com.jawa.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class quizact extends AppCompatActivity {
    int quiz_count =10;
    int curent_page=1;
    TextView pagenum;
    Button nexb,prevB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        pagenum=findViewById(R.id.pagno1);
        nexb=findViewById(R.id.nexBut);
        prevB=findViewById(R.id.prevBut);


        nexb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nexQuiz();
            }

        });

        prevB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevQuiz();
            }
        });


    }
    public void nexQuiz(){
        curent_page+=1;
        if (curent_page>=quiz_count){
            curent_page=quiz_count;
        }

    }
    public void prevQuiz(){

    }

}
