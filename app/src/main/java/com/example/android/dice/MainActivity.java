package com.example.android.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn);
        ImageView image1 = (ImageView) findViewById(R.id.image1);
        ImageView image2 = (ImageView) findViewById(R.id.image2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int value1 = r.nextInt(6)+1;
                int value2 = r.nextInt(6)+1;

                int res1 = getResources().getIdentifier("dice_"+value1,"drawable","com.example.android.dice");
                int res2 = getResources().getIdentifier("dice_"+value2,"drawable","com.example.android.dice");

                image1.setImageResource(res1);
                image2.setImageResource(res2);
            }
        });
    }

}