package com.example.pokemonster;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PokemonListFragment extends ListFragment {
	private static final String TAG = "PokeMonListFragment";
	private ArrayList<Pokemon> mPokemons;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		//getActivity().setName(R.string.pokemons_name);
		mPokemons = PokeLab.get(getActivity()).getPokemons();
		
		ArrayAdapter<Pokemon> adapter =
				new ArrayAdapter<Pokemon> (getActivity(),android.R.layout.simple_list_item_1, mPokemons);
		
		setListAdapter(adapter);
		
	}
	
	//@Override
	public void onListItemClick(ListView l, View v, int position, long id)
	{
		Pokemon p = (Pokemon) (getListAdapter()).getItem(position);
		//indexPosition = position;
		Intent i = new Intent(getActivity(),PokemonActivity.class);
		i.putExtra(PokemonFragment.EXTRA_POKEMON_ID,p.getPokeDexNum());
		startActivity(i);
	}

}
