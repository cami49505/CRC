package com.crc.medicamentos;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity_pantalla_de_medicamentos extends AppCompatActivity {

      private EditText nombreMed;
      private EditText cantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_medicamentos);

        nombreMed = findViewById(R.id.nameMed);
        cantidad = findViewById(R.id.cantidadMed);






    }

    public void SentInfo(View view ){
        Intent i = new Intent(this,MedicamentosYListaActivity.class);
        i.putExtra("infoMed",nombreMed.getText().toString());
        i.putExtra("cantidadMed",cantidad.getText().toString());
        startActivity(i);

    }


    private static void setAlarm(int i , Long timestamp , Context ctx){
        AlarmManager alarmManager = (AlarmManager) ctx.getSystemService(ALARM_SERVICE);
        Intent alarmIntent= new Intent(ctx,AlarmReceiver.class);
        PendingIntent pendingIntent;
        pendingIntent = PendingIntent.getBroadcast(ctx , i ,alarmIntent ,PendingIntent.FLAG_ONE_SHOT);
        alarmIntent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        alarmManager.set(AlarmManager.RTC_WAKEUP,timestamp,pendingIntent);
    }









}
