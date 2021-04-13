package com.example.tbiself_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Speak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);

    }


    public void buttonOnClick1(View v) {
        Button button4 =(Button) v;

        Intent intent= new Intent(Speak.this,speech.class);
        startActivity(intent);
}


    public void buttonOnClick2 (View v) {
        Button button5 =(Button) v;

        Intent intent= new Intent(Speak.this,type.class);
        startActivity(intent);
    }

    }
