package com.example.gerirhospital_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Medicos extends AppCompatActivity {
    Spinner genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicos);


        genero = (Spinner) findViewById(R.id.spinnerGenero);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Sexo,android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
    }
}