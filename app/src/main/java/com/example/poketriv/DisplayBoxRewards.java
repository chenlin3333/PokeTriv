package com.example.poketriv;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.poketriv.PokeDex.DisplayPokedex;
import com.example.poketriv.PokeDex.Pokemon;

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
        StringBuilder pokeLocation = new StringBuilder();
        char[] dexNum = pokemon.getPokeDexNumber().toCharArray();
        for (int i = 1; i < 4; i++) {
            if (!String.valueOf(dexNum[i]).equals("0")) {
                pokeLocation.append(dexNum[i]);
            } else if (String.valueOf(dexNum[i]).equals("0") && !pokeLocation.toString().equals("")) {
                pokeLocation.append(dexNum[i]);
            }

        }
        final LinearLayout layout = findViewById(R.id.linearLayout);
        final ImageView image = findViewById(R.id.PokeImage);
        final TextView name = findViewById(R.id.Pokemon_Name);
        final TextView rarity = findViewById(R.id.type1);
        image.setImageResource(pokemon.getImageResource());
        rarity.setText(pokemon.getRarity().toUpperCase());
        if(DisplayPokedex.currentGen1PokeDex[Integer.parseInt(pokeLocation.toString()) - 1] != null){
                int amount = returnPokemonGoldValue(pokemon);
                String message = "You already have this pokemon! Here's " + amount + "G instead!";
                name.setText(message);
                DisplayShop.goldAmount += amount;
        }
        else{
            String message = "Congrats! You got " + pokemon.getName() + "!";
            name.setText(message);
            DisplayPokedex.currentGen1PokeDex[Integer.parseInt(pokeLocation.toString()) - 1] = pokemon;
        }
        layout.setBackgroundColor(Color.parseColor(pokemon.determineRarity()));

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
