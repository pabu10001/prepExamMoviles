package com.example.prepexamenmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PruebaLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_layouts);

        /*
        teoria

        LinearLayout --> sencillos
        RelativeLayout --> nunca
        ConstraintLayout --> default
        FrameLayout --> varias vistas superpuestas
        AbsoluteLayout --> nunca
         */
    }
}