package com.example.poketriv.PokeDex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.poketriv.R;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class DisplayPokedex extends AppCompatActivity {
    public static Pokemon[] currentGen1PokeDex = new Pokemon[PokeDex.generation1.size() +
            PokeDex.generation2.size() + PokeDex.generation3.size() + PokeDex.generation4.size() +
            PokeDex.generation5.size() + PokeDex.generation6.size() + PokeDex.generation7.size() +
            PokeDex.generation8.size()];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokedex);
        GridView gridView = findViewById(R.id.gridview);
        PokeDexAdapter adapter = new PokeDexAdapter(this, currentGen1PokeDex);
        gridView.setAdapter(adapter);
        final Context context = this;
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(currentGen1PokeDex[position] != null){
                    Intent myIntent = new Intent(context, DisplayPokemon.class);
                    String value = String.valueOf(position);
                    myIntent.putExtra("Pokemon", value);
                    startActivity(myIntent);
                }
            }
        });
    }


}
