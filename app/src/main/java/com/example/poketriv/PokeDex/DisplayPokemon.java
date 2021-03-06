package com.example.poketriv.PokeDex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.poketriv.R;

/**
 * A class that represents the display for when a pokemon is selected
 * Uses activity_display_pokemon layout
 * sets each text view or image view to match pokemon's description
 */
public class DisplayPokemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokemon);
        Bundle extras = getIntent().getExtras();
        int position = 0;
        int generation = 0;
        if (extras != null) {
            String value = extras.getString("Pokemon");
            assert value != null;
            String gen = extras.getString("Generation");
            position = Integer.parseInt(value);
            assert gen != null;
            generation = Integer.parseInt(gen);
        }
        Pokemon[] pokeDex = DisplayPokedex.determineGeneration(generation);
        assert pokeDex != null;
        Pokemon pokemon = pokeDex[position];
        final LinearLayout linearLayout = findViewById(R.id.linearLayout);
        final ImageView imageView = findViewById(R.id.PokeImage);
        final TextView type1 = findViewById(R.id.type1);
        final TextView type2 = findViewById(R.id.type2);
        final TextView pokeDexNumber = findViewById(R.id.pokedex_number);
        final TextView name = findViewById(R.id.Pokemon_Name);
        imageView.setImageResource(pokemon.getImageResource());
        type1.setText(pokemon.getType1());
        type1.setBackgroundColor(Color.parseColor(pokemon.determineType(pokemon.getType1())));
        if(pokemon.getType2() != null){
            type2.setText(pokemon.getType2());
            type2.setBackgroundColor(Color.parseColor(pokemon.determineType(pokemon.getType2())));
        }
        pokeDexNumber.setText(pokemon.getPokeDexNumber());
        name.setText(pokemon.getName());
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[] {Color.parseColor("#D4AF37"),
                        Color.parseColor(pokemon.determineType(pokemon.getType1())),
                       Color.parseColor("#C0C0C0")});
        gd.setCornerRadius(0f);
        linearLayout.setBackground(gd);
    }

}
