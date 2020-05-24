package com.example.poketriv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.poketriv.PokeDex.PokeDex;
import com.example.poketriv.PokeDex.Pokemon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DisplayPokemonQuestions extends AppCompatActivity {

    private Pokemon pokemon;
    private Button correctButton;
    private ArrayList<Button> allButtons;
    private boolean answerSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pokemon_questions);
        Random randint = new Random();
        int index = randint.nextInt(PokeDex.completePokeDex.size());
        pokemon = PokeDex.completePokeDex.get(index);
        initializeQuestion();
    }

    public void onButtonClick(View view){
        Button clickedButton = (Button)view;
        if(!answerSelected){
            correctButton.setBackgroundColor(Color.parseColor("#39ff14"));
            if(clickedButton.equals(correctButton)){
                DisplayPlayOptions.streak += 1;
                if(DisplayPlayOptions.streak > DisplayPlayOptions.maxStreak){
                    DisplayPlayOptions.maxStreak = DisplayPlayOptions.streak;
                }
                DisplayPlayOptions.correctAnswers += 1;
                DisplayPlayOptions.numQuestionsLeft -= 1;
                DisplayPlayOptions.goldEarned += DisplayPlayOptions.streak*10 + 10;
            }
            else{
                clickedButton.setBackgroundColor(Color.parseColor("#a62c2b"));
                DisplayPlayOptions.streak = 0;
                DisplayPlayOptions.numQuestionsLeft -= 1;
            }
            Button next = findViewById(R.id.nextButton);
            next.setVisibility(View.VISIBLE);
            answerSelected = true;
        }
    }

    public void nextQuestion(View view){
        if(DisplayPlayOptions.numQuestionsLeft != 0){
            Intent next = new Intent(this, DisplayPokemonQuestions.class);
            startActivity(next);
        }
        else{
            DisplayPlayOptions.correctAnswers = 0;
            DisplayPlayOptions.maxStreak = 0;
            DisplayPlayOptions.streak = 0;
            DisplayPlayOptions.goldEarned = 0;
            Intent result = new Intent(this, DisplayTriviaRewards.class);
            startActivity(result);
        }
    }
    public void exitGame(View view){
        DisplayPlayOptions.correctAnswers = 0;
        DisplayPlayOptions.maxStreak = 0;
        DisplayPlayOptions.streak = 0;
        DisplayPlayOptions.goldEarned = 0;
        Intent mainPage = new Intent(this, MainActivity.class);
        startActivity(mainPage);
    }

    private void initializeQuestion(){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        final TextView questionLeft = findViewById(R.id.questionLeft);
        final TextView streak = findViewById(R.id.streak);
        final TextView goldEarned = findViewById(R.id.goldEarned);
        final ImageView pokeImage = findViewById(R.id.pokemon);
        final TextView question = findViewById(R.id.question);
        final Button answer1 = findViewById(R.id.choice1);
        final Button answer2 = findViewById(R.id.choice2);
        final Button answer3 = findViewById(R.id.choice3);
        final Button answer4 = findViewById(R.id.choice4);

        String questionNum = "Questions Left:" + DisplayPlayOptions.numQuestionsLeft;
        questionLeft.setText(questionNum);

        String currentStreak = "Streak: " + DisplayPlayOptions.streak;
        streak.setText(currentStreak);

        String gold = "Gold Earned: " + DisplayPlayOptions.goldEarned;
        goldEarned.setText(gold);

        String questions = determineQuestion(randomInt);
        question.setText(questions);
        pokeImage.setImageResource(pokemon.getImageResource());

        allButtons = new ArrayList<>();
        allButtons.add(answer1);
        allButtons.add(answer2);
        allButtons.add(answer3);
        allButtons.add(answer4);

        HashSet<String> answerChoices = new HashSet<>();
        if(pokemon.getType2() != null && randomInt == 0){
            String answer = returnAnswer(randomInt, pokemon);
            answerChoices.add(pokemon.getType2());
            correctButton = allButtons.get(random.nextInt(allButtons.size()));
            correctButton.setText(answer);
            allButtons.remove(correctButton);

            String option2 = determineOptions(randomInt);
            while(answerChoices.contains(option2)){
                option2 = determineOptions(randomInt);
            }
            answerChoices.add(option2);
            String choice2 = pokemon.getType1() + " and " + option2;
            Button button2 = allButtons.get(random.nextInt(allButtons.size()));
            button2.setText(choice2);
            allButtons.remove(button2);

            String option3 = determineOptions(randomInt);
            while(answerChoices.contains(option3)){
                option3 = determineOptions(randomInt);
            }
            answerChoices.add(option3);
            String choice3 = pokemon.getType1() + " and " + option3;
            Button button3 = allButtons.get(random.nextInt(allButtons.size()));
            button3.setText(choice3);
            allButtons.remove(button3);

            String option4 = determineOptions(randomInt);
            while(answerChoices.contains(option4)){
                option4 = determineOptions(randomInt);
            }
            answerChoices.add(option4);
            String choice4 = pokemon.getType1() + " and " + option4;
            Button button4 = allButtons.get(0);
            button4.setText(choice4);
            allButtons.remove(button4);
        }
        else{
            String answer = returnAnswer(randomInt, pokemon);
            answerChoices.add(answer);
            correctButton = allButtons.get(random.nextInt(allButtons.size()));
            correctButton.setText(answer);
            allButtons.remove(correctButton);

            String choice2 = determineOptions(randomInt);
            while(answerChoices.contains(choice2)){
                choice2 = determineOptions(randomInt);
            }
            answerChoices.add(choice2);
            Button button2 = allButtons.get(random.nextInt(allButtons.size()));
            button2.setText(choice2);
            allButtons.remove(button2);

            String choice3 = determineOptions(randomInt);
            while(answerChoices.contains(choice3)){
                choice3 = determineOptions(randomInt);
            }
            answerChoices.add(choice3);
            Button button3 = allButtons.get(random.nextInt(allButtons.size()));
            button3.setText(choice3);
            allButtons.remove(button3);

            String choice4 = determineOptions(randomInt);
            while(answerChoices.contains(choice4)){
                choice4 = determineOptions(randomInt);
            }
            answerChoices.add(choice4);
            Button button4 = allButtons.get(0);
            button4.setText(choice4);
            allButtons.remove(button4);
        }
    }

    private String returnAnswer(int randomInt, Pokemon pokemon){
        if(randomInt == 0 && pokemon.getType2() != null){
            return pokemon.getType1() + " and " + pokemon.getType2();
        }
        else if(randomInt == 0){
            return pokemon.getType1();
        }
        else if(randomInt == 1){
            return pokemon.getName();
        }
        else if(randomInt == 2){
            return String.valueOf(pokemon.getGeneration());
        }
        return null;
    }

    private String determineQuestion(int randomInt){
        if(randomInt == 0){
            return "What type(s) is this Pokemon?";
        }
        if(randomInt == 1){
            return "What is the name of this Pokemon?";
        }
        if(randomInt == 2){
            return "What generation is this Pokemon from?";
        }
        return null;
    }

    private String determineOptions(int randomInt){
        Random random = new Random();
        if(randomInt == 0){
            return returnRandomType(random.nextInt(18));
        }
        if(randomInt == 1){
            Pokemon randomPoke = PokeDex.completePokeDex.get(
                    random.nextInt(PokeDex.completePokeDex.size() - 1));
            return randomPoke.getName();
        }
        if(randomInt == 2){
            return String.valueOf(random.nextInt(7) + 1);
        }
        return null;
    }

    private String returnRandomType(int randomInt){
        if(randomInt == 0){
            return "Bug";
        }
        if(randomInt == 1){
            return "Dark";
        }
        if(randomInt == 2){
            return "Dragon";
        }
        if(randomInt == 3){
            return "Electric";
        }
        if(randomInt == 4){
            return "Fairy";
        }
        if(randomInt == 5){
            return "Fighting";
        }
        if(randomInt == 6){
            return "Fire";
        }
        if(randomInt == 7){
            return "Flying";
        }
        if(randomInt == 8){
            return "Ghost";
        }
        if(randomInt == 9){
            return "Grass";
        }
        if(randomInt == 10){
            return "Ground";
        }
        if(randomInt == 11){
            return "Ice";
        }
        if(randomInt == 12){
            return "Normal";
        }
        if(randomInt == 13){
            return "Poison";
        }
        if(randomInt == 14){
            return "Psychic";
        }
        if(randomInt == 15){
            return "Rock";
        }
        if(randomInt == 16){
            return "Steel";
        }
        if(randomInt == 17){
            return "Water";
        }
        return null;
    }
}
