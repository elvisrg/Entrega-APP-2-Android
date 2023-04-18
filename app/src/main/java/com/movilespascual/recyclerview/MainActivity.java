package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elementos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void  init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("#72F312","Andres","Medellín","Activo", "andres_perez@hotmail.com"));
        elementos.add(new ListaElementos("#FF5050","Luisa","Maracaibo","Activo", "luisar@gmail.com"));
        elementos.add(new ListaElementos("#5056FF","Shulder","Santa Fe","Ausente", "Shulpuertas@gmail.com"));
        elementos.add(new ListaElementos("#EF50FF","Zara","Bogotá","Ausente", "zaralobo@hotmail.com"));
        elementos.add(new ListaElementos("#F73030","Elvis","Mérida","Activo", "elvisr@gmail.com"));

        ListAdapter listAdapter = new ListAdapter(elementos,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}