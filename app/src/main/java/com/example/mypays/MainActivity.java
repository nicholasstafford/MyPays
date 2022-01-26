package com.example.mypays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private List<pays> paysList;
    private PaysAdapter paysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.recyclerView.getContext(),
                DividerItemDecoration.VERTICAL));
        paysList = new ArrayList<>();

        paysList.add(new pays("Afganistan",R.drawable.afghanistan,652860,R.drawable.mapafg,"Kabul"));
        paysList.add(new pays("Algérie",R.drawable.algeria,2382000));
        paysList.add(new pays("Andorre",R.drawable.andorra,468));
        paysList.add(new pays("Belgique",R.drawable.belgium,30689));
        paysList.add(new pays("Bolivie",R.drawable.bolivia,1099000));
        paysList.add(new pays("Bénin",R.drawable.benin,114763));
        paysList.add(new pays("Brésil",R.drawable.brazil,8516000));

        paysAdapter = new PaysAdapter(paysList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(paysAdapter);
    }



    /*
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.recyclerView.getContext().DividerItemDecoration.VERTICAL));

        paysList = new ArrayList<>();
        paysList.add(new pays)

        paysList = new ArrayList<>();
        paysList.add(new pays(nom: "Afganistan",R.drawable.afghanistan,superficie: 652860));
        paysList.add(new pays(nom: "Algérie",R.drawable.algeria, superficie: 2382000));
        paysList.add(new pays(nom: "Andorre",R.drawable.andorra,superficie: 700007));

        paysAdapter = new paysAdapter(paysList,context: this)
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(paysAdapter);
    } */
}