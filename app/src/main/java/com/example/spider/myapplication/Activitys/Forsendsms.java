package com.example.spider.myapplication.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.spider.myapplication.R;

/**
 * Created by spider on 4/4/17.
 */

public class Forsendsms extends Activity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0;
    public static final String TAG = "For Send SMS";
    Button sendbtn;
    EditText editphoneno;
    EditText editsms;
    String phoneno;
    String sms;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendsms);

        Intent intent5=getIntent();

        sendbtn = (Button) findViewById(R.id.sendbtn);
        editphoneno = (EditText) findViewById(R.id.phoneno);
        editsms = (EditText) findViewById(R.id.textsms);

        sendbtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                sendSMS(editphoneno.getText().toString(), editsms.getText().toString());
            }
        });
    }

    public void sendSMS(String phoneno, String sms)
    {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneno, null, sms, null, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
