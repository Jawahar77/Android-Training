package com.example.try1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv=findViewById(R.id.webv);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.google.com/");
        WebSettings webse=wv.getSettings();
        webse.setJavaScriptEnabled(true);

    }



}
