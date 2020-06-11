package com.example.gerirhospital_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Paciente extends AppCompatActivity {
    Spinner genero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);

        genero = (Spinner) findViewById(R.id.spinnerGenero);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Sexo,android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);

        /*Para verificar qual o item escolhido --- Video nos favoritos
            Button Gravar = (Button) findViewById(R.id.buttonGravar);
            Gravar.setOnClickListener(){
                @Override
                public void onClick(view v){
                    String item = genero.getSelectItem().ToString();
                    Toast.makeText(getApplicationContext(),"Item escolhido"+item,Toast.LENGHT_SHORT).show();
                }
            }
        */
    }


}