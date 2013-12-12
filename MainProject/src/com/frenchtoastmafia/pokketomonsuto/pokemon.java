package com.frenchtoastmafia.pokketomonsuto;


public class pokemon {

	private String pokeName;
	private int pokeDexNum;
	private String pokeType1;
	private String pokeType2;
	private int pokeHP;
	private int pokeAttack;
	private int pokeDefense;
	private int pokeSpeed;
	
	
	public pokemon(String aName, int aDexNumber, String aType1, String aType2, int aHp, int anAttack, int aDefense, int aSpeed)
	{
		setPokeName(aName);
		setPokeDexNum(aDexNumber);
		setPokeType1(aType1);
		setPokeType2(aType2);
		setPokeHP(aHp);
		setPokeAttack(anAttack);
		setPokeDefense(aDefense);
		setPokeSpeed(aSpeed);
	}
	
	public String getPokeName() {
		return pokeName;
	}


	public void setPokeName(String pokeName) {
		this.pokeName = pokeName;
	}


	public int getPokeDexNum() {
		return pokeDexNum;
	}


	public void setPokeDexNum(int pokeDexNum) {
		this.pokeDexNum = pokeDexNum;
	}


	public String getPokeType1() {
		return pokeType1;
	}


	public void setPokeType1(String pokeType1) {
		this.pokeType1 = pokeType1;
	}


	public String getPokeType2() {
		return pokeType2;
	}


	public void setPokeType2(String pokeType2) {
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
