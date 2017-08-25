package com.example.spider.myapplication.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.spider.myapplication.R;

/**
 * Created by spider on 5/4/17.
 */

public class Appsplash  extends AppCompatActivity {

    //TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // tv1=(TextView) findViewById(R.id.textView3);
        //Typeface face= Typeface.createFromAsset(getAssets(), "font/font.ttf");
        //tv1.setTypeface(face);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Appsplash.this,Mainactivitymain.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
