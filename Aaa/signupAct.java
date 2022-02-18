package com.jawa.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signupAct extends AppCompatActivity {

    EditText emailtxt,passwordTxt,confirmpassword; //declre variable
    TextView errortt , movtoLogin;
    Button signupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup);

        emailtxt=findViewById(R.id.emails); //fetch mail from signup xml
        passwordTxt=findViewById(R.id.passwd);
        confirmpassword=findViewById(R.id.c_passwd);
        signupbutton=findViewById(R.id.butt);
        errortt=findViewById(R.id.errortxt);
        movtoLogin=findViewById(R.id.movtoLog);

        movtoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvlog();
            }
        });



        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email1=emailtxt.getText().toString(); //get the txt and conver str
                String passd=passwordTxt.getText().toString();
                String conPass=confirmpassword.getText().toString();

                if(valid(email1) & pass(passd)& c_pass(passd,conPass)){
                    Toast.makeText(signupAct.this,"Success",Toast.LENGTH_SHORT).show();
                   // succrepo();
                }else{
                    Toast.makeText(signupAct.this,"Failed",Toast.LENGTH_LONG).show();
                    //seterr();
                }

            }
        });
        Log.i("LIFECYCLE","onCreate()"); //log la info print panna, logcat la lifecycle nu filter panni pathukaalam
    }






    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LIFECYCLE","onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LIFECYCLE","onResume()");
        Toast.makeText(signupAct.this,"Resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE","onPause()");
        Toast.makeText(signupAct.this,"pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LIFECYCLE","onStop()");
    }



    private boolean valid(String email){
       // return checkrex("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$", email);
        return true;
    }

    private boolean pass(String passs){
       // return checkrex("^[a-zA-Z]\\w(3,140$", passs);
        return true;
    }
    private boolean c_pass(String actualpass,String conPass){
     //   return actualpass.equals(conPass);
        return true;
    }

    private void seterr(){
        errortt.setVisibility(View.VISIBLE);
        errortt.setText("pls provide valid details");
    }
    private void succrepo(){
        errortt.setVisibility(View.VISIBLE);
        errortt.setText("");
    }

    private boolean checkrex(String pattern ,String input){
      return input.matches(pattern);
    }
    private void mvlog(){
        Intent ab = new Intent(signupAct.this,loginAct.class);
        startActivity(ab);     //move login to signup

    }

}