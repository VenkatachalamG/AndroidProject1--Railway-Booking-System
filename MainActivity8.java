package com.example.railwaysystem;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity8 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        String text="Choose your Train from Kolkata to Chennai";
        int dur= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText( MainActivity8.this,text,dur);
        t.show();

        ImageView img=findViewById(R.id.imageView16);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="2:50 PM HWH--->MAS 5:00 PM";
                Toast t=Toast.makeText(MainActivity8.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2=findViewById(R.id.imageView17);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="11:45 PM HWH--->MAS 3:50 AM";
                Toast t=Toast.makeText(MainActivity8.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img3=findViewById(R.id.imageView18);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="4:10 PM HWH--->TBM 8:48 PM";
                Toast t=Toast.makeText(MainActivity8.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Button b1=findViewById(R.id.next8);
        RadioGroup rg=findViewById(R.id.radio6);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton33:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text=(t1=findViewById(R.id.textView30)).getText().toString();
                                Intent intent=new Intent(MainActivity8.this,FormActivity.class);
                                intent.putExtra("train",text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton34:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1=(t2=findViewById(R.id.textView31)).getText().toString();
                                Intent intent1=new Intent(MainActivity8.this,FormActivity.class);
                                intent1.putExtra("train",text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton35:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text2=(t3=findViewById(R.id.textView32)).getText().toString();
                                Intent intent2=new Intent(MainActivity8.this,FormActivity.class);
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

