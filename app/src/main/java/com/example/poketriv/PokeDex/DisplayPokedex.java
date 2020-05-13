package com.example.poketriv.PokeDex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.example.poketriv.R;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * A class that represents the display of the PokeDex
 */
public class DisplayPokedex extends AppCompatActivity {
    public static Pokemon[] currentGen1PokeDex = new Pokemon[PokeDex.generation1.size()];
    public static Pokemon[] currentGen2PokeDex = new Pokemon[PokeDex.generation2.size()];
    public static Pokemon[] currentGen3PokeDex = new Pokemon[PokeDex.generation3.size()];
    public static Pokemon[] currentGen4PokeDex = new Pokemon[PokeDex.generation4.size()];
    public static Pokemon[] currentGen5PokeDex = new Pokemon[PokeDex.generation5.size()];
    public static Pokemon[] currentGen6PokeDex = new Pokemon[PokeDex.generation6.size()];
    public static Pokemon[] currentGen7PokeDex = new Pokemon[PokeDex.generation7.size()];
    public static Pokemon[] currentGen8PokeDex = new Pokemon[PokeDex.generation8.size()];

    /**
     * Called when created, uses gridview adapter to display grid
     * also creates click listener for a grid element if that element is not null
     * @param savedInstanceState this
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokedex);
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        int generation = (int)extras.get("generation");
        GridView gridView = findViewById(R.id.gridview);
        PokeDexAdapter adapter = new PokeDexAdapter(this, determineGeneration(generation));
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

    private Pokemon[] determineGeneration(int gen){
        switch(gen){
            case 1: {
                return currentGen1PokeDex;
            }
            case 2: {
                return currentGen2PokeDex;
            }
            case 3: {
                return currentGen3PokeDex;
            }
            case 4: {
                return currentGen4PokeDex;
            }
            case 5: {
                return currentGen5PokeDex;
            }
            case 6: {
                return currentGen6PokeDex;
            }
            case 7: {
                return currentGen7PokeDex;
            }
            case 8: {
                return currentGen8PokeDex;
            }
            default:{
                return null;
            }
        }
    }


}
