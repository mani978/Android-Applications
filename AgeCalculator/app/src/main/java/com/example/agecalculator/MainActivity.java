package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
int d , m , y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText1 = findViewById(R.id.editText1);
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        ImageView imageView = findViewById(R.id.imageView1);
        TextView textView = findViewById(R.id.textView2);



        Calendar c = Calendar.getInstance();
        int dd = c.get(Calendar.DATE);
        int mm = c.get(Calendar.MONTH);
        int yy = c.get(Calendar.YEAR);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Your Date Of Birth Is "+d+"/"+(m+1)+"/"+y+"\n"+"Your Age Is "+(yy-y));

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int i,
                                          int i1, int i2) {
                        d=i2;
                        m=i1;
                        y=i;
                        editText1.setText(i2+"/"+(i1+1)+"/"+i);

                    }
                },dd,mm,yy);
                datePickerDialog.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(null);
                textView.setText(null);
            }
        });

    }
}