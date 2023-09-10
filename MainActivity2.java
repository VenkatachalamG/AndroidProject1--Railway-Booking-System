package com.example.railwaysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner = findViewById(R.id.spinnerDropDownMenu);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Source, android.R.layout.simple_spinner_dropdown_item);
        Spinner spinnerdest = findViewById(R.id.spinnerDropDownMenu2);
        spinner.setAdapter(adapter);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Destination, android.R.layout.simple_spinner_dropdown_item);
        spinnerdest.setAdapter(adapter1);
        Spinner spinnerdate = findViewById(R.id.spinnerDate);
        ArrayAdapter<CharSequence> adapterdate = ArrayAdapter.createFromResource(this, R.array.Date, android.R.layout.simple_spinner_dropdown_item);
        spinnerdate.setAdapter(adapterdate);
        Spinner spinnermonth = findViewById(R.id.spinnerMonth);
        ArrayAdapter<CharSequence> adaptermonth = ArrayAdapter.createFromResource(this, R.array.Month, android.R.layout.simple_spinner_dropdown_item);
        spinnermonth.setAdapter(adaptermonth);
        Spinner spinneryear = findViewById(R.id.spinnerYear);
        ArrayAdapter<CharSequence> adapteryear = ArrayAdapter.createFromResource(this, R.array.Year, android.R.layout.simple_spinner_dropdown_item);
        spinneryear.setAdapter(adapteryear);
            Button button1 = findViewById(R.id.buttonProceed);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if((spinner.getSelectedItem().toString()).equals(spinnerdest.getSelectedItem().toString())){
                        String error="Please choose different destination";
                        Toast toast=Toast.makeText(MainActivity2.this,error,Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else if((spinner.getSelectedItem().toString()).equals("Chennai") && (spinnerdest.getSelectedItem().toString()).equals("Bangalore")){
                        Intent intent3=new Intent(MainActivity2.this,MainActivity3.class);
                        startActivity(intent3);

                    }
                    else if((spinner.getSelectedItem().toString()).equals("Chennai") && (spinnerdest.getSelectedItem().toString()).equals("Kolkata")){
                        Intent intent4=new Intent(MainActivity2.this,MainActivity4.class);
                        startActivity(intent4);

                    }
                    else if((spinner.getSelectedItem().toString()).equals("Bangalore") && (spinnerdest.getSelectedItem().toString()).equals("Chennai")){
                        Intent intent5=new Intent(MainActivity2.this,MainActivity5.class);
                        startActivity(intent5);
                    }
                    else if((spinner.getSelectedItem().toString()).equals("Bangalore") && (spinnerdest.getSelectedItem().toString()).equals("Kolkata")){
                        Intent intent6=new Intent(MainActivity2.this,MainActivity6.class);
                        startActivity(intent6);
                    }
                    else if((spinner.getSelectedItem().toString()).equals("Kolkata") && (spinnerdest.getSelectedItem().toString()).equals("Bangalore")){
                        Intent intent7=new Intent(MainActivity2.this,MainActivity7.class);
                        startActivity(intent7);
                    }
                    else {
                        Intent intent8=new Intent(MainActivity2.this,MainActivity8.class);
                        startActivity(intent8);
                    }
                }
            });
            
        }
    }

