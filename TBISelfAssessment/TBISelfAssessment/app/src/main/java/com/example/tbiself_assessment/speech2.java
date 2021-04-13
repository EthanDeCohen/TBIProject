package com.example.tbiself_assessment;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class speech2 extends AppCompatActivity {


    private TextView txvResult1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech2);
        txvResult1=(TextView)findViewById(R.id.txvResult1);

    }

    public void getSpeechInput1(View view) {

        Intent intent1 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent1.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent1, 99);
        }else{
            Toast.makeText(this,"Your Device Doesnt Support Speech Input",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        switch (requestCode){
            case 99:
                if(resultCode== RESULT_OK && data != null){
                    ArrayList<String> result1 =data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txvResult1.setText(result1.get(0));
                }
                break;
        }
    }

    public void buttnclk (View view) {
        Button button3 = (Button)view;

        Intent intent= new Intent(speech2.this,Main2Activity.class);
        startActivity(intent);
    }
}

