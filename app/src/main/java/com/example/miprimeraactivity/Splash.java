package com.example.miprimeraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.List;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it= new Intent(getApplicationContext(), MainActivity.class);
                /*it.putExtra("Nombre","Carlos");
                it.putExtra("Edad","20");*/

                /*persona pp= new persona("Carlos",20);
                it.putExtra("Persona",pp);
                startActivity(it);*/
            }
        }, 4000);
    }
}
