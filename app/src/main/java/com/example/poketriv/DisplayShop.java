package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.example.poketriv.PokeDex.PokeDex;
import com.example.poketriv.PokeDex.Pokemon;
import java.util.Random;

public class DisplayShop extends AppCompatActivity {

    public static int goldAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_shop);
        SharedPreferences sp = getSharedPreferences("GoldCount", 0);
        goldAmount = sp.getInt("gold", 1000);
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{Color.parseColor("#C0C0C0"),
                        Color.parseColor("#D4AF37")});
        final ConstraintLayout layout = findViewById(R.id.layout);
        layout.setBackground(gd);
        final TextView goldCounter = findViewById(R.id.goldCounter);
        String gold = goldAmount + "G";
        goldCounter.setText(gold);
    }

    public void commonButton(View view) {
        if (goldAmount >= 100) {
            Pokemon pokemon = null;
            goldAmount -= 100;
            SharedPreferences sp = getSharedPreferences("GoldCount", 0);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("gold", goldAmount);
            editor.apply();
            Random rand = new Random();
            int randInt = rand.nextInt(1001);
            if (randInt <= 799) {
                int random = rand.nextInt(PokeDex.commonPokemon.size());
                pokemon = PokeDex.commonPokemon.get(random);
            } else if (randInt <= 949) {
                int random = rand.nextInt(PokeDex.rarePokemon.size());
                pokemon = PokeDex.rarePokemon.get(random);
            } else if (randInt <= 979) {
                int random = rand.nextInt(PokeDex.superRarePokemon.size());
                pokemon = PokeDex.superRarePokemon.get(random);
            } else if (randInt <= 994) {
                int random = rand.nextInt(PokeDex.ultraPokemon.size());
                pokemon = PokeDex.ultraPokemon.get(random);
            } else if (randInt <= 1001) {
                int random = rand.nextInt(PokeDex.legendPokemon.size());
                pokemon = PokeDex.legendPokemon.get(random);
            }
            Intent myIntent = new Intent(this, DisplayBoxRewards.class);
            myIntent.putExtra("Pokemon", pokemon);
            startActivity(myIntent);
        }
    }

    public void rareButton(View view) {
        if (goldAmount >= 250) {
            Pokemon pokemon = null;
            goldAmount -= 250;
            SharedPreferences sp = getSharedPreferences("GoldCount", 0);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("gold", goldAmount);
            editor.apply();
            Random rand = new Random();
            int randInt = rand.nextInt(1001);
            if (randInt <= 499) {
                int random = rand.nextInt(PokeDex.commonPokemon.size());
                pokemon = PokeDex.commonPokemon.get(random);
            } else if (randInt <= 874) {
                int random = rand.nextInt(PokeDex.rarePokemon.size());
                pokemon = PokeDex.rarePokemon.get(random);
            } else if (randInt <= 949) {
                int random = rand.nextInt(PokeDex.superRarePokemon.size());
                pokemon = PokeDex.superRarePokemon.get(random);
            } else if (randInt <= 987) {
                int random = rand.nextInt(PokeDex.ultraPokemon.size());
                pokemon = PokeDex.ultraPokemon.get(random);
            } else if (randInt <= 1001) {
                int random = rand.nextInt(PokeDex.legendPokemon.size());
                pokemon = PokeDex.legendPokemon.get(random);
            }
            Intent myIntent = new Intent(this, DisplayBoxRewards.class);
            myIntent.putExtra("Pokemon", pokemon);
            startActivity(myIntent);
        }
    }

    public void ultraButton(View view) {
        if (goldAmount >= 500) {
            Pokemon pokemon = null;
            goldAmount -= 500;
            SharedPreferences sp = getSharedPreferences("GoldCount", 0);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("gold", goldAmount);
            editor.apply();
            Random rand = new Random();
            int randInt = rand.nextInt(1001);
            if (randInt <= 750) {
                int random = rand.nextInt(PokeDex.rarePokemon.size());
                pokemon = PokeDex.rarePokemon.get(random);
            } else if (randInt <= 900) {
                int random = rand.nextInt(PokeDex.superRarePokemon.size());
                pokemon = PokeDex.superRarePokemon.get(random);
            } else if (randInt <= 975) {
                int random = rand.nextInt(PokeDex.ultraPokemon.size());
                pokemon = PokeDex.ultraPokemon.get(random);
            } else if (randInt <= 1001) {
                int random = rand.nextInt(PokeDex.legendPokemon.size());
                pokemon = PokeDex.legendPokemon.get(random);
            }
            Intent myIntent = new Intent(this, DisplayBoxRewards.class);
            myIntent.putExtra("Pokemon", pokemon);
            startActivity(myIntent);
        }
    }

    public void legendButton(View view) {
        if (goldAmount >= 1000) {
            Pokemon pokemon = null;
            goldAmount -= 1000;
            SharedPreferences sp = getSharedPreferences("GoldCount", 0);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("gold", goldAmount);
            editor.apply();
            Random rand = new Random();
            int randInt = rand.nextInt(1001);
            if (randInt <= 800) {
                int random = rand.nextInt(PokeDex.superRarePokemon.size());
                pokemon = PokeDex.superRarePokemon.get(random);
            } else if (randInt <= 950) {
                int random = rand.nextInt(PokeDex.ultraPokemon.size());
                pokemon = PokeDex.ultraPokemon.get(random);
            } else if (randInt <= 1001) {
                int random = rand.nextInt(PokeDex.legendPokemon.size());
                pokemon = PokeDex.legendPokemon.get(random);
            }
            Intent myIntent = new Intent(this, DisplayBoxRewards.class);
            myIntent.putExtra("Pokemon", pokemon);
            startActivity(myIntent);
        }
    }
}
