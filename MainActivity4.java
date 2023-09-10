package com.example.railwaysystem;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity4 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String text="Choose your Train from Chennai to Kolkata";
        int dur= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText( MainActivity4.this,text,dur);
        t.show();
        ImageView img=findViewById(R.id.imageView9);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="8:10 AM MAS--->SRC 10:30 PM";
                Toast t=Toast.makeText(MainActivity4.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2=findViewById(R.id.imageView7);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="8:45 AM MAS--->HWH 11:55 PM";
                Toast t=Toast.makeText(MainActivity4.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img3=findViewById(R.id.imageView8);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="10:00 AM MAS--->HWH 2:00 PM";
                Toast t=Toast.makeText(MainActivity4.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Button b1=findViewById(R.id.next4);
        RadioGroup rg=findViewById(R.id.radio2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton21:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text=(t1=findViewById(R.id.textView15)).getText().toString();
                                Intent intent=new Intent(MainActivity4.this,FormActivity.class);
                                intent.putExtra("train",text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton22:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1=(t2=findViewById(R.id.textView16)).getText().toString();
                                Intent intent1=new Intent(MainActivity4.this,FormActivity.class);
                                intent1.putExtra("train",text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton23:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text2=(t3=findViewById(R.id.textView17)).getText().toString();
                                Intent intent2=new Intent(MainActivity4.this,FormActivity.class);
                                intent2.putExtra("train",text2);
                                startActivity(intent2);
                            }
                        });
                        break;
                        }
                    }
                });
            }
    }

