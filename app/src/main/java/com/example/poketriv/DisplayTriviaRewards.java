package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class DisplayTriviaRewards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaytriviarewards);
        final TextView congrats = findViewById(R.id.congrat);
        final TextView questionsAnswered = findViewById(R.id.questionAnswered);
        final TextView goldEarned = findViewById(R.id.goldEarned);
        final TextView maxStreak = findViewById(R.id.maxStreak);

        String congratulations = "Congrats!Here are your Results.";
        congrats.setText(congratulations);

        String questionResult = DisplayPlayOptions.correctAnswers + "/" + DisplayPlayOptions.numQuestions;
        questionsAnswered.setText(questionResult);

        String goldResult = "+ " + DisplayPlayOptions.goldEarned + " G";
        goldEarned.setText(goldResult);

        String streakResult = "Highest Streak of " + DisplayPlayOptions.maxStreak;
        maxStreak.setText(streakResult);

        SharedPreferences sp = getSharedPreferences("GoldCount", 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("gold", sp.getInt("gold", 1000) + DisplayPlayOptions.goldEarned);
        editor.apply();
    }

    public void exit(View view){
        Intent intent = new Intent(this, DisplayPlayOptions.class);
        startActivity(intent);
    }
}
