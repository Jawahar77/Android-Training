package com.example.app2;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class main1 extends AppCompatActivity {

    static int a=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_main1);

        TextView txv=findViewById(R.id.txt1);
        Button btn=findViewById(R.id.likBut);
       Button btn2=findViewById(R.id.shareBut);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(main1.this,"like",Toast.LENGTH_SHORT).show();

               String b=String.valueOf(a);
                txv.setText("like="+b);
                a++;


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBut();
            }
        });

    }
    public void shareBut(){

        Intent share = new Intent(android.content.Intent.ACTION_SEND);

        share.setType("text/plain");

       // share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        share.putExtra(Intent.EXTRA_SUBJECT, "Hi this my app");

        share.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());

        startActivity(Intent.createChooser(share, "Share to Friends!"));


    }


}
