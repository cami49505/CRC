package com.crc.medicamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class AlarmaActivity extends AppCompatActivity {

    Button tonos;


    CheckBox cbLunes;
    CheckBox cbMartes;
    CheckBox cbMiercoles;
    CheckBox cbJueves;
    CheckBox cbViernes;
    CheckBox cbSabado;
    CheckBox cbDomingo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);


        cbLunes = findViewById(R.id.cbLunes);
        cbMartes = findViewById(R.id.cbMartes);
        cbMiercoles = findViewById(R.id.cbMiercoles);
        cbJueves = findViewById(R.id.cbJueves);
        cbViernes = findViewById(R.id.cbViernes);
        cbSabado = findViewById(R.id.cbSabado);
        cbDomingo = findViewById(R.id.cbDomingo);

        cbLunes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(AlarmaActivity.this, "Alarma activada los lunes", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(AlarmaActivity.this, "Alarma desactivada los lunes", Toast.LENGTH_SHORT).show();
                }
            }
        });


        cbMartes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(AlarmaActivity.this, "Alarma activada los martes", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(AlarmaActivity.this, "Alarma desactivada los martes", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}