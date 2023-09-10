package com.example.railwaysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_main);
        EditText tv1 = findViewById(R.id.editTextTextPersonName3);
        EditText e = findViewById(R.id.editTextNumber);
        EditText e2=findViewById(R.id.editTextNumber2);
        String trainTravel=getIntent().getStringExtra("train");
        Button button = findViewById(R.id.genSms);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("") || (tv1.getText().toString().equals("") && e.getText().toString().length()!=10)){
                    String text="Please don't leave any field empty";
                    int dur=Toast.LENGTH_SHORT;
                    Toast t=Toast.makeText(FormActivity.this,text,dur);
                    t.show();
                }
                else if(e.getText().toString().length()!=10){
                    String text="Please enter your number correctly";
                    int dur=Toast.LENGTH_SHORT;
                    Toast t=Toast.makeText(FormActivity.this,text,dur);
                    t.show();
                }
                else if(e2.getText().toString().equals("") || e2.getText().toString().length()>=3){
                    Toast t=Toast.makeText(FormActivity.this,"Please enter your age correctly",Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    String phone=e.getText().toString();
                    String name=tv1.getText().toString();
                    String age=e2.getText().toString();
                    Random rand=new Random();
                    int min=1,max=70;
                    int seatNumber=rand.nextInt((max-min)+1)+min;
                    int a1=Integer.parseInt(age);
                    if(a1>=60){
                        String message="Since you are above 60, the Ticket is free!! Your age is "+a1;
                        SmsManager smsManager=SmsManager.getDefault();
                        smsManager.sendTextMessage(phone,null,message,null,null);
                        Intent intent=new Intent(FormActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        String message = "Congratulations " + name + "!! You have successfully booked a ticket in " + trainTravel + " with seat number as " + seatNumber + " and age " + a1;
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phone, null, message, null, null);
                        Intent intent = new Intent(FormActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }


            }
        });

    }
}


