package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.poketriv.PokeDex.DisplayPokedex;

public class DisplayGenerations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_generations);
    }

    public void openPokeDex(View view){
        Intent intent = new Intent(this, DisplayPokedex.class);
        int generation;
        switch (view.getId()){
            case R.id.gen1: {
                generation = 1;
                break;
            }
            case R.id.gen2: {
                generation = 2;
                break;
            }
            case R.id.gen3: {
                generation = 3;
                break;
            }
            case R.id.gen4: {
                generation = 4;
                break;
            }
            case R.id.gen5: {
                generation = 5;
                break;
            }
            case R.id.gen6: {
                generation = 6;
                break;
            }
            case R.id.gen7: {
                generation = 7;
                break;
            }
            case R.id.gen8: {
                generation = 8;
                break;
            }
            default:
                generation = 0;
        }
        intent.putExtra("generation", generation);
        startActivity(intent);
    }
}
