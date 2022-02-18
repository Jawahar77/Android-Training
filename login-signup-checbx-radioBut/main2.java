package com.example.app2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class main2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_main2);

        Button but=findViewById(R.id.orderbut);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ordering();
               // radiobut();
            }
        });

        Button bt=findViewById(R.id.btn2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radiobut();
            }
        });

        String[] course={"c","c++","pyth","php","mysql"};

        ArrayAdapter<String> adapt=new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,course);
        AutoCompleteTextView ac=findViewById(R.id.autocom);
        ac.setThreshold(1); // 1 letter after it will try to auto complete
        ac.setAdapter(adapt);
        ac.setTextColor(Color.BLUE);
    }

    public void ordering(){
        CheckBox f1 =findViewById(R.id.food1);
        CheckBox f2 =findViewById(R.id.food2);
        CheckBox f3 =findViewById(R.id.food3);

        //    Toast.makeText(main2.this,"$f1",Toast.LENGTH_SHORT).show();
        int amnt=0;

        if (f1.isChecked()){
            amnt+=10;
        }
        if (f2.isChecked()){
            amnt+=20;
        }
        if (f3.isChecked()){
            amnt+=30;

        }
        Toast.makeText(main2.this,"price"+amnt+"",Toast.LENGTH_SHORT).show();


    }

    public void radiobut(){

        RadioGroup rgrp=findViewById(R.id.groupbut);
        int selecedId=rgrp.getCheckedRadioButtonId();
        RadioButton gen=findViewById(selecedId);
        Toast.makeText(main2.this,""+gen.getText()+"",Toast.LENGTH_SHORT).show();

    }

}
