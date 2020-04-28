package com.crc.medicamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro_medicamentos);
    button= findViewById(R.id.btAñadirMed1);

//    button.setText("hola");
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }
});

    }
}
