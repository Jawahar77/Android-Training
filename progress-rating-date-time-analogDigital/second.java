package com.example.checking2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class second extends AppCompatActivity {

    int position=0;
    int[] imgg={R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.second);
        ImageSwitcher im=findViewById(R.id.imswww);
        Button bn=findViewById(R.id.button3);


        im.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imv=new ImageView(getApplicationContext());
                imv.setImageResource(imgg[position]);
                return imv;
            }
        });

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==imgg.length-1){
                    position=0;
                }else{
                    position++;
                    im.setImageResource(imgg[position]);
                }
            }
        });



    }
}
