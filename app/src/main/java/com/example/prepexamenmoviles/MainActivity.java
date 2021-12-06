package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_secundario = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_secundario = findViewById(R.id.buttonSecundario);
        button_secundario.setOnClickListener(v -> clicked());
    }

    private void clicked() {
        Toast.makeText(MainActivity.this, "Abriendo ventana 2", Toast.LENGTH_SHORT).show();
        Intent ventana_secundaria = new Intent(MainActivity.this, ActivitySecundario.class);

        //Pasamos parametros
        ventana_secundaria.putExtra("cadena", "jaja, salud2");
        ventana_secundaria.putExtra("toast", "Texto del toast pasado desde Main");
        startActivity(ventana_secundaria);
    }
}