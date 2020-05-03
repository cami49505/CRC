package com.crc.medicamentos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activitySegundaPantalla extends AppCompatActivity {

    TextView Bienvenida;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_pantalla);

        Bienvenida = findViewById(R.id.TextWelcome);
        Intent intent = getIntent();

        if (intent.hasExtra("user")) {
            UsuarioM user  = (UsuarioM) intent.getSerializableExtra("user");
            if (user!= null) {
                Bienvenida.setText("Bienvenido " + user.getUsername() + "!");
            }
        }



    }
}
