package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    String anyString;
    TextView myTxtViewMgr;
    Intent intentReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);


        myTxtViewMgr= findViewById(R.id.textView);

        intentReceiver= getIntent();
        myTxtViewMgr.setText(intentReceiver.getStringExtra("myExtra"));





    }
}