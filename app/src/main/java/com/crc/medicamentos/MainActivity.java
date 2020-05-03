package com.crc.medicamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    ProgressBar progressBar;
    EditText EditTextusername;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            loginButton = findViewById(R.id.loginButton);
            progressBar = findViewById(R.id.loadingProgressBar);
            EditTextusername  = findViewById(R.id.username);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressBar.setVisibility(View.VISIBLE);



                    // abrir otro activity

                    Intent intent = new Intent(MainActivity.this, activitySegundaPantalla.class);

                    UsuarioM user = new UsuarioM(EditTextusername.getText().toString());
                    intent.putExtra("user",user);

                    startActivity(intent);
                }
            });












        //button= findViewById(R.id.btAñadirMed1);


//    button.setText("hola");
//button.setOnClickListener(new View.OnClickListener() {
    //@Override
    //public void onClick(View v) {
      //  button.setOnLongClickListener(new View.OnLongClickListener() {
        //    @Override
          //  public boolean onLongClick(View v) {
            //    return false;
      //      }
    //    });
  //  }
//});

    }
}
