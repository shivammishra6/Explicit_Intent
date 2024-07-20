package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        System.out.println("mishra");
    }
    public void send(View v){
        TextView tv=findViewById(R.id.editTextText);
        String name=tv.getText().toString();
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("data",name);
        startActivity(i);
    }

}