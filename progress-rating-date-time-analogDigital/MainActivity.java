package com.example.checking2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar rb=findViewById(R.id.ratingBar);
        Button bn=findViewById(R.id.btn);
        SeekBar sk=findViewById(R.id.seekBar2);



        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data="<html><body><h1>helloooo</h1></body></html>";
                String st=String.valueOf(rb.getRating());
               // Toast.makeText(getApplicationContext(),""+st+"",Toast.LENGTH_SHORT).show();
                WebView myweb=findViewById(R.id.webv);
                myweb.loadData(data,"text/html","UTF-8");
               // myweb.loadUrl("https://google.com/");
              //  int at=sk.getProgress();
              //  Toast.makeText(getApplicationContext(),String.valueOf(at),Toast.LENGTH_SHORT).show();
            }
        });

        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                a=i;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),String.valueOf(a),Toast.LENGTH_SHORT).show();
            }
        });
    }
}