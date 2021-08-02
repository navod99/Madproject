package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView regNo;
    private TextView name;
    private TextView batchID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regNo=findViewById(R.id.textView2);
        regNo.setText(R.string.REGNO);

        name=findViewById(R.id.textView3);
        name.setText(R.string.NAME);

        batchID=findViewById(R.id.textView4);
        batchID.setText(R.string.BATCHID);

    }
}