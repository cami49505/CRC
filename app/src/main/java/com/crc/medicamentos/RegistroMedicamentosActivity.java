package com.crc.medicamentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroMedicamentosActivity extends AppCompatActivity {


    Button salir;
    Button addMed,regMed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_medicamentos);

        salir = findViewById(R.id.btSalir);
        addMed = findViewById(R.id.addMed);
        regMed = findViewById(R.id.registerMed);

        addMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegistroMedicamentosActivity.this , activity_pantalla_de_medicamentos.class);
                startActivity(i);
            }
        });

        regMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(RegistroMedicamentosActivity.this ,MedicamentosYListaActivity.class);
                startActivity(j);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroMedicamentosActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        // ros
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserSharedPreferencesManager.deleteUser();
                Intent intent = new Intent();
                finish();
            }
        });







    }




}