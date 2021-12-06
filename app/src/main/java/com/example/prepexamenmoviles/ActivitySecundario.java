package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecundario extends AppCompatActivity {

    TextView text_secundario;
    String cadena;
    String texto_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundario);

        text_secundario = findViewById(R.id.textSecundario);
        //Recoger parametros entrada
        Bundle bundle = getIntent().getExtras();
        cadena = bundle.getString("cadena");
        texto_toast = bundle.getString("toast");

        //Usamos esos parametros
        Toast.makeText(ActivitySecundario.this, texto_toast, Toast.LENGTH_SHORT).show();
        text_secundario.setText(cadena);
    }


}