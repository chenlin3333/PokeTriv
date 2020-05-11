package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.poketriv.PokeDex.PokeDex;
import com.example.poketriv.PokeDex.Pokemon;

import java.util.Random;

public class DisplayShop extends AppCompatActivity{

    public static int goldAmount = 1000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_shop);
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[] {Color.parseColor("#C0C0C0"),
                        Color.parseColor("#D4AF37")});
        final ConstraintLayout layout = findViewById(R.id.layout);
        layout.setBackground(gd);
        final TextView goldCounter = findViewById(R.id.goldCounter);
        String gold = goldAmount + "G";
        goldCounter.setText(gold);
    }

    public void commonButton(View view){
        if(goldAmount >= 100){
            Pokemon pokemon = null;
            goldAmount -= 100;
            Random rand = new Random();
            int randInt = rand.nextInt(1001);
            if(randInt <= 799){
                int random = rand.nextInt(PokeDex.commonPokemon.size());
                pokemon = PokeDex.commonPokemon.get(random);
            }
            else if(randInt <= 949){
                int random = rand.nextInt(PokeDex.rarePokemon.size());
                pokemon = PokeDex.rarePokemon.get(random);
            }
            else if(randInt <= 979){
                int random = rand.nextInt(PokeDex.superRarePokemon.size());
                pokemon = PokeDex.superRarePokemon.get(random);
            }
            else if(randInt <= 994){
                int random = rand.nextInt(PokeDex.ultraPokemon.size());
                pokemon = PokeDex.ultraPokemon.get(random);
            }
            else if(randInt <= 1001){
                int random = rand.nextInt(PokeDex.legendPokemon.size());
                pokemon = PokeDex.legendPokemon.get(random);
            }
            Intent myIntent = new Intent(this, DisplayBoxRewards.class);
            myIntent.putExtra("Pokemon", pokemon);
            startActivity(myIntent);
        }
    }
}
