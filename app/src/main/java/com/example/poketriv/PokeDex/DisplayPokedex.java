package com.example.poketriv.PokeDex;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.example.poketriv.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.lang.reflect.Type;


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
        retrievePokeDex();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokedex);
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        int generation = (int)extras.get("generation");
        GridView gridView = findViewById(R.id.gridview);
        final Pokemon[] array = determineGeneration(generation);
        PokeDexAdapter adapter = new PokeDexAdapter(this, array);
        gridView.setAdapter(adapter);
        final Context context = this;
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                assert array != null;
                if(array[position] != null){
                    Intent myIntent = new Intent(context, DisplayPokemon.class);
                    String value = String.valueOf(position);
                    myIntent.putExtra("Pokemon", value);
                    startActivity(myIntent);
                }
            }
        });
    }

    private void retrievePokeDex(){
        SharedPreferences mPrefs = getSharedPreferences("currentDex", 0);
        Gson gson = new Gson();
        Type type = new TypeToken<Pokemon[]>() {}.getType();
        String gen1 = mPrefs.getString("gen1", null);
        currentGen1PokeDex = gson.fromJson(gen1, type);
        if(currentGen1PokeDex == null){
            currentGen1PokeDex = new Pokemon[PokeDex.generation1.size()];
        }

        String gen2 = mPrefs.getString("gen2", null);
        currentGen2PokeDex = gson.fromJson(gen2, type);
        if(currentGen2PokeDex == null){
            currentGen2PokeDex = new Pokemon[PokeDex.generation2.size()];
        }

        String gen3 = mPrefs.getString("gen3", null);
        currentGen3PokeDex = gson.fromJson(gen3, type);
        if(currentGen3PokeDex == null){
            currentGen3PokeDex = new Pokemon[PokeDex.generation3.size()];
        }

        String gen4 = mPrefs.getString("gen4", null);
        currentGen4PokeDex = gson.fromJson(gen4, type);
        if(currentGen4PokeDex == null){
            currentGen4PokeDex = new Pokemon[PokeDex.generation4.size()];
        }

        String gen5 = mPrefs.getString("gen5", null);
        currentGen5PokeDex = gson.fromJson(gen5, type);
        if(currentGen5PokeDex == null){
            currentGen5PokeDex = new Pokemon[PokeDex.generation5.size()];
        }

        String gen6 = mPrefs.getString("gen6", null);
        currentGen6PokeDex = gson.fromJson(gen6, type);
        if(currentGen6PokeDex == null){
            currentGen6PokeDex = new Pokemon[PokeDex.generation6.size()];
        }

        String gen7 = mPrefs.getString("gen7", null);
        currentGen7PokeDex = gson.fromJson(gen7, type);
        if(currentGen7PokeDex == null){
            currentGen7PokeDex = new Pokemon[PokeDex.generation7.size()];
        }

        String gen8 = mPrefs.getString("gen8", null);
        currentGen8PokeDex = gson.fromJson(gen8, type);
        if(currentGen8PokeDex == null){
            currentGen8PokeDex = new Pokemon[PokeDex.generation8.size()];
        }
    }

    public static Pokemon[] determineGeneration(int gen){
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
