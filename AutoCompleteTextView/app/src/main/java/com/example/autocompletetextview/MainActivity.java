package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView A1 = findViewById(R.id.A1);
        EditText a = findViewById(R.id.a);
        EditText a1 = findViewById(R.id.a2);
        Button btn1 = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView3);
        Button btn2 = findViewById(R.id.button2);

        String[] courses={"Karnataka","Andhra Pradesh","Tamil Nadu","Kerala","Maharastra","Goa","Odisha"};

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,courses);

        A1.setAdapter(aa);

        A1.setThreshold(2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = a.getText().toString();
                String course = A1.getText().toString();
                String mail = a1.getText().toString();

                textView.setText("Student Name : " +name+ "\n"+"Student Mail Id :" +mail+"\n"+"Place Of Birth :" +course);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setText(null);
                A1.setText(null);
                a1.setText(null);
                textView.setText(null);
            }
        });




    }
}