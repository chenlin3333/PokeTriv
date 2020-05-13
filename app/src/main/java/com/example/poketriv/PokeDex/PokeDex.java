package com.example.poketriv.PokeDex;

import com.example.poketriv.R;

import java.util.ArrayList;

/**
 * A class that represents the data of a pokedex
 * Has an ArrayList for each category of pokemon
 */
public class PokeDex {

    public static ArrayList<Pokemon> generation1 = new ArrayList<>();
    public static ArrayList<Pokemon> generation2 = new ArrayList<>();
    public static ArrayList<Pokemon> generation3 = new ArrayList<>();
    public static ArrayList<Pokemon> generation4 = new ArrayList<>();
    public static ArrayList<Pokemon> generation5 = new ArrayList<>();
    public static ArrayList<Pokemon> generation6 = new ArrayList<>();
    public static ArrayList<Pokemon> generation7 = new ArrayList<>();
    public static ArrayList<Pokemon> generation8 = new ArrayList<>();
    public static ArrayList<Pokemon> commonPokemon = new ArrayList<>();
    public static ArrayList<Pokemon> rarePokemon = new ArrayList<>();
    public static ArrayList<Pokemon> superRarePokemon = new ArrayList<>();
    public static ArrayList<Pokemon> ultraPokemon = new ArrayList<>();
    public static ArrayList<Pokemon> legendPokemon = new ArrayList<>();

    /**
     * A method that makes all pokemon
     */
    public void addAllPokemon() {
        new Pokemon("#001", "Bulbasaur", "Grass", "Poison", R.drawable.bulbasaur,1, "rare");
        new Pokemon("#002", "Ivysaur", "Grass", "Poison", R.drawable.ivysaur,1, "superrare");
        new Pokemon("#003", "Venusaur", "Grass", "Poison", R.drawable.venusaur,1, "ultra");
        new Pokemon("#004", "Charmander", "Fire", null, R.drawable.charmander,1, "rare");
        new Pokemon("#005", "Charmeleon", "Fire", null, R.drawable.charmeleon,1, "superrare");
        new Pokemon("#006", "Charizard", "Fire", "Flying", R.drawable.charizard, 1, "ultra");
        new Pokemon("#007", "Squirtle", "Water", null, R.drawable.squirtle, 1, "rare");
        new Pokemon("#008", "Wartortle", "Water", null, R.drawable.wartortle,1,"superrare");
        new Pokemon("#009", "Blastoise", "Water", null, R.drawable.blastoise,1, "ultra");
        new Pokemon("#010", "Caterpie", "Bug", null, R.drawable.caterpie,1, "common");
        new Pokemon("#011", "Metapod", "Bug", null, R.drawable.metapod,1, "common");
        new Pokemon("#012", "Butterfree", "Bug", "Flying", R.drawable.butterfree,1, "rare");
        new Pokemon("#013", "Weedle", "Bug", "Poison", R.drawable.weedle,1,"common");
        new Pokemon("#014", "Kakuna", "Bug", "Poison", R.drawable.kakuna,1,"common");
        new Pokemon("#015", "Beedrill", "Bug", "Poison", R.drawable.beedrill,1,"rare");
        new Pokemon("#016", "Pidgey", "Normal", "Flying", R.drawable.pidgey,1,"common");
        new Pokemon("#017", "Pidgeotto", "Normal", "Flying", R.drawable.pidgeotto,1,"rare");
        new Pokemon("#018", "Pidgeot", "Normal", "Flying", R.drawable.pidgeot,1,"superrare");
        new Pokemon("#019", "Rattata", "Normal", null, R.drawable.rattata,1,"common");
        new Pokemon("#020", "Raticate", "Normal", null, R.drawable.raticate,1,"rare");
        new Pokemon("#021", "Spearow", "Normal", "Flying", R.drawable.spearow,1,"common");
        new Pokemon("#022", "Fearow", "Normal", "Flying", R.drawable.fearow,1,"rare");
        new Pokemon("#023", "Ekans", "Poison", null, R.drawable.ekans,1,"common");
        new Pokemon("#024", "Arbok", "Poison", null, R.drawable.arbok,1,"rare");
        new Pokemon("#025", "Pikachu", "Electric", null, R.drawable.pikachu,1,"rare");
        new Pokemon("#026", "Raichu", "Electric", null, R.drawable.raichu,1,"ultra");
        new Pokemon("#027", "Sandshrew", "Ground", null, R.drawable.sandshrew,1,"common");
        new Pokemon("#028", "Sandslash", "Ground", null, R.drawable.sandslash,1,"rare");
        new Pokemon("#029", "Nidoran♀", "Poison", null, R.drawable.nidoranf,1,"common");
        new Pokemon("#030", "Nidorina", "Poison", null, R.drawable.nidorina,1,"rare");
        new Pokemon("#031", "Nidoqueen", "Poison", "Ground", R.drawable.nidoqueen,1,"superrare");
        new Pokemon("#032", "Nidoran♂", "Poison", null, R.drawable.nidoranm,1,"common");
        new Pokemon("#033", "Nidorino", "Poison", null, R.drawable.nidorino,1,"rare");
        new Pokemon("#034", "Nidoking", "Poison", "Ground", R.drawable.nidoking,1,"superrare");
        new Pokemon("#035", "Clefairy", "Fairy", null, R.drawable.clefairy,1,"rare");
        new Pokemon("#036", "Clefable", "Fairy", null, R.drawable.clefable,1,"superrare");
        new Pokemon("#037", "Vulpix", "Fire", null, R.drawable.vulpix,1,"rare");
        new Pokemon("#038", "Ninetales", "Fire", null, R.drawable.ninetales,1,"ultra");
        new Pokemon("#039", "Jigglypuff", "Normal", "Fairy", R.drawable.jigglypuff,1, "common");
        new Pokemon("#040", "Wigglytuff", "Normal", "Fairy", R.drawable.wigglytuff,1,"superrare");
        new Pokemon("#041", "Zubat", "Poison", "Flying", R.drawable.zubat,1,"common");
        new Pokemon("#042", "Golbat", "Poison", "Flying", R.drawable.golbat,1,"rare");
        new Pokemon("#043", "Oddish", "Grass", "Poison", R.drawable.oddish,1,"common");
        new Pokemon("#044", "Gloom", "Grass", "Poison", R.drawable.gloom,1,"rare");
        new Pokemon("#045", "Vileplume", "Grass", "Poison", R.drawable.vileplume,1,"superrare");
        new Pokemon("#046", "Paras", "Bug", "Grass", R.drawable.paras, 1,"common");
        new Pokemon("#047", "Parasect", "Bug", "Grass", R.drawable.parasect,1,"rare");
        new Pokemon("#048", "Venonat", "Bug", "Poison", R.drawable.venonat,1,"rare");
        new Pokemon("#049", "Venomoth", "Bug", "Poison", R.drawable.venomoth,1,"superrare");
        new Pokemon("#050", "Diglett", "Ground", null, R.drawable.diglett,1,"common");
        new Pokemon("#051", "Dugtrio", "Ground", null, R.drawable.dugtrio,1,"ultra");
        new Pokemon("#052", "Meowth", "Normal", null, R.drawable.meowth,1,"rare");
        new Pokemon("#053", "Persian", "Normal", null, R.drawable.persian,1,"ultra");
        new Pokemon("#054", "Psyduck", "Water", null, R.drawable.psyduck,1,"common");
        new Pokemon("#055", "Golduck", "Water", null, R.drawable.golduck,1,"superrare");
        new Pokemon("#056", "Mankey", "Fighting", null, R.drawable.mankey,1,"rare");
        new Pokemon("#057", "Primeape", "Fighting", null, R.drawable.primeape,1,"ultra");
        new Pokemon("#058", "Growlithe", "Fire", null, R.drawable.growlithe,1,"superrare");
        new Pokemon("#059", "Arcanine", "Fire", null, R.drawable.arcanine,1, "ultra");
        new Pokemon("#060", "Poliwag", "Water", null, R.drawable.poliwag,1,"common");
        new Pokemon("#061", "Poliwhirl", "Water", null, R.drawable.poliwhirl,1,"rare");
        new Pokemon("#062", "Poliwrath", "Water", "Fighting", R.drawable.poliwrath,1,"ultra");
        new Pokemon("#063", "Abra", "Psychic", null, R.drawable.abra,1,"common");
        new Pokemon("#064", "Kadabra", "Psychic", null, R.drawable.kadabra,1,"rare");
        new Pokemon("#065", "Alakazam", "Psychic", null, R.drawable.alakazam,1,"ultra");
        new Pokemon("#066", "Machop", "Fighting", null, R.drawable.machop,1,"rare");
        new Pokemon("#067", "Machoke", "Fighting", null, R.drawable.machoke,1,"superrare");
        new Pokemon("#068", "Machamp", "Fighting", null, R.drawable.machamp,1,"superrare");
        new Pokemon("#069", "Bellsprout", "Grass", "Poison", R.drawable.bellsprout,1,"common");
        new Pokemon("#070", "Weepinbell", "Grass", "Poison", R.drawable.weepinbell,1,"rare");
        new Pokemon("#071", "Victreebel", "Grass", "Poison", R.drawable.victreebel,1,"superrare");
        new Pokemon("#072", "Tentacool", "Water", "Poison", R.drawable.tentacool,1,"common");
        new Pokemon("#073", "Tentacruel", "Water", "Poison", R.drawable.tentacruel,1,"rare");
        new Pokemon("#074", "Geodude", "Rock", "Ground", R.drawable.geodude,1,"common");
        new Pokemon("#075", "Graveler", "Rock", "Ground", R.drawable.graveler,1,"rare");
        new Pokemon("#076", "Golem", "Rock", "Ground", R.drawable.golem,1,"ultra");
        new Pokemon("#077", "Ponyta", "Fire", null, R.drawable.ponyta,1,"rare");
        new Pokemon("#078", "Rapidash", "Fire", null, R.drawable.rapidash,1,"ultra");
        new Pokemon("#079", "Slowpoke", "Water", "Psychic", R.drawable.slowpoke,1,"common");
        new Pokemon("#080", "Slowbro", "Water", "Psychic", R.drawable.slowbro,1,"rare");
        new Pokemon("#081", "Magnemite", "Electric", "Steel", R.drawable.magnemite,1,"common");
        new Pokemon("#082", "Magneton", "Electric", "Steel", R.drawable.magneton,1,"rare");
        new Pokemon("#083", "Farfetch'd", "Normal", "Flying", R.drawable.farfetchd,1,"superrare");
        new Pokemon("#084", "Doduo", "Normal", "Flying", R.drawable.doduo,1,"common");
        new Pokemon("#085", "Dodrio", "Normal", "Flying", R.drawable.dugtrio,1,"rare");
        new Pokemon("#086", "Seel", "Water", null, R.drawable.seel,1,"rare");
        new Pokemon("#087", "Dewgong", "Water", "Ice", R.drawable.dewgong,1,"superrare");
        new Pokemon("#088", "Grimer", "Poison", null, R.drawable.grimer,1,"common");
        new Pokemon("#089", "Muk", "Poison", null, R.drawable.muk,1,"superrare");
        new Pokemon("#090", "Shellder", "Water", null, R.drawable.shellder,1,"common");
        new Pokemon("#091", "Cloyster", "Water", "Ice", R.drawable.cloyster,1,"superrare");
        new Pokemon("#092", "Gastly", "Ghost", "Poison", R.drawable.gastly,1,"common");
        new Pokemon("#093", "Haunter", "Ghost", "Poison", R.drawable.haunter,1,"rare");
        new Pokemon("#094", "Gengar", "Ghost", "Poison", R.drawable.gengar,1,"ultra");
        new Pokemon("095", "Onix", "Rock", "Ground", R.drawable.onix,1,"rare");
        new Pokemon("#096", "Drowzee", "Psychic", null, R.drawable.drowzee,1,"common");
        new Pokemon("#097", "Hypno", "Psychic", null, R.drawable.hypno,1,"superrare");
        new Pokemon("#098", "Krabby", "Water", null, R.drawable.krabby,1,"commmon");
        new Pokemon("#099", "Kingler", "Water", null, R.drawable.kingler,1,"ultra");
        new Pokemon("#100", "Voltorb", "Electric", null, R.drawable.voltorb,1,"rare");
        new Pokemon("#101", "Electrode", "Electric", null, R.drawable.electrode,1,"superrare");
        new Pokemon("#102", "Exeggcute", "Grass", "Psychic", R.drawable.exeggcute,1,"common");
        new Pokemon("#103", "Exeggutor", "Grass", "Psychic", R.drawable.exeggutor,1,"rare");
        new Pokemon("#104", "Cubone", "Ground", null, R.drawable.cubone,1,"rare");
        new Pokemon("#105", "Marowak", "Ground", null, R.drawable.marowak,1,"ultra");
        new Pokemon("#106", "Hitmonlee", "Fighting", null, R.drawable.hitmonlee,1, "ultra");
        new Pokemon("#107", "Hitmonchan", "Fighting", null, R.drawable.hitmonchan, 1,"ultra");
        new Pokemon("#108", "Lickitung", "Normal", null, R.drawable.lickitung,1,"rare");
        new Pokemon("#109", "Koffing", "Poison", null, R.drawable.koffing,1,"common");
        new Pokemon("#110", "Weezing", "Poison", null, R.drawable.weezing,1,"rare");
        new Pokemon("#111", "Rhyhorn", "Ground", "Rock", R.drawable.rhyhorn,1,"common");
        new Pokemon("#112", "Rhydon", "Ground", "Rock", R.drawable.rhydon,1,"superrare");
        new Pokemon("#113", "Chansey", "Normal", null, R.drawable.chansey,1,"rare");
        new Pokemon("#114", "Tangela", "Grass", null, R.drawable.tangela,1,"rare");
        new Pokemon("#115", "Kangaskhan", "Normal", null, R.drawable.kangaskhan,1,"superrare");
        new Pokemon("#116", "Horsea", "Water", null, R.drawable.horsea,1,"common");
        new Pokemon("#117", "Seadra", "Water", null, R.drawable.seadra,1,"rare");
        new Pokemon("#118", "Goldeen", "Water", null, R.drawable.goldeen,1,"common");
        new Pokemon("#119", "Seaking", "Water", null, R.drawable.seaking,1,"rare");
        new Pokemon("#120", "Staryu", "Water", null, R.drawable.staryu,1,"common");
        new Pokemon("#121", "Starmie", "Water", "Psychic", R.drawable.starmie,1,"superrare");
        new Pokemon("#122", "Mr.Mime", "Psychic", "Fairy", R.drawable.mrmime,1,"rare");
        new Pokemon("#123", "Scyther", "Bug", "Flying", R.drawable.scyther,1,"rare");
        new Pokemon("#124", "Jynx", "Ice", "Psychic", R.drawable.jynx,1,"rare");
        new Pokemon("#125", "Electabuzz", "Electric", null, R.drawable.electrabuzz,1,"superrare");
        new Pokemon("#126", "Magmar", "Fire", null, R.drawable.magmar,1,"superrare");
        new Pokemon("#127", "Pinsir", "Bug", null, R.drawable.pinsir,1,"rare");
        new Pokemon("#128", "Tauros", "Normal", null, R.drawable.tauros,1,"rare");
        new Pokemon("#129", "Magikarp", "Water", null, R.drawable.magikarp,1,"common");
        new Pokemon("#130", "Gyarados",	"Water", "Flying", R.drawable.gyarados,1,"ultra");
        new Pokemon("#131:", "Lapras", "Water", "Ice", R.drawable.lapras,1,"legend");
        new Pokemon("#132", "Ditto", "Normal", null, R.drawable.ditto,1,"rare");
        new Pokemon("#133", "Eevee", "Normal", null, R.drawable.eevee,1,"rare");
        new Pokemon("#134", "Vaporeon", "Water", null, R.drawable.vaporeon,1,"ultra");
        new Pokemon("#135", "Jolteon", "Electric", null, R.drawable.jolteon,1,"ultra");
        new Pokemon("#136", "Flareon", "Fire", null , R.drawable.flareon,1,"ultra");
        new Pokemon("#137", "Porygon", "Normal", null, R.drawable.porygon,1,"rare");
        new Pokemon("#138", "Omanyte", "Rock", "Water", R.drawable.omanyte,1,"superrare");
        new Pokemon("#139", "Omastar", "Rock", "Water", R.drawable.omaster,1,"ultra");
        new Pokemon("#140", "Kabuto", "Rock", "Water", R.drawable.kabuto,1,"superrare");
        new Pokemon("#141", "Kabutops", "Rock", "Water", R.drawable.kabutops,1,"ultra");
        new Pokemon("#142", "Aerodactyl", "Rock", "Flying", R.drawable.aerodactyl,1,"ultra");
        new Pokemon("#143", "Snorlax", "Normal", null, R.drawable.snorlax,1,"ultra");
        new Pokemon("#144", "Articuno", "Ice", "Flying", R.drawable.articuno,1,"legend");
        new Pokemon("#145", "Zapdos", "Electric",  "Flying", R.drawable.zapdos,1,"legend");
        new Pokemon("#146", "Moltres", "Fire", "Flying", R.drawable.moltres,1,"legend");
        new Pokemon("#147", "Dratini", "Dragon", null, R.drawable.dratini,1,"superrare");
        new Pokemon("#148", "Dragonair", "Dragon", null, R.drawable.dragonair,1, "ultra");
        new Pokemon("#149", "Dragonite", "Dragon", "Flying", R.drawable.dragonite,1,"legend");
        new Pokemon("#150", "Mewtwo", "Psychic", null, R.drawable.mewtwo,1, "legend");
        new Pokemon("#151", "Mew", "Psychic", null, R.drawable.mew,1,"legend");
    }

}

