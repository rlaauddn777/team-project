package com.example.food;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Korean extends AppCompatActivity {
    Button btn_click;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        imageView = findViewById(R.id.imageView);
        btn_click = (Button) findViewById(R.id.click);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(8)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.k_pic1);
                        txtResult.setText("김치찌개");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.k_pic2);
                        txtResult.setText("된장찌개");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.k_pic3);
                        txtResult.setText("부대찌개");
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.k_pic4);
                        txtResult.setText("감자탕");
                        break;
                    case 5 :
                        imageView.setImageResource(R.drawable.k_pic5);
                        txtResult.setText("갈비찜");
                        break;
                    case 6 :
                        imageView.setImageResource(R.drawable.k_pic6);
                        txtResult.setText("닭갈비");
                        break;
                    case 7 :
                        imageView.setImageResource(R.drawable.k_pic7);
                        txtResult.setText("김치볶음밥");
                        break;
                    case 8 :
                        imageView.setImageResource(R.drawable.k_pic8);
                        txtResult.setText("소불고기");
                        break;
                }
            }
        });
    }
}
