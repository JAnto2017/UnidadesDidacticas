package com.example.unidadesdidacticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //---------------------------------------------------------------------------------------------- View INTRODUCCIÓN
    public void goPrimer_1 (View v){
        Intent i = new Intent(this,Introduccion_1.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- View IDENTIFICACIÓN
    public void goSegundo_2 (View v){
        Intent i = new Intent(this,Identificacion_1.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- View DATOS TÉCNICOS
    public void goTercero_3 (View v){
        Intent i = new Intent(this,DatosTecnicos_2.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- View FUNDAMENTACIÓN CURRICULAR
    public void goCuarto_4 (View v){
        Intent i = new Intent(this,FundamentacionCurricular_3.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- View FUNDAMENTACIÓN METODOLÓGICAS
    public void goQuinto_5 (View v){
        Intent i = new Intent(this,FundamentaMetodo_4.class);
        startActivity(i);
    }
}
