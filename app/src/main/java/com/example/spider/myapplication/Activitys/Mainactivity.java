package com.example.spider.myapplication.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.spider.myapplication.R;

public class Mainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        Intent intent4 = getIntent();


    public void Mainactivity3view(View view) {
        Intent intent3 = new Intent(Mainactivity.this, Mainactivity3.class);
        startActivity(intent3);
    }

    public void Mainactivity2view(View view) {
        Intent intent2 = new Intent(Mainactivity.this, Mainactivity2.class);
        startActivity(intent2);
    }

    public void Mainactivity1view(View view) {
        Intent intent1 = new Intent(Mainactivity.this, Mainactivity1.class);
        startActivity(intent1);
    }
}


