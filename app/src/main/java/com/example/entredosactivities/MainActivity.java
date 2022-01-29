package com.example.entredosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button siguiente = (Button) findViewById(R.id.siguiente);
        Button controlsBasics = (Button) findViewById(R.id.controlsBasics);
        final EditText tvNombre = (EditText) findViewById(R.id.etNombre);
        final EditText tvEdad = (EditText) findViewById(R.id.etEdad);

        controlsBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent controls = new Intent(getApplicationContext(), ControlesBasicos.class);
                startActivity(controls);

            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent siga = new Intent(getApplicationContext(), Determinar.class);
                siga.putExtra("nombre",tvNombre.getText().toString());
                siga.putExtra("edad",tvEdad.getText().toString());
                startActivity(siga);

            }
        });



    }
}