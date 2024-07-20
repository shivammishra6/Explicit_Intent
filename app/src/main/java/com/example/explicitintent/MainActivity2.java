package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt=findViewById(R.id.textView);
        Intent i=getIntent();
        String result = i.getStringExtra("data");
        String res="Hello "+result;
        txt.setText(res);
    }
}