package com.example.railwaysystem;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity3 extends AppCompatActivity {
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String text = "Choose your Train from Chennai to Bangalore";
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(MainActivity3.this, text, dur);
        t.show();

        ImageView img = findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "7:40 AM MAS--->SBC 1:40 PM";
                Toast t = Toast.makeText(MainActivity3.this, info, Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img1 = findViewById(R.id.imageView2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "3:30 PM MAS--->SBC 9:35 PM";
                Toast t = Toast.makeText(MainActivity3.this, info, Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2 = findViewById(R.id.imageView3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "11:30 PM MAS--->SBC 5:25 PM";
                Toast t = Toast.makeText(MainActivity3.this, info, Toast.LENGTH_SHORT);
                t.show();
            }
        });


        Button b1 = findViewById(R.id.next3);
        RadioGroup rg = findViewById(R.id.radio1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton17:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text = (t1 = findViewById(R.id.textView18)).getText().toString();
                                Intent intent = new Intent(MainActivity3.this, FormActivity.class);
                                intent.putExtra("train", text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton18:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1 = (t2 = findViewById(R.id.textView19)).getText().toString();
                                Intent intent1 = new Intent(MainActivity3.this, FormActivity.class);
                                intent1.putExtra("train", text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton19:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text2 = (t3 = findViewById(R.id.textView20)).getText().toString();
                                Intent intent2 = new Intent(MainActivity3.this, FormActivity.class);
                                intent2.putExtra("train", text2);
                                startActivity(intent2);
                            }
                        });
                        break;
                }
            }
        });
    }
}
