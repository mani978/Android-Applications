package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText eT = findViewById(R.id.editTextTextPersonName);
        final Button btn = findViewById(R.id.button);
        final ListView list = findViewById(R.id.listView);
        final Button btn2 = findViewById(R.id.button2);





        ArrayList items = new ArrayList();
        ArrayAdapter<String> aD=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        list.setAdapter(aD);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemText = eT.getText().toString();



                if(!(itemText.equals(""))){
                    items.add(itemText);
                    aD.notifyDataSetChanged();
                    eT.setText(null);


                }
                else{
                    Toast.makeText(getApplicationContext(), "Please Enter Your Task ", Toast.LENGTH_SHORT).show();
                }


            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "Item is removed", Toast.LENGTH_SHORT).show();
                items.remove(i);
                aD.notifyDataSetChanged();

                return false;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.clear();
            }
        });
    }


}