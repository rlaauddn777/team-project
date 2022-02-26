package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Situation extends AppCompatActivity {
    Button btn_diet, btn_snack, btn_spicy, btn_fast;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);

        btn_diet = (Button) findViewById(R.id.st_1);
        btn_snack = (Button) findViewById(R.id.st_2);
        btn_spicy = (Button) findViewById(R.id.st_3);
        btn_fast = (Button) findViewById(R.id.st_4);

        btn_diet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation.this, Diet.class);
                startActivity(intent);
            }
        });

        btn_snack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation.this, Snack.class);
                startActivity(intent);
            }
        });
        btn_spicy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation.this, Spicy.class);
                startActivity(intent);
            }
        });
        btn_fast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation.this, Fast.class);
                startActivity(intent);
            }
        });
    }
}
