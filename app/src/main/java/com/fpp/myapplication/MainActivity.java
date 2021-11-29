package com.fpp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button dalej;
    private CheckBox robot;

    boolean pan, pani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dalej = findViewById(R.id.dalej);
        robot = findViewById(R.id.czyRobot);

        dalej.setEnabled(false);

        robot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    dalej.setEnabled(true);
                }else{
                    dalej.setEnabled(false);
                }
            }
        });

    }

    public void dalej(View view){
        EditText imie = findViewById(R.id.imie);

        Intent intentPani = new Intent(MainActivity.this, PaniActivity.class);
        Intent intentPan = new Intent(MainActivity.this, PanActivity.class);

        String imieS = imie.getText().toString();

        if(imieS.length() > 0){
            validateName(imieS);

            if(pani){
                intentPani.putExtra("name", imieS);
                startActivity(intentPani);
            }

            if(pan){
                intentPan.putExtra("name", imieS);
                startActivity(intentPan);
            }
        }else{
            imie.setError("Puste pole");
        }



    }

    public void validateName(String Name) {
        if(Name.matches(".*a")){
            pani = true;
        }else{
            pan = true;
        }
    }
}