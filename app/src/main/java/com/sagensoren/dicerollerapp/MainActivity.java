package com.sagensoren.dicerollerapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imageViewDicv;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicv = findViewById(R.id.dice_iv);

        imageViewDicv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int myRanNo = myRandomNumber.nextInt(6)+1;
        switch (myRanNo ){
            case 1:
                imageViewDicv.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDicv.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDicv.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDicv.setImageResource(R.drawable.dice4);
                break;


            case 5:
                imageViewDicv.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDicv.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
