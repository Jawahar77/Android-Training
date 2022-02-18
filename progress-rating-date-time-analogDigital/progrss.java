package com.example.checking2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class progrss extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progg);

        ProgressBar pb=findViewById(R.id.progressBar2);
        Button bn1=findViewById(R.id.button);
        Button bn2=findViewById(R.id.button2);

        pb.setVisibility(View.INVISIBLE);
        pb.setIndeterminate(true);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setVisibility(View.VISIBLE);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setVisibility(View.INVISIBLE);
                pb.invalidate();
            }
        });
    }
}
