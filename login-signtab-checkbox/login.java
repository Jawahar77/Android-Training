package com.example.app2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.x_login);
        TextView signOPen=findViewById(R.id.movTOsign);

        Button but=findViewById(R.id.btttn);

        signOPen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opesignup();

            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();
            }
        });

    }

    public  void valid(){
        EditText usr=findViewById(R.id.usern);
        EditText pas=findViewById(R.id.passn);
        String uss=usr.getText().toString();
        String pss=pas.getText().toString();

        if(uss.equals(pss)){
            Intent abc = new Intent(login.this,main1.class);
            startActivity(abc);
        }
        else{
            TextView er=findViewById(R.id.errr);
            er.setText("ERROR");
        }
    }

    public void opesignup(){
        Intent ab = new Intent(login.this,signup.class);
        startActivity(ab);     //move login to signup
    }


    //back button pressing it will sho alert
    @Override
    public void onBackPressed () {

        final AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
        builder.setMessage("Are you sure want to exit");
        builder.setCancelable(true);


        builder.setPositiveButton("YES",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i ){
                finish();
            }
        } );

        builder.setNegativeButton("NO!" ,new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }
}

