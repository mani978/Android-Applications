package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private static DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("BMI Calculator");


        final EditText editText3 = (EditText) findViewById(R.id.editText3);
         final EditText editText4 = findViewById(R.id.editText4);
         final TextView textView4 = findViewById(R.id.textView4);


        Button btn6 = findViewById(R.id.button6);
        Button btn8 = findViewById(R.id.button8);



        List<String> categories = new ArrayList<>();
        categories.add("Centimeters");
        categories.add("Feet");
        categories.add("Inches");




        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float w = Float.parseFloat(editText4.getText().toString());
                Float h = Float.parseFloat(editText3.getText().toString());
                Float b = (w / h / h) * 10000;
                String u = "UnderWeight";
                String n = "Normal Weight";
                String o = "Overweight";
                String ob = "Obesity";


                textView4.setText(df.format(b).toString());
                if (b < 18.5) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                } else if (b > 18.5 || b < 24.9) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                } else if (b >= 25 || b > 29.9) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                }


            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText3.setText("");
                editText4.setText("");
                textView4.setText("");
            }
        });

    }



}