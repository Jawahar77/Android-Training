package com.example.hotstar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private boolean tab_fl=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void collaptaple(View view) {
        TableLayout tb=findViewById(R.id.tlayot);
        Button swit=findViewById(R.id.orig);

        tb.setColumnCollapsed(1,tab_fl);
        tb.setColumnCollapsed(2,tab_fl);

        if (tab_fl) {
            tab_fl=false;
            swit.setText("show details");
        }else {
            tab_fl=true;
            swit.setText("hide butt");
        }
    }
}