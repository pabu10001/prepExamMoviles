package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_secundario = null;
    Button button_alarma = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_secundario = findViewById(R.id.buttonSecundario);
        button_secundario.setOnClickListener(v -> secundario_clicked());

        button_alarma = findViewById(R.id.buttonAlarma);
        button_alarma.setOnClickListener(v -> alarma());

    }

    private void secundario_clicked() {
        Toast.makeText(MainActivity.this, "Abriendo ventana 2", Toast.LENGTH_SHORT).show();
        Intent ventana_secundaria = new Intent(MainActivity.this, ActivitySecundario.class);

        //Pasamos parametros
        ventana_secundaria.putExtra("cadena", "jaja, salud2");
        ventana_secundaria.putExtra("toast", "Texto del toast pasado desde Main");
        startActivity(ventana_secundaria);
    }

    private void alarma(){

        //Para que esto funcione hay que añadir permisos al android manifest

        /*
            <uses-permission android:name="com.android.alarm.permission.SET_ALARM"/>
         */

        /*
        Tambien pone esto, pero yo no lo he usado y funciona

        <action android:name="android.intent.action.SET_ALARM" />
           dentro del <intent-filter>
         */
        Intent alarma = new Intent(AlarmClock.ACTION_SET_ALARM);
        alarma.putExtra(AlarmClock.EXTRA_MESSAGE, "mensaje alarma");
        alarma.putExtra(AlarmClock.EXTRA_HOUR, 10);
        alarma.putExtra(AlarmClock.EXTRA_MINUTES, 15);
        startActivity(alarma);
    }
}