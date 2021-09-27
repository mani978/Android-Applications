package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    private static DecimalFormat df = new DecimalFormat("0.0");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        RadioGroup radioGroup = findViewById(R.id.radioGroup2);
      RadioGroup radioGroup1 = findViewById(R.id.radioGroup3);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textView2 = findViewById(R.id.textView2);



        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        String u = "UnderWeight";
        String n = "Normal Weight";
        String o = "Overweight";
        String ob = "Obesity";



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double w = Double.parseDouble(editText2.getText().toString());
                Double h = Double.parseDouble(editText1.getText().toString());
                int radioId = radioGroup.getCheckedRadioButtonId();
                int id = radioGroup1.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                radioButton = findViewById(id);

                if (radioId == R.id.radioButton1  && id == R.id.radioButton5)
                {




                    h = h* 12 ;
                    Double b = (w / (h*h)) ;
                    b = b * 703;
                    textView2.setText(df.format(b).toString());


                if (b < 18.5) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                } else if (b > 18.5 && b < 24.9) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                } else if (b > 25 && b > 29.9) {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                }
            }

               else if (radioId == R.id.radioButton1  && id == R.id.radioButton4)
                {




                    h = h/ 3.281 ;
                    Double b = w /(h*h) ;
                    //b = b * 703;
                    textView2.setText(df.format(b).toString());


                    if (b < 18.5) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                    } else if (b > 18.5 && b < 24.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                    } else if (b > 25 && b > 29.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                    }
                }



                 else if(radioId == R.id.radioButton2) {

                    Double b = w / (h * h);
                    textView2.setText(df.format(b).toString());
                    if (b < 18.5) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                    } else if (b > 18.5 && b < 24.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                    } else if (b > 25 && b < 29.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                    }
                }


                else if(radioId == R.id.radioButton3 && id == R.id.radioButton4 ) {



                    Double b = (w / h / h) * 10000;

                    textView2.setText(df.format(b).toString());
                    if (b < 18.5) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                    } else if (b > 18.5 && b < 24.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                    } else if (b > 25 && b > 29.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                    }

                }



                else if(radioId == R.id.radioButton3 && id == R.id.radioButton5 ) {


                    w = w/2.2046;
                    Double b = (w / h / h) * 10000;

                    textView2.setText(df.format(b).toString());
                    if (b < 18.5) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + u, Toast.LENGTH_LONG).show();

                    } else if (b > 18.5 && b < 24.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + n, Toast.LENGTH_LONG).show();
                    } else if (b > 25 && b > 29.9) {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + o, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Your BMI is " + df.format(b) + " " + ob, Toast.LENGTH_LONG).show();
                    }

                }

                else{
                    Toast.makeText(getApplicationContext(), "This BMI Doesn't Look Right,Make Sure Height And Weight Are Entered Correct"   , Toast.LENGTH_LONG).show();
                }







        }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

                editText1.setText(null);
                editText2.setText(null);
                textView2.setText(null);
                radioGroup.clearCheck();
                radioGroup1.clearCheck();
            }
        });
    }
    public void onRadioButtonClicked(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

    }


}