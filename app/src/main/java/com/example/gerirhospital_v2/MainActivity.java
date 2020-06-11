package com.example.gerirhospital_v2;

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

    public void botaoPaciente(View view){

        Intent intent = new Intent(this, Paciente.class);
        startActivity(intent);
    }

    public void buttonMedicos(View view){

        Intent intent = new Intent(this, Medicos.class);
        startActivity(intent);
    }

    public void botaoMaterial(View view){

        Intent intent = new Intent(this, MaterialMedico.class);
        startActivity(intent);
    }


    public void botaoDespesas(View view){

        Intent intent = new Intent(this, Despesas.class);
        startActivity(intent);
    }

}