package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgViewManager;
    Button buttonManager;
    TextView txtViewManager;
    Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonManager = findViewById(R.id.button);
        txtViewManager  =findViewById(R.id.textView);
        imgViewManager = findViewById(R.id.imageView);

        buttonManager.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtViewManager.setText("clicked");
            if(imgViewManager.getVisibility() == View.VISIBLE){
                imgViewManager.setVisibility(View.VISIBLE);
            }else{
                imgViewManager.setVisibility(View.INVISIBLE);
            }
            myIntent = new Intent(MainActivity.this,ChildActivity.class);
            myIntent.putExtra("myExtra",txtViewManager.getText().toString());

            startActivity(myIntent);







            }
        });
    }
}