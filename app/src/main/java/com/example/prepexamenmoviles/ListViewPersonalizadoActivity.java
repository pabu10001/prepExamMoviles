package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewPersonalizadoActivity extends AppCompatActivity {

    private ListView listView;
    private List<Ejemplo> ejemploList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_personalizado);

        listView = findViewById(R.id.listViewPersonalizado);

        ejemploList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ejemploList.add(new Ejemplo("titulo " + i, "subtitulo " + i, i));
        }

        MiAdaptador miAdaptador = new MiAdaptador(
                this,
                R.layout.ejemplo_item,
                ejemploList
        );

        listView.setAdapter(miAdaptador);
    }
}