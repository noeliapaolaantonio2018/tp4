package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<inmueble>lista=new ArrayList<>();//lista de inmuebles
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public  void generarListView(){

        ArrayAdapter<inmueble> adapter=new ListaAdapter(this,R.layout.items,lista,getLayoutInflater());
        //recupero el listView
        ListView lv=findViewById(R.id.milista);
        lv.setAdapter(adapter);//es una vista compueta por una imagen y 2 textview

    }

    public  void cargarDatos(){//mete datos a la lista
        lista.add(new inmueble(R.drawable.casa1,"Juana Koslay",8000));
        lista.add(new inmueble(R.drawable.casa2,"San Luis",7000));
        lista.add(new inmueble(R.drawable.casa3,"Trapiche",6000));

    }

}