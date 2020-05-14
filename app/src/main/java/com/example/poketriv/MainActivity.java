package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.poketriv.PokeDex.DisplayPokedex;
import com.example.poketriv.PokeDex.PokeDex;
import com.example.poketriv.PokeDex.Pokemon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PokeDex pokeDex = new PokeDex();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (true) {
            pokeDex.addAllPokemon();
            savePokeLists();
            SharedPreferences.Editor editors = prefs.edit();
            editors.putBoolean("firstTime", true);
            editors.apply();
        }
        retrievePokemonLists();
    }

    private void savePokeLists(){
        SharedPreferences mPrefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String gen1 = gson.toJson(PokeDex.generation1);
        String gen2 = gson.toJson(PokeDex.generation2);
        String gen3 = gson.toJson(PokeDex.generation3);
        String gen4 = gson.toJson(PokeDex.generation4);
        String gen5 = gson.toJson(PokeDex.generation5);
        String gen6 = gson.toJson(PokeDex.generation6);
        String gen7 = gson.toJson(PokeDex.generation7);
        String gen8 = gson.toJson(PokeDex.generation8);
        String common = gson.toJson(PokeDex.commonPokemon);
        String rare = gson.toJson(PokeDex.rarePokemon);
        String superrare = gson.toJson(PokeDex.superRarePokemon);
        String ultra = gson.toJson(PokeDex.ultraPokemon);
        String legend = gson.toJson(PokeDex.legendPokemon);
        prefsEditor.putString("generation1", gen1);
        prefsEditor.putString("generation2", gen2);
        prefsEditor.putString("generation3", gen3);
        prefsEditor.putString("generation4", gen4);
        prefsEditor.putString("generation5", gen5);
        prefsEditor.putString("generation6", gen6);
        prefsEditor.putString("generation7", gen7);
        prefsEditor.putString("generation8", gen8);
        prefsEditor.putString("common", common);
        prefsEditor.putString("rare", rare);
        prefsEditor.putString("superrare", superrare);
        prefsEditor.putString("ultra", ultra);
        prefsEditor.putString("legend", legend);
        prefsEditor.apply();
    }

    private void retrievePokemonLists(){
        SharedPreferences mPrefs = getPreferences(MODE_PRIVATE);
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Pokemon>>() {}.getType();
        String commonList = mPrefs.getString("common", null);
        PokeDex.commonPokemon = gson.fromJson(commonList, type);

        String rareList = mPrefs.getString("rare", null);
        PokeDex.rarePokemon = gson.fromJson(rareList, type);

        String superrareList = mPrefs.getString("superrare", null);
        PokeDex.superRarePokemon = gson.fromJson(superrareList, type);

        String ultraList = mPrefs.getString("ultra", null);
        PokeDex.ultraPokemon = gson.fromJson(ultraList, type);

        String legendList = mPrefs.getString("legend", null);
        PokeDex.legendPokemon = gson.fromJson(legendList, type);

        String gen1List = mPrefs.getString("generation1", null);
        PokeDex.generation1 = gson.fromJson(gen1List, type);

        String gen2List = mPrefs.getString("generation2", null);
        PokeDex.generation2 = gson.fromJson(gen2List, type);

        String gen3List = mPrefs.getString("generation3", null);
        PokeDex.generation3 = gson.fromJson(gen3List, type);

        String gen4List = mPrefs.getString("generation4", null);
        PokeDex.generation4 = gson.fromJson(gen4List, type);

        String gen5List = mPrefs.getString("generation5", null);
        PokeDex.generation5 = gson.fromJson(gen5List, type);

        String gen6List = mPrefs.getString("generation6", null);
        PokeDex.generation6 = gson.fromJson(gen6List, type);

        String gen7List = mPrefs.getString("generation7", null);
        PokeDex.generation7 = gson.fromJson(gen7List, type);

        String gen8List = mPrefs.getString("generation8", null);
        PokeDex.generation8 = gson.fromJson(gen8List, type);
    }

    public void shopButton(View view){
        Intent intent = new Intent(this, DisplayShop.class);
        startActivity(intent);
    }

    public void pokedexButton(View view){
        Intent intent = new Intent(this, DisplayGenerations.class);
        startActivity(intent);
    }

    public void playButton(View view){
        Intent intent = new Intent(this, DisplayPlayOptions.class);
        startActivity(intent);
    }
}
