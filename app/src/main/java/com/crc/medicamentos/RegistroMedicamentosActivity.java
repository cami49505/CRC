package com.crc.medicamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroMedicamentosActivity extends AppCompatActivity {


        Button salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro_medicamentos);
        salir = findViewById(R.id.btSalir);


        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RegistroMedicamentosActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
