package com.example.tbiself_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
    }

    public void buttonOnClick3(View v) {
        Button button6 =(Button) v;

        Intent intent= new Intent(type.this,Main2Activity.class);
        startActivity(intent);
    }
}
