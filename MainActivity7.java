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

public class MainActivity7 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        String text="Choose your Train from Kolkata to Bangalore";
        int dur= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText( MainActivity7.this,text,dur);
        t.show();

        ImageView img=findViewById(R.id.imageView15);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="10:50 AM HWH--->YPR 4:00 PM";
                Toast t=Toast.makeText(MainActivity7.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2=findViewById(R.id.imageView13);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="4:10 PM HWH--->SBC 12:30 AM";
                Toast t=Toast.makeText(MainActivity7.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img3=findViewById(R.id.imageView14);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="11:30 PM HWH--->SBC 9:05 AM";
                Toast t=Toast.makeText(MainActivity7.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Button b1=findViewById(R.id.next7);
        RadioGroup rg=findViewById(R.id.radio5);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton30:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text=(t1=findViewById(R.id.textView27)).getText().toString();
                                Intent intent=new Intent(MainActivity7.this,FormActivity.class);
                                intent.putExtra("train",text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton31:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1=(t2=findViewById(R.id.textView28)).getText().toString();
                                Intent intent1=new Intent(MainActivity7.this,FormActivity.class);
                                intent1.putExtra("train",text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton32:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text2=(t3=findViewById(R.id.textView29)).getText().toString();
                                Intent intent2=new Intent(MainActivity7.this,FormActivity.class);
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

