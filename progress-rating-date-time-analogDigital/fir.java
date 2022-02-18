package com.example.checking2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class fir extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_fir);

        DatePicker dp=findViewById(R.id.datepike);
        Button bn=findViewById(R.id.selecDate);
        TextView tv=findViewById(R.id.dissp);
        TextView tv1=findViewById(R.id.dissp1);
        TimePicker tp=findViewById(R.id.timing);



      bn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              final int year=dp.getYear();
              final int month=dp.getMonth();
              final int day=dp.getDayOfMonth();

              tv.setText(""+year+"/"+month+"/"+day+"/");

              int hour=tp.getCurrentHour();
              int min=tp.getCurrentMinute();
              tv1.setText(""+hour+" hours"+min+" min");

          }
      });
    }
}
