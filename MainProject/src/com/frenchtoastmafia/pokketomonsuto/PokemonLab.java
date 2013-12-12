package com.frenchtoastmafia.pokketomonsuto;

import java.util.ArrayList;

import android.content.Context;
import android.widget.ImageButton;

public class PokemonLab {
	
	private Context mAppContext;
	private static PokemonLab sPokemonLab;
	public ArrayList<pokemon> pokemonArray;
	
	pokemon theBulbasaur = new pokemon("Bulbasaur",001, "Grass", "Poison", 45, 49, 49, 45);
	pokemon theCharmander = new pokemon("Charmander",004, "Fire", "NA", 39, 52, 43, 65);
	pokemon theSquirtle = new pokemon("Squirtle", 007, "Water", "NA", 44, 48, 65, 43);
	pokemon theCaterpie = new pokemon("Caterpie", 010, "Bug", "NA", 45, 30, 35, 45); 
	
	private PokemonLab (Context appContext) 
	{
		mAppContext = appContext;
			pokemonArray = new ArrayList<pokemon>();
			pokemonArray.add(theBulbasaur);
			pokemonArray.add(theCharmander);
			pokemonArray.add(theSquirtle);
			pokemonArray.add(theCaterpie);
		
	}
	
	public static PokemonLab get(Context c) 
	{
		if (sPokemonLab == null) {
			sPokemonLab = new PokemonLab(c.getApplicationContext());
		}
		
		return sPokemonLab;
	}
	
	public ArrayList<pokemon> getPokemons()
	{
		return pokemonArray;
	}

}


