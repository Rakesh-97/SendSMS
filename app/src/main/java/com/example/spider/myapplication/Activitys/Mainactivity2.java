package com.example.spider.myapplication.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.spider.myapplication.R;

public class Mainactivity2 extends AppCompatActivity {

    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent1=getIntent();

        setContentView(R.layout.activity_main2);
        mywebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.160by2.com/Index");
        mywebView.setWebViewClient(new WebViewClient());
    }

    public void onBackPressed()
    {
        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}
