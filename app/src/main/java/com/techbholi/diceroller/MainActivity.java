package com.techbholi.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView dice_roller, textView;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice_roller = findViewById(R.id.head);
        textView = findViewById(R.id.text);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.dice);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dice_Roller();
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void Dice_Roller(){
        Random random = new Random();
        int rollResult = random.nextInt(6)+1;
        textView.setText(Integer.toString(rollResult));
        switch (rollResult)
        { 
            case 1: imageView.setImageResource(R.drawable.dice1);
            break;
            case 2: imageView.setImageResource(R.drawable.dice2);
            break;
            case 3: imageView.setImageResource(R.drawable.dice3);
            break;
            case 4: imageView.setImageResource(R.drawable.dice4);
            break;
            case 5: imageView.setImageResource(R.drawable.dice5);
            break;
            case 6: imageView.setImageResource(R.drawable.dice6);
            break;
        }
    }
}