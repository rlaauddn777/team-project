package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Kinds extends AppCompatActivity {
    Button btn_k, btn_c, btn_j, btn_w, btn_d;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinds);

        btn_k = (Button) findViewById(R.id.kinds_1);
        btn_c = (Button) findViewById(R.id.kinds_2);
        btn_j = (Button) findViewById(R.id.kinds_3);
        btn_w = (Button) findViewById(R.id.kinds_4);


        btn_k.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kinds.this, Korean.class);
                startActivity(intent);
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kinds.this, Chinese.class);
                startActivity(intent);
            }
        });
        btn_j.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kinds.this, Japanese.class);
                startActivity(intent);
            }
        });
        btn_w.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kinds.this, Western.class);
                startActivity(intent);
            }
        });
    }
}
