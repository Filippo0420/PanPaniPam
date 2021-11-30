package com.fpp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView plec;
    private TextView imie;
    private TextView nazwisko;
    private TextView nazwiskopanienskie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        plec = findViewById(R.id.panpani);
        imie = findViewById(R.id.imie);
        nazwisko = findViewById(R.id.nazwisko);
        nazwiskopanienskie = findViewById(R.id.panienskie);

        Intent intentPan= getIntent();
        Bundle b = intentPan.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("plec");
            plec.setText(j);

            String j1 =(String) b.get("name");
            imie.setText(j1);

            String j2 =(String) b.get("surname");
            nazwisko.setText(j2);

            String j3 =(String) b.get("panienskie");
            nazwiskopanienskie.setText(j3);

        }
    }
}

