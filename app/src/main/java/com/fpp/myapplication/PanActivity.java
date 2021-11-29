package com.fpp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PanActivity extends AppCompatActivity {

    private TextView imie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan);

        imie = findViewById(R.id.imie);
        Intent intentPan= getIntent();
        Bundle b = intentPan.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("name");
            imie.setText(j);
        }


    }

    public void dalejResultPan(View view){

    }
}