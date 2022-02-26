package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class Diet extends AppCompatActivity {
    Button btn_click, btn_recipe;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        imageView = findViewById(R.id.imageView);
        btn_click = findViewById(R.id.click);
        btn_recipe = findViewById(R.id.recipe);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(3)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.d_pic1);
                        txtResult.setText("닭가슴살 샐러드");
                        btn_recipe.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Diet.this, S_page.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.d_pic2);
                        txtResult.setText("샌드위치");
                        btn_recipe.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Diet.this, SD_page.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.d_pic3);
                        txtResult.setText("토마토 달걀볶음");
                        btn_recipe.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Diet.this, T_page.class);
                                startActivity(intent);
                            }
                        });
                        break;
                }
            }
        });
    }
}
