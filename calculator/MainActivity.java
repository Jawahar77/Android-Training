package com.example.calc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cam1=findViewById(R.id.cambut);
        EditText n1=findViewById(R.id.num1);
        EditText n2=findViewById(R.id.num2);
        Button btt=findViewById(R.id.add);
        Button btt1=findViewById(R.id.sub);
        Button btt2=findViewById(R.id.multi);
        Button btt3=findViewById(R.id.divi);
        TextView tvv=findViewById(R.id.displ);

        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nn=n1.getText().toString();
                String mm=n2.getText().toString();
                int bb=Integer.parseInt(nn)+Integer.parseInt(mm);
                Toast.makeText(MainActivity.this,""+bb+"",Toast.LENGTH_SHORT).show();
                String kk=String.valueOf(bb);
                tvv.setText("addition "+kk);

            }
        });
        btt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nn=n1.getText().toString();
                String mm=n2.getText().toString();
                int bb=Integer.parseInt(nn)-Integer.parseInt(mm);
                Toast.makeText(MainActivity.this,""+bb+"",Toast.LENGTH_SHORT).show();
                String kk=String.valueOf(bb);
                tvv.setText("subtraction "+kk);

            }
        });
        btt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nn=n1.getText().toString();
                String mm=n2.getText().toString();
                int bb=Integer.parseInt(nn)*Integer.parseInt(mm);
                Toast.makeText(MainActivity.this,""+bb+"",Toast.LENGTH_SHORT).show();
                String kk=String.valueOf(bb);
                tvv.setText("multiplication "+kk);

            }
        });
        btt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nn=n1.getText().toString();
                String mm=n2.getText().toString();
                int bb=Integer.parseInt(nn)/Integer.parseInt(mm);
                Toast.makeText(MainActivity.this,""+bb+"",Toast.LENGTH_SHORT).show();
                String kk=String.valueOf(bb);
                tvv.setText("division "+kk);

            }
        });

        cam1.setOnClickListener(new View.OnClickListener() {
            //open camera
            @Override
            public void onClick(View view) {
                Intent open_cam=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(open_cam,100);
            }
        });
    }
    //picture stored in tha layout
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo =(Bitmap)data.getExtras().get("data");
        ImageView snapp=findViewById(R.id.camview);
        snapp.setImageBitmap(photo);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this," on start",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this," on pause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this," on restart",Toast.LENGTH_SHORT).show();
    }
//when user interaction
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this," on resume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this," on stop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this," on Destroy",Toast.LENGTH_SHORT).show();
    }
}