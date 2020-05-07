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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Pokemon[] array = PokeDex.generation1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokedex);
        GridView gridView = findViewById(R.id.gridview);
        PokeDexAdapter adapter = new PokeDexAdapter(this, array);
        gridView.setAdapter(adapter);
        final Context context = this;
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(PokeDex.generation1[position] != null){
                    Intent myIntent = new Intent(context, DisplayPokemon.class);
                    String value = String.valueOf(position);
                    myIntent.putExtra("Pokemon", value);
                    startActivity(myIntent);
                }
            }
        });
    }


}
