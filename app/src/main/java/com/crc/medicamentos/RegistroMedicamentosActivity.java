package com.crc.medicamentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroMedicamentosActivity extends AppCompatActivity {


        Button salir;
        Button añadirM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_medicamentos);


        añadirM= findViewById(R.id.btAñadirMed1);
        salir = findViewById(R.id.btSalir);


        añadirM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroMedicamentosActivity.this,activity_pantalla_de_medicamentos.class);
                startActivity(intent);
            }
        });


        //salir.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent= new Intent(RegistroMedicamentosActivity.this,MainActivity.class);
                //startActivity(intent);

            //}
        //});

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
