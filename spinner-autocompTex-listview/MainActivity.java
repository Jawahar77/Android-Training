package com.example.checking;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{

    String[] stat={"tamil","keral","karnadak","ap"};
    String[] lang={"tamil","tamil2","eng","eggg","uu","utube"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tb=findViewById(R.id.togBut);
        Spinner sp=findViewById(R.id.spinnn);
        AutoCompleteTextView actv=findViewById(R.id.automatic);

        ArrayAdapter array=new ArrayAdapter(this, android.R.layout.simple_spinner_item,stat);
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(array);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=sp.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            }
        });

        ArrayAdapter<String> adapte=new ArrayAdapter<>(this, android.R.layout.select_dialog_item,lang);
        actv.setThreshold(1);
        actv.setAdapter(adapte);

    }


}