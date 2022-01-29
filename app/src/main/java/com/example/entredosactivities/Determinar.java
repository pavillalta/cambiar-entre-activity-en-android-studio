package com.example.entredosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Determinar extends AppCompatActivity {

    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar);

        recibirDatos();

        volver=(Button)findViewById(R.id.volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(Determinar.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void recibirDatos(){

        TextView nombre = (TextView) findViewById(R.id.tvNombreReci);
        TextView edad = (TextView) findViewById(R.id.tvEdadReci);
        TextView estado = (TextView) findViewById(R.id.tvEstado);
        ImageView mostrarImg = (ImageView) findViewById(R.id.imageView);


        Intent intentNombre = getIntent();
        Intent intentEdad = getIntent();


        nombre.setText(intentNombre.getStringExtra("nombre"));
        String edadtxt = intentEdad.getStringExtra("edad") + " años";
        edad.setText(edadtxt);

        String numCadena = intentEdad.getStringExtra("edad");
        numCadena.trim().replaceAll(" ", "");
        int numEntero = Integer.parseInt(numCadena);

        if(numEntero < 18){
            estado.setText("Eres menor de edad");
            mostrarImg.setImageResource(R.mipmap.jovenes_3);
        }else{
            estado.setText("Eres mayor de edad");
            mostrarImg.setImageResource(R.mipmap.jovenes_1);
        }



    }

}