package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayPlayOptions extends AppCompatActivity {

    public static int numQuestionsLeft = 0;
    public static int goldEarned = 0;
    public static int streak = 0;
    public static int maxStreak = 0;
    public static int numQuestions = 0;
    public static int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_play_options);
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, DisplayPokemonQuestions.class);
        switch (view.getId()) {
            case R.id.ten: {
                numQuestions = 10;
                numQuestionsLeft = 10;
                break;
            }
            case R.id.twentyfive: {
                numQuestions = 25;
                numQuestionsLeft = 25;
                break;
            }
            case R.id.fifty: {
                numQuestions = 50;
                numQuestionsLeft = 50;
                break;
            }
            case R.id.hundred: {
                numQuestions = 100;
                numQuestionsLeft = 100;
                break;
            }
            default: {
                break;
            }
        }
        startActivity(intent);
    }
}
