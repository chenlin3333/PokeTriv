package com.example.poketriv.PokeDex;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private String type1;
    private String type2;
    private int imageResource;
    private String pokeDexNumber;
    private String name;
    private int generation;
    private String rarity;


    public Pokemon(String pokeDexNumber, String name, String type1, String type2, int imageResource, int generation, String rarity){
        this.imageResource = imageResource;
        this.pokeDexNumber = pokeDexNumber;
        this.type1 = type1;
        this.type2 = type2;
        this.name = name;
        this.rarity = rarity;
        this.generation = generation;
        addToRarityList();
        addToGenerationList();
    }

    private void addToRarityList(){
        if(rarity.equals("common")){
            PokeDex.commonPokemon.add(this);
        }
        if(rarity.equals("rare")){
            PokeDex.rarePokemon.add(this);
        }
        if(rarity.equals("superrare")){
            PokeDex.superRarePokemon.add(this);
        }
        if(rarity.equals("ultra")){
            PokeDex.ultraPokemon.add(this);
        }
        if(rarity.equals("legend")){
            PokeDex.legendPokemon.add(this);
        }
    }

    private void addToGenerationList(){
        if(generation == 1){
            PokeDex.generation1.add(this);
        }
        if(generation == 2){
            PokeDex.generation2.add(this);
        }
        if(generation == 3){
            PokeDex.generation3.add(this);
        }
        if(generation == 4){
            PokeDex.generation4.add(this);
        }
        if(generation == 5){
            PokeDex.generation5.add(this);
        }
        if(generation == 6){
            PokeDex.generation6.add(this);
        }
        if(generation == 7){
            PokeDex.generation7.add(this);
        }
        if(generation == 8){
            PokeDex.generation8.add(this);
        }
    }

    public String getRarity(){
        return rarity;
    }

    public int getGeneration(){
        return generation;
    }

    public String getName(){
        return name;
    }

    public int getImageResource(){
        return imageResource;
    }

    public String getType1(){
        return type1;
    }

    public String getType2(){
        return type2;
    }

    public String getPokeDexNumber(){
        return pokeDexNumber;
    }

    public String determineType(String type){
        String lowerType = type.toLowerCase();
        if(lowerType.equals("grass")){
            return "#4E8234";
        }
        if(lowerType.equals("dark")){
            return "#49392F";
        }
        if(lowerType.equals("bug")){
            return "#A8B820";
        }
        if(lowerType.equals("dragon")){
            return "#7038F8";
        }
        if(lowerType.equals("electric")){
            return "#F8D030";
        }
        if(lowerType.equals("fairy")){
            return "#EE99AC";
        }
        if(lowerType.equals("fighting")){
            return "#7D1F1A";
        }
        if(lowerType.equals("fire")){
            return "#F08030";
        }
        if(lowerType.equals("flying")){
            return "#A890F0";
        }
        if(lowerType.equals("ghost")){
            return "#705898";
        }
        if(lowerType.equals("ground")){
            return "#E0C068";
        }
        if(lowerType.equals("ice")){
            return "#98D8D8";
        }
        if(lowerType.equals("normal")){
            return "#C6C6A7";
        }
        if(lowerType.equals("poison")){
            return "#682A68";
        }
        if(lowerType.equals("psychic")){
            return "#A13959";
        }
        if(lowerType.equals("rock")){
            return "#786824";
        }
        if(lowerType.equals("steel")){
            return "#787887";
        }
        if(lowerType.equals("water")){
            return "#6890F0";
        }
        return null;
    }

    public String determineRarity(){
        if(rarity.equals("common")){
            return "#808080";
        }
        if(rarity.equals("rare")){
            return "#32CD32";
        }
        if(rarity.equals("superrare")){
            return "#00FFFF";
        }
        if(rarity.equals("ultra")){
            return "#FF0000";
        }
        if(rarity.equals("legend")){
            return "#D4AF37";
        }
        return null;
    }
}
