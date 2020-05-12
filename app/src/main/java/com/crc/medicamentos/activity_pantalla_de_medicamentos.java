package com.crc.medicamentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_pantalla_de_medicamentos extends AppCompatActivity {

        Button añadirA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_medicamentos);


        añadirA=findViewById(R.id.alarmbutton);

        añadirA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_pantalla_de_medicamentos.this,AlarmaActivity.class);
                startActivity(intent);
            }
        });
    }






}
