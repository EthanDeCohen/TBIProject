package com.example.tbiself_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseAnswer extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView4, imageView2, imageView3, imageView5, imageView6, imageView8, imageView9, imageView10, imageView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_answer);

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setTag(R.drawable.kneepads);
        imageView4.setOnClickListener(this);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setTag(R.drawable.aircraft);
        imageView2.setOnClickListener(this);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setTag(R.drawable.bookbag);
        imageView3.setOnClickListener(this);

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setTag(R.drawable.boots);
        imageView5.setOnClickListener(this);

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setTag(R.drawable.bunuk);
        imageView6.setOnClickListener(this);

        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setTag(R.drawable.hel);
        imageView8.setOnClickListener(this);

        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView9.setTag(R.drawable.guns);
        imageView9.setOnClickListener(this);

        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setTag(R.drawable.seal);
        imageView10.setOnClickListener(this);

        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setTag(R.drawable.uniform);
        imageView11.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        ImageView img = (ImageView)v;

        int img_resource_id= Integer.parseInt(img.getTag().toString());
        intent.putExtra("Answer",img_resource_id);
        setResult(1999,intent);
        finish();

    }
}
