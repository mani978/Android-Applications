package com.example.pcmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText E1 = findViewById(R.id.E1);
        EditText E2 = findViewById(R.id.E2);
        EditText E3 = findViewById(R.id.E3);
        EditText E4 = findViewById(R.id.E4);
        TextView T1 = findViewById(R.id.T1);
        Button B1 = findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = E1.getText().toString();
                Double p = Double.parseDouble(E2.getText().toString());
                Double c = Double.parseDouble(E3.getText().toString());
                Double m = Double.parseDouble(E4.getText().toString());

                Double marks = p+c+m;

                Double per = (marks/300)*100;
                int fee = 200000;

                if(per >=90){
                    int fp = 200000/100;
                    fp = fp * 80;
                    T1.setText("Student Id :" +i+ "\n"+"Physics Marks :"+p+"\n"+"Chemistry Marks :"+c+"\n"+"Maths Marks :"+m+"\n"+"Your Percentage is :"+df.format(per)+"\n"+"Congratulations ...! You Got Upto 80% Concession Based On Your Marks"+"\n"+"The Fee Amount Need To Pay is : "+fp);



                }
                else if(per < 89 && per > 70){
                    int fp = 200000/100;
                    fp = fp * 60;

                    T1.setText("Student Id :" +i+ "\n"+"Physics Marks :"+p+"\n"+"Chemistry Marks :"+c+"\n"+"Maths Marks :"+m+"\n"+"Your Percentage is :"+df.format(per)+"\n"+"Congratulations ....! You Got Upto 60% Concession Based On Your Marks"+"\n"+"The Fee Amount Need To Pay is : "+fp);

                }
                else if(per < 69){


                    T1.setText("Student Id :" +i+ "\n"+"Physics Marks :"+p+"\n"+"Chemistry Marks :"+c+"\n"+"Maths Marks :"+m+"\n"+"Your Percentage is :"+df.format(per)+"\n"+"Sorry ! You Got No Concession "+"\n"+"The Fee Amount Need To Pay is : "+fee);

                }



            }
        });
    }
}