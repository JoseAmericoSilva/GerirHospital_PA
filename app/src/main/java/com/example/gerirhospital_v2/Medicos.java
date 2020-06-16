package com.example.gerirhospital_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Medicos extends AppCompatActivity {
    Spinner genero;
    Button btn_Gravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicos);


        genero = (Spinner) findViewById(R.id.spinnerGenero);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Sexo,android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);


    }
    public void inicializarObjetos(){
    //    et_codigo = (EditText) findViewById(R.id.EditTextNome);
    }
}