package com.example.tbiself_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void buttonOnClick(View v) {
        Button button =(Button) v;

        Intent intent= new Intent(MainActivity.this,Speak.class);
        startActivity(intent);
    }
}
