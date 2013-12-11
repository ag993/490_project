import com.frenchtoastmafia.pokketomonsuto.R.string;


public class Pokemon {
	public string mPokemonName;
	public int mPokemonHP;
	public int mPokemonAttack;
	public int mPokemonDefense;
	public int mPokemonSpecialAttack;
	public int mPokemonSpecialDefense;
	public int mPokemonSpeed;
	public avatar mAvatar;
	
	public Pokemon(string name, int hP, int attack, int defense, int specialAttack, int specialDefense, int speed){
		name = mPokemonName;
		
		hP = mPokemonHP;
		
		attack = mPokemonAttack;
		
		defense = mPokemonDefense;
		
		specialAttack = mPokemonSpecialAttack;
		
		specialDefense = mPokemonSpecialDefense;
		
		speed = mPokemonSpeed;
	}

	public string getPokemonName() {
		return mPokemonName;
	}

	public void setPokemonName(string pokemonName) {
		mPokemonName = pokemonName;
	}

	public int getPokemonHP() {
		return mPokemonHP;
	}

	public void setPokemonHP(int pokemonHP) {
		mPokemonHP = pokemonHP;
	}

	public int getPokemonAttack() {
		return mPokemonAttack;
	}

	public void setPokemonAttack(int pokemonAttack) {
		mPokemonAttack = pokemonAttack;
	}

	public int getPokemonDefense() {
		return mPokemonDefense;
	}

	public void setPokemonDefense(int pokemonDefense) {
		mPokemonDefense = pokemonDefense;
	}

	public int getPokemonSpecialAttack() {
		return mPokemonSpecialAttack;
	}

	public void setPokemonSpecialAttack(int pokemonSpecialAttack) {
		mPokemonSpecialAttack = pokemonSpecialAttack;
	}

	public int getPokemonSpecialDefense() {
		return mPokemonSpecialDefense;
	}

	public void setPokemonSpecialDefense(int pokemonSpecialDefense) {
		mPokemonSpecialDefense = pokemonSpecialDefense;
	}

	public int getPokemonSpeed() {
		return mPokemonSpeed;
	}

	public void setPokemonSpeed(int pokemonSpeed) {
		mPokemonSpeed = pokemonSpeed;
	};
	
	
}
