package com.fpp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PaniActivity extends AppCompatActivity {

    private TextView imie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pani);

        imie = findViewById(R.id.imie);
        Intent intentPan= getIntent();
        Bundle b = intentPan.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("name");
            imie.setText(j);
        }
    }

    public void dalejResultPani(View view){
        EditText nazwisko = findViewById(R.id.nazwisko);
        EditText nazwiskoP = findViewById(R.id.nazwiskopanienskie);
        imie = findViewById(R.id.imie);

        String nazwiskoS = nazwisko.getText().toString();
        String imieS = imie.getText().toString();
        String nazwiskoPS = nazwiskoP.getText().toString();

        Intent intentresultpani = new Intent(PaniActivity.this, ResultActivity.class);
        intentresultpani.putExtra("name", imieS);
        intentresultpani.putExtra("surname", nazwiskoS);
        intentresultpani.putExtra("plec", "Pani");
        intentresultpani.putExtra("panienskie", nazwiskoPS);

        startActivity(intentresultpani);
    }
}