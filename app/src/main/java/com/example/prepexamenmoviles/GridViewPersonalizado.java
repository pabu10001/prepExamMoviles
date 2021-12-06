package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridViewPersonalizado extends AppCompatActivity {

    private GridView gridView;
    private List<Ejemplo> ejemploList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_personalizado);

        gridView = findViewById(R.id.gridView_personalizado);
        ejemploList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            ejemploList.add(new Ejemplo("Titulo: "+ i, "Subtitulo " + i, i));
        }

        MiAdaptador miAdaptador = new MiAdaptador(
                this,
                R.layout.ejemplo_item,
                ejemploList
        );

        gridView.setAdapter(miAdaptador);
        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(GridViewPersonalizado.this, ejemploList.get(position) + "", Toast.LENGTH_SHORT).show());
    }
}