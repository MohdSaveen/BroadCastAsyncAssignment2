package com.example.broadcastasyncassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
Button btnDone;
EditText editText1;
EditText editText2;
EditText editText3;
EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnDone=findViewById(R.id.button2);
        editText1=findViewById(R.id.editTextTextPersonName);
        editText2=findViewById(R.id.editTextTextPersonName2);
        editText3=findViewById(R.id.editTextTextPersonName3);
        editText4=findViewById(R.id.editTextTextPersonName4);



        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("Data");
                intent.putExtra("FirstName",editText1.getText().toString());
                intent.putExtra("LastName",editText2.getText().toString());
                intent.putExtra("Age",editText3.getText().toString());
                intent.putExtra("Occupation",editText4.getText().toString());
                LocalBroadcastManager.getInstance(MainActivity2.this).sendBroadcast(intent);
                finish();
            }
        });


    }
}