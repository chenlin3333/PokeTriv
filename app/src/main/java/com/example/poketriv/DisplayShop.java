package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayShop extends AppCompatActivity {

    public static int goldAmount = 0;

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
}
