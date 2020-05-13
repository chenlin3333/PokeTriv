package com.example.poketriv.PokeDex;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.poketriv.R;

/**
 * a class that represents a pokemon adapter
 * this displays the grid in pokedex
 */
public class PokeDexAdapter extends BaseAdapter {

    private final Context mContext;
    private final Pokemon[] pokeDex;

    public PokeDexAdapter(Context context, Pokemon[] pokedex) {
        mContext = context;
        pokeDex = pokedex;
    }

    @Override
    public int getCount() {
        return pokeDex.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * refers to current pokeDex in DisplayPokedex to see if a grid location should be pokeball
     * or pokemon image
     * @param position: location on grid
     * @param convertView: the view at that location
     * @param parent: parent view
     * @return View
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Pokemon pokemon = pokeDex[position];
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_gridview, null);
        }
        final ImageView imageView = convertView.findViewById(R.id.questionMark);
        if(pokemon == null){
            imageView.setImageResource(R.drawable.pokeball);
        }
        else{
            imageView.setImageResource(pokemon.getImageResource());
            GradientDrawable gd;
            if(pokemon.getType2() != null){
                gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                        new int[] {Color.parseColor(pokemon.determineType(pokemon.getType1())),
                                Color.parseColor(pokemon.determineType(pokemon.getType2()))});
                gd.setCornerRadius(0f);
                imageView.setBackground(gd);
            }
            else{
                imageView.setBackgroundColor(Color.parseColor(pokemon.determineType(pokemon.getType1())));
            }
        }
        return convertView;
    }
}