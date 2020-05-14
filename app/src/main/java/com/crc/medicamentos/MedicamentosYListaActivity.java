package com.crc.medicamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MedicamentosYListaActivity extends AppCompatActivity {


    private ListView mListView ;
    private List<Medicamento> mList = new ArrayList<>();
    ListAdapter mAdapter;
    Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamentos_y_lista);

        mListView = findViewById(R.id.listaMed);


        SharedPreferences save =getSharedPreferences("lista",this.MODE_PRIVATE);

        mList.add(new Medicamento("paracetamol","2",R.mipmap.ic_launcher));

        final String nombreMed = getIntent().getStringExtra("infoMed");
        final String CantidadMed = getIntent().getStringExtra("cantidadMed");

        mList.add(new Medicamento(nombreMed,CantidadMed,R.mipmap.ic_launcher));

        mAdapter = new ListAdapter(MedicamentosYListaActivity.this,R.layout.item_med,mList);



        mListView.setAdapter(mAdapter);
        backButton=findViewById(R.id.btnBackList);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences save = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor editor = save.edit();
                editor.putString("listadatos",nombreMed);
                editor.putString("cantiddatos",CantidadMed);
                editor.commit();
                Intent i = new Intent(MedicamentosYListaActivity.this,RegistroMedicamentosActivity.class);
                startActivity(i);

            }
        });





    }

}
