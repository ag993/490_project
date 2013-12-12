package com.frenchtoastmafia.pokketomonsuto;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class pokemonListFragment extends ListFragment {
	
	public ArrayList<pokemon> pokemonArray;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.id.textViewPokemonNameForList);
		pokemonArray = PokemonLab.get(getActivity()).getPokemons();
		
	}

}
