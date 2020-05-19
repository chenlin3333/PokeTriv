package com.example.poketriv;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.poketriv.PokeDex.DisplayPokedex;
import com.example.poketriv.PokeDex.PokeDex;
import com.example.poketriv.PokeDex.Pokemon;
import com.google.gson.Gson;

/**
 * A class that represents the display for when a box button is clicked
 * uses activity_display_pokemon layout
 */
public class DisplayBoxRewards extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokemon);
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        Pokemon pokemon = (Pokemon) extras.getSerializable("Pokemon");
        assert pokemon != null;
        final LinearLayout layout = findViewById(R.id.linearLayout);
        final ImageView image = findViewById(R.id.PokeImage);
        final TextView name = findViewById(R.id.Pokemon_Name);
        final TextView rarity = findViewById(R.id.type1);
        image.setImageResource(pokemon.getImageResource());
        rarity.setText(pokemon.getRarity().toUpperCase());
        Pokemon[] currentGen = DisplayPokedex.determineGeneration(pokemon.getGeneration());
        assert currentGen != null;
        int pokeLocation = returnCorrectLocation(pokemon);
        if(currentGen[pokeLocation] != null){
                int amount = returnPokemonGoldValue(pokemon);
                String message = "You already have this pokemon! Here's " + amount + "G instead!";
                name.setText(message);
                DisplayShop.goldAmount += amount;
        }
        else{
            String message = "Congrats! You got " + pokemon.getName() + "!";
            name.setText(message);
            currentGen[pokeLocation] = pokemon;
            savePokeDex(pokemon, currentGen);
        }
        layout.setBackgroundColor(Color.parseColor(pokemon.determineRarity()));

    }

    private void savePokeDex(Pokemon pokemon, Pokemon[] currentGen){
        int generation = pokemon.getGeneration();
        SharedPreferences mPrefs = getSharedPreferences("currentDex", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        Gson gson = new Gson();
        String save = gson.toJson(currentGen);
        if(generation == 1){
            editor.putString("gen1", save);
        }
        if(generation == 2){
            editor.putString("gen2", save);
        }
        if(generation == 3){
            editor.putString("gen3", save);
        }
        if(generation == 4){
            editor.putString("gen4", save);
        }
        if(generation == 5){
            editor.putString("gen5", save);
        }
        if(generation == 6){
            editor.putString("gen6", save);
        }
        if(generation == 7){
            editor.putString("gen7", save);
        }
        if(generation == 8){
            editor.putString("gen8", save);
        }
        editor.apply();
    }

    private int returnCorrectLocation(Pokemon pokemon) {
        StringBuilder pokeLocation = new StringBuilder();
        char[] dexNum = pokemon.getPokeDexNumber().toCharArray();
        for (int i = 1; i < 4; i++) {
            if (!String.valueOf(dexNum[i]).equals("0")) {
                pokeLocation.append(dexNum[i]);
            } else if (String.valueOf(dexNum[i]).equals("0") && !pokeLocation.toString().equals("")) {
                pokeLocation.append(dexNum[i]);
            }
        }
        if (pokemon.getGeneration() == 1) {
            return Integer.parseInt(pokeLocation.toString()) - 1;
        }
        if (pokemon.getGeneration() == 2) {
            return Integer.parseInt(pokeLocation.toString()) - 152;
        }
        if (pokemon.getGeneration() == 3) {
            return Integer.parseInt(pokeLocation.toString()) - 252;
        }
        if (pokemon.getGeneration() == 4) {
            return Integer.parseInt(pokeLocation.toString()) - 387;
        }
        if (pokemon.getGeneration() == 5) {
            return Integer.parseInt(pokeLocation.toString()) - 494;
        }
        if (pokemon.getGeneration() == 6) {
            return Integer.parseInt(pokeLocation.toString()) - 650;
        }
        if (pokemon.getGeneration() == 7) {
            return Integer.parseInt(pokeLocation.toString()) - 722;
        }
        if (pokemon.getGeneration() == 8) {
            return Integer.parseInt(pokeLocation.toString()) - 810;
        }
        return 0;
    }


    private int returnPokemonGoldValue(Pokemon pokemon){
        if(pokemon.getRarity().equals("common")){
            return 20;
        }
        if(pokemon.getRarity().equals("rare")){
            return 50;
        }
        if(pokemon.getRarity().equals("superrare")){
            return 100;
        }
        if(pokemon.getRarity().equals("ultra")){
            return 200;
        }
        if(pokemon.getRarity().equals("legend")){
            return 500;
        }
        return 0;
    }
}
