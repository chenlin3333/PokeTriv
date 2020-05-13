package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.poketriv.PokeDex.DisplayPokedex;
import com.example.poketriv.PokeDex.PokeDex;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PokeDex dex = new PokeDex();
        dex.addAllPokemon();
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
