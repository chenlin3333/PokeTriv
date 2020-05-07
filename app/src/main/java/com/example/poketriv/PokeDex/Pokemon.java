package com.example.poketriv.PokeDex;

public class Pokemon {

    private String type1;
    private String type2;
    private int imageResource;
    private String pokeDexNumber;
    private String name;


    public Pokemon(String pokeDexNumber, String name, String type1, String type2, int imageResource){
        this.imageResource = imageResource;
        this.pokeDexNumber = pokeDexNumber;
        this.type1 = type1;
        this.type2 = type2;
        this.name = name;
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
}
