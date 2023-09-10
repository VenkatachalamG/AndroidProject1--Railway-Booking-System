package com.example.railwaysystem;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity5 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String text="Choose your Train from Bangalore to Chennai";
        int dur= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText( MainActivity5.this,text,dur);
        t.show();

        ImageView img=findViewById(R.id.imageView4);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="11:50 PM SBC--->MAS 6:45 PM";
                Toast t=Toast.makeText(MainActivity5.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img2=findViewById(R.id.imageView5);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="6:20 AM SBC--->MAS 12:15 PM";
                Toast t=Toast.makeText(MainActivity5.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });

        ImageView img3=findViewById(R.id.imageView6);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="4:20 AM SBC--->MAS 9:30 PM";
                Toast t=Toast.makeText(MainActivity5.this,info,Toast.LENGTH_SHORT);
                t.show();
            }
        });
        Button b1=findViewById(R.id.next5);
        RadioGroup rg=findViewById(R.id.radio3);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton24:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text=(t1=findViewById(R.id.textView21)).getText().toString();
                                Intent intent=new Intent(MainActivity5.this,FormActivity.class);
                                intent.putExtra("train",text);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.radioButton25:
                        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String text1=(t2=findViewById(R.id.textView22)).getText().toString();
                                Intent intent1=new Intent(MainActivity5.this,FormActivity.class);
                                intent1.putExtra("train",text1);
                                startActivity(intent1);
                            }
                        });
                        break;
                    case R.id.radioButton26:
                       b1.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               String text2=(t3=findViewById(R.id.textView23)).getText().toString();
                               Intent intent2=new Intent(MainActivity5.this,FormActivity.class);
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

