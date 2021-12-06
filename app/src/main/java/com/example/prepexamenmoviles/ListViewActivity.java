package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> ejemploList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.list_view_id);
        ejemploList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            ejemploList.add("Ejemplo " + i);
        }

        //importante el simple_list_item_1 ya que es propio de android
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                ListViewActivity.this,
                android.R.layout.simple_list_item_1,
                ejemploList
        );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this, "Ejemplo seleccionado es " + ejemploList.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}