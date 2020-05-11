package com.crc.medicamentos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activitySegundaPantalla extends AppCompatActivity {

    TextView Bienvenida;
    Button Empecemos;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_pantalla);

        Bienvenida = findViewById(R.id.TextWelcome);

        Empecemos = findViewById(R.id.StartI);

        Intent intent = getIntent();

        if (intent.hasExtra("user")) {
            UsuarioM user  = (UsuarioM) intent.getSerializableExtra("user");
            if (user!= null) {
                Bienvenida.setText("Bienvenido " + user.getUsername() + "!");
            }
        }



        Empecemos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activitySegundaPantalla.this,RegistroMedicamentosActivity.class);
                startActivity(intent);
            }
        });


    }
}
