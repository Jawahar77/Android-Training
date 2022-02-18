package com.example.arrrrys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class f1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);


        Button b1=findViewById(R.id.butt);
        Button b2=findViewById(R.id.button1);
        Button b3=findViewById(R.id.button2);
        Button b4=findViewById(R.id.button3);
        TextView t1=findViewById(R.id.txt1);
        TextView t2=findViewById(R.id.txt2);

//shuffle
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer[] ar1={1,2,3,4,9,8,7};
                String ty=Arrays.toString(ar1);
                t1.setText(ty);
                List<Integer> intlist=Arrays.asList(ar1);
                Collections.shuffle(intlist);
                String aa=intlist.toString();
                t2.setText(aa);
            }
        });
//random
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] a={1,2,3,4,5,6,7,8,9};
                String b= Arrays.toString(a);
                t1.setText(b);
                Random r=new Random();
                int rannum=r.nextInt(a.length);
                int aw=a[rannum];
                String bb=String.valueOf(aw);
                t2.setText(bb);
            }
        });
//remove duplicates
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer[] a2={1,2,2,5,5,6,6,4,9,7,8,7};
                String c=Arrays.toString(a2);
                t1.setText(c);
                Set<Integer> an =new HashSet<>(Arrays.asList(a2));
                String v=an.toString();
                t2.setText(v);
            }
        });
//first and last elements
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] a2={1,2,2,5,4,10};
                String be=Arrays.toString(a2);
                t1.setText(be);
                String dd=String.valueOf(a2[0]);
                String ed=String.valueOf(a2[a2.length-1]);
                String nn="FirstValue ="+dd+":: LastValue "+ed+"";
                t2.setText(nn);


            }
        });

    }
}
