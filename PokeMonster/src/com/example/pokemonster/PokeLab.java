package com.example.pokemonster;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class PokeLab {
	public ArrayList<Pokemon> mPokemons; 
	public static PokeLab sPokeLab; 
	public Context mAppContext; 
	
	public PokeLab(Context appContext) {
		
		mAppContext = appContext;
		mPokemons = new ArrayList<Pokemon>();
/*		for (int i = 0; i < 12; i++) {
			Pokemon c = new Pokemon(); 
			c.setPokeName("Pokemon Name is: " + i);
			mPokemons.add(c);*/
		
		Pokemon theBulbasaur = new Pokemon();
		theBulbasaur.setPokeName("Bulbasaur");
		theBulbasaur.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_grass));
		theBulbasaur.setPokeType2(appContext.getResources().getDrawable(R.drawable.type_poison));
		theBulbasaur.setPokeHP(45);
		theBulbasaur.setPokeAttack(49);
		theBulbasaur.setPokeDefense(49);
		theBulbasaur.setPokeSpeed(45);
		theBulbasaur.setCustomDexNum("001");
		theBulbasaur.setImage(appContext.getResources().getDrawable(R.drawable.bulbasaur));

		
		Pokemon theCharmander = new Pokemon();
		theCharmander.setPokeName("Charmander");
		theCharmander.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_fire));
		theCharmander.setPokeHP(39);
		theCharmander.setPokeAttack(52);
		theCharmander.setPokeDefense(43);
		theCharmander.setPokeSpeed(65);
		theCharmander.setCustomDexNum("004");
		theCharmander.setImage(appContext.getResources().getDrawable(R.drawable.charmander));
		
		Pokemon theSquirtle = new Pokemon();
		theSquirtle.setPokeName("Squirtle");
		theSquirtle.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_water));
		theSquirtle.setPokeHP(44);
		theSquirtle.setPokeAttack(48);
		theSquirtle.setPokeDefense(65);
		theSquirtle.setPokeSpeed(43);
		theSquirtle.setCustomDexNum("007");
		theSquirtle.setImage(appContext.getResources().getDrawable(R.drawable.squirtle));
		
		Pokemon theCaterpie = new Pokemon();
		theCaterpie.setPokeName("Caterpie");
		theCaterpie.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_bug));
		theCaterpie.setPokeHP(45);
		theCaterpie.setPokeAttack(35);
		theCaterpie.setPokeDefense(35);
		theCaterpie.setPokeSpeed(45);
		theCaterpie.setCustomDexNum("010");
		theCaterpie.setImage(appContext.getResources().getDrawable(R.drawable.caterpie));
		
		Pokemon theWeedle = new Pokemon();
		theWeedle.setPokeName("Weedle");
		theWeedle.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_bug));
		theWeedle.setPokeType2(appContext.getResources().getDrawable(R.drawable.type_poison));
		theWeedle.setPokeHP(40);
		theWeedle.setPokeAttack(35);
		theWeedle.setPokeDefense(30);
		theWeedle.setPokeSpeed(50);
		theWeedle.setCustomDexNum("013");
		theWeedle.setImage(appContext.getResources().getDrawable(R.drawable.weedle));
		
		Pokemon thePidgey = new Pokemon();
		thePidgey.setPokeName("Pidgey");
		thePidgey.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_normal));
		thePidgey.setPokeType2(appContext.getResources().getDrawable(R.drawable.type_flying));
		thePidgey.setPokeHP(40);
		thePidgey.setPokeAttack(45);
		thePidgey.setPokeDefense(40);
		thePidgey.setPokeSpeed(56);
		thePidgey.setCustomDexNum("016");
		thePidgey.setImage(appContext.getResources().getDrawable(R.drawable.pidgey));
		
		Pokemon theRattata = new Pokemon();
		theRattata.setPokeName("Rattata");
		theRattata.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_normal));
		theRattata.setPokeHP(30);
		theRattata.setPokeAttack(56);
		theRattata.setPokeDefense(35);
		theRattata.setPokeSpeed(72);
		theRattata.setCustomDexNum("019");
		theRattata.setImage(appContext.getResources().getDrawable(R.drawable.rattata));
		
		Pokemon theSpearow = new Pokemon();
		theSpearow.setPokeName("Spearow");
		theSpearow.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_normal));
		theSpearow.setPokeType2(appContext.getResources().getDrawable(R.drawable.type_flying));
		theSpearow.setPokeHP(40);
		theSpearow.setPokeAttack(60);
		theSpearow.setPokeDefense(30);
		theSpearow.setPokeSpeed(70);
		theSpearow.setCustomDexNum("021");
		theSpearow.setImage(appContext.getResources().getDrawable(R.drawable.spearow));
		
		Pokemon theEkans = new Pokemon();
		theEkans.setPokeName("Ekans");
		theEkans.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_poison));
		theEkans.setPokeHP(35);
		theEkans.setPokeAttack(60);
		theEkans.setPokeDefense(44);
		theEkans.setPokeSpeed(55);
		theEkans.setCustomDexNum("023");
		theEkans.setImage(appContext.getResources().getDrawable(R.drawable.ekans));
		
		Pokemon thePikachu = new Pokemon();
		thePikachu.setPokeName("Pikachu");
		thePikachu.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_electric));
		thePikachu.setPokeHP(35);
		thePikachu.setPokeAttack(55);
		thePikachu.setPokeDefense(30);
		thePikachu.setPokeSpeed(90);
		thePikachu.setCustomDexNum("025");
		thePikachu.setImage(appContext.getResources().getDrawable(R.drawable.pikachu));
		
		Pokemon theSandshrew = new Pokemon();
		theSandshrew.setPokeName("Sandshrew");
		theSandshrew.setPokeType1(appContext.getResources().getDrawable(R.drawable.type_ground));
		theSandshrew.setPokeHP(50);
		theSandshrew.setPokeAttack(75);
		theSandshrew.setPokeDefense(85);
		theSandshrew.setPokeSpeed(40);
		theSandshrew.setCustomDexNum("027");
		theSandshrew.setImage(appContext.getResources().getDrawable(R.drawable.sandshrew));
		
		
		mPokemons.add(theBulbasaur);
		mPokemons.add(theCharmander);
		mPokemons.add(theSquirtle);
		mPokemons.add(theCaterpie);
		mPokemons.add(theWeedle);
		mPokemons.add(thePidgey);
		mPokemons.add(theRattata);
		mPokemons.add(theSpearow);
		mPokemons.add(theEkans);
		mPokemons.add(thePikachu);
		
		
		
		
		}
	//}

	public static PokeLab get(Context c) {
		if(sPokeLab == null) {
			sPokeLab = new PokeLab(c.getApplicationContext()); 
		}
		return sPokeLab; 
	}
	
	public ArrayList<Pokemon> getPokemons() {
		return mPokemons;
	}
	
	public Pokemon getPokemon(UUID pokeDexNum) {
		for(Pokemon c : mPokemons){
			if(c.getPokeDexNum().equals(pokeDexNum))
				return c;
		}
		return null;
	}
	
	public Bitmap getBitmapFromURL(String src)
	{
		try 
		{
			URL url = new URL(src);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoInput(true);
			connection.connect();
			//InputStream input = connection.getInputStream();
			Bitmap myImage = BitmapFactory.decodeStream(connection.getInputStream());
			return myImage;
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
}
