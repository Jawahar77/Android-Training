package com.example.checking;

import static android.widget.Toast.makeText;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class list extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_list1);

        ListView lv=findViewById(R.id.llvv);
        TextView tv=findViewById(R.id.ttvv);
        String[] lang={"tamil","eglish","malayalam","hindi","telungu"};

        final ArrayAdapter<String> adptr=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                lang);
        lv.setAdapter(adptr);


    }
}
