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

public class MainActivity6 extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        String text="Choose your Train from Bangalore to Kolkata";
        int dur= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText( MainActivity6.this,text,dur);
        t.show();

        ImageView img=findViewById(R.id.imageView10);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="11:00 AM YPR--->HWH 4:25 PM";
                Toast t=Toast.makeText(MainActivity6.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2=findViewById(R.id.imageView11);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="7:35 PM YPR--->HWH 6:25 AM";
                Toast t=Toast.makeText(MainActivity6.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img3=findViewById(R.id.imageView12);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="11:40 PM BNC--->HWH 10:55 AM";
                Toast t=Toast.makeText(MainActivity6.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Button b1=findViewById(R.id.next6);
        RadioGroup rg=findViewById(R.id.radio4);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton27:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text=(t1=findViewById(R.id.textView24)).getText().toString();
                                Intent intent=new Intent(MainActivity6.this,FormActivity.class);
                                intent.putExtra("train",text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton28:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1=(t2=findViewById(R.id.textView25)).getText().toString();
                                Intent intent1=new Intent(MainActivity6.this,FormActivity.class);
                                intent1.putExtra("train",text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton29:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text2=(t3=findViewById(R.id.textView26)).getText().toString();
                                Intent intent2=new Intent(MainActivity6.this,FormActivity.class);
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

