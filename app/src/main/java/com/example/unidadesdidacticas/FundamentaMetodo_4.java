package com.example.unidadesdidacticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FundamentaMetodo_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamenta_metodo_4);
    }

    //---------------------------------------------------------------------------------------------- RETORNO A LA PÁG PPAL.
    public void back_5 (View v){
        finish();
    }

    //---------------------------------------------------------------------------------------------- VIEW MODELOS DE ENSEÑANZA
    public void goPrimera_II (View v){
        Intent i = new Intent(this,ModelosEnsenianza_41.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- VIEW FUNDAMENTOS METODOLÓGICOS
    public void goSegunda_II (View v){
        Intent i = new Intent(this,FundamentoMetodolog_42.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- VIEW SECUENCIA DE ACTIVIDADES
    public void goTercera_II (View v){
        Intent i = new Intent(this,SecuenciaActividades_43.class);
        startActivity(i);
    }
}
