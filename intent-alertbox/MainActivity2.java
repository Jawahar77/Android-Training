package com.example.trining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extrac=getIntent().getExtras();
        String va1=extrac.getString("val1");
        String va2 = extrac.getString("val2");
        Toast.makeText(this,""+va1+""+va2+"",Toast.LENGTH_SHORT).show();
    }
}