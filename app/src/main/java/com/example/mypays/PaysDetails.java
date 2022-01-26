package com.example.mypays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PaysDetails extends AppCompatActivity {
    private TextView nomPays, txtsuperficie;
    private ImageView imgDrapeau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays_details);
        nomPays = findViewById(R.id.nomPays);
        txtsuperficie = findViewById(R.id.txtsuperficie);
        imgDrapeau=findViewById(R.id.imgDrapeau);

        Bundle extras=getIntent().getExtras();
        String nom = extras.getString("nom");
        int sup=extras.getInt("superficie");
        int drap=extras.getInt("drapeau");

        txtsuperficie.setText("Superficie : " + String.valueOf(sup)+" km\u00B2");
        nomPays.setText(nom);
        imgDrapeau.setImageResource(drap);
    }
}