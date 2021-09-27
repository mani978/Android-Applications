package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textView2 = findViewById(R.id.textView2);

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);

        Button btn7 = findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(editText1.getText().toString());
                Integer n2 = Integer.parseInt(editText2.getText().toString());
                Integer res = n1+n2;

                Toast.makeText(getApplicationContext(),res.toString(), Toast.LENGTH_LONG ).show();

                textView2.setText(res.toString());


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(editText1.getText().toString());
                Integer n2 = Integer.parseInt(editText2.getText().toString());
                Integer res = n1-n2;

                Toast.makeText(getApplicationContext(),res.toString(), Toast.LENGTH_LONG ).show();

                textView2.setText(res.toString());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(editText1.getText().toString());
                Integer n2 = Integer.parseInt(editText2.getText().toString());
                Integer res = n1*n2;

                Toast.makeText(getApplicationContext(),res.toString(), Toast.LENGTH_LONG ).show();

                textView2.setText(res.toString());

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(editText1.getText().toString());
                Integer n2 = Integer.parseInt(editText2.getText().toString());
                Integer res = n1/n2;

                Toast.makeText(getApplicationContext(),res.toString(), Toast.LENGTH_LONG ).show();

                textView2.setText(res.toString());

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(null);
                editText1.setText(null);
                editText2.setText(null);
            }
        });



        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}