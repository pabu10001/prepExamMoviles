package com.example.prepexamenmoviles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<Ejemplo> {

    Context ctx;
    int layoutTemplate;
    List<Ejemplo> ejemploList;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        Ejemplo elementoActual = ejemploList.get(position);

        TextView textViewTitulo = view.findViewById(R.id.textTitulo);
        TextView textViewSubtitulo = view.findViewById(R.id.textSubtitulo);
        TextView textViewNumero = view.findViewById(R.id.textNumero);

        textViewTitulo.setText(elementoActual.getTitulo());
        textViewSubtitulo.setText(elementoActual.getSubtitulo());
        textViewNumero.setText(elementoActual.getNumero() + "");

        return view;
    }
}
