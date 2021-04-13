package com.example.tbiself_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    ImageView img_question;
    ImageView img_answer;
    Button btn_answer;

    //ADD BACK IF iy doesnt work

    int array_images[]=new int[]{
         R.drawable.aircraft,
         R.drawable.bookbag,
         R.drawable.boots,
            R.drawable.guns,
            R.drawable.bunuk,
            R.drawable.hel,
            R.drawable.kneepads,
            R.drawable.seal,
            R.drawable.uniform,

    };//

    int correct_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img_question=(ImageView)findViewById(R.id.img_question);

        btn_answer=(Button)findViewById(R.id.btn_answer);
        btn_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main2Activity.this,ChooseAnswer.class);

            startActivityForResult(intent,1999);
            }

        });
     randomImage();

    }


    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if (requestCode == 1999){
            int answer_resource_id = data.getIntExtra("Answer",0);
            img_answer = (ImageView)findViewById(R.id.img_answer);
            img_answer.setImageResource(answer_resource_id);


            //ADD CODE BACK IN IF  BELOW DOES not WORK
            if(answer_resource_id == correct_answer){
                Toast.makeText(this,"Good! You have good memory",Toast.LENGTH_SHORT).show();
           }
            else {
                Toast.makeText(this,"Oops You Forgot!",Toast.LENGTH_SHORT).show();
            }
        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_re_new:
                randomImage();
                img_answer=(ImageView)findViewById(R.id.img_answer);
                img_answer.setImageResource(R.drawable.noquestion);
                break;
        }
        return true;
    }
 //ADD back if show next quiz doesnt work
       private void randomImage(){
       int img_resource= array_images[new Random().nextInt(9)];
       img_question.setImageResource(img_resource);
       correct_answer= img_resource;}
      /* private void randomImage() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(R.drawable.guns);
     list.add(R.drawable.aircraft);
     list.add(R.drawable.bookbag);
     list.add(R.drawable.bunuk);
     list.add(R.drawable.boots);
     list.add(R.drawable.hel);
     list.add(R.drawable.kneepads);
     list.add(R.drawable.seal);
     list.add(R.drawable.uniform);

     int position;
           position = new Random().nextInt(list.size());
                   img_question.setImageResource((Integer)list.get(position));
     correct_answer=position;
      list.remove(position);
       }*/


}
