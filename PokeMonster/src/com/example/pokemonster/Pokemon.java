package com.example.pokemonster;

import java.util.UUID;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class Pokemon {

	private String pokeName;
	private String customDexNum;
	public UUID pokeDexNum;
	private Drawable pokeType1;
	private Drawable pokeType2;
	private int pokeHP;
	private int pokeAttack;
	private int pokeDefense;
	private int pokeSpeed;
	private Drawable image;
	
	public String getCustomDexNum() {
		return customDexNum;
	}

	public void setCustomDexNum(String customDexNum) {
		this.customDexNum = customDexNum;
	}
	
	
	public Drawable getImage() {
		return image;
	}

	public void setImage(Drawable image) {
		this.image = image;
	}

	public Pokemon()
	{
		pokeDexNum = UUID.randomUUID();
	}
	
	@Override
	public String toString()
	{
		return pokeName;
	}
	
	public String getPokeName() {
		return pokeName;
	}


	public void setPokeName(String pokeName) {
		this.pokeName = pokeName;
	}


	public UUID getPokeDexNum() {
		return pokeDexNum;
	}


	public void setPokeDexNum(UUID pokeDexNum) {
		this.pokeDexNum = pokeDexNum;
	}


	public Drawable getPokeType1() {
		return pokeType1;
	}


	public void setPokeType1(Drawable pokeType1) {
		this.pokeType1 = pokeType1;
	}


	public Drawable getPokeType2() {
		return pokeType2;
	}


	public void setPokeType2(Drawable pokeType2) {
		this.pokeType2 = pokeType2;
	}


	public int getPokeHP() {
		return pokeHP;
	}


	public void setPokeHP(int pokeHP) {
		this.pokeHP = pokeHP;
	}


	public int getPokeAttack() {
		return pokeAttack;
	}


	public void setPokeAttack(int pokeAttack) {
		this.pokeAttack = pokeAttack;
	}


	public int getPokeDefense() {
		return pokeDefense;
	}


	public void setPokeDefense(int pokeDefense) {
		this.pokeDefense = pokeDefense;
	}


	public int getPokeSpeed() {
		return pokeSpeed;
	}


	public void setPokeSpeed(int pokeSpeed) {
		this.pokeSpeed = pokeSpeed;
	}

	

}
