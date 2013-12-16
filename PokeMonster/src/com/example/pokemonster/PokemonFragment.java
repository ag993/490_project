package com.example.pokemonster;

import java.util.UUID;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonFragment extends Fragment {
	public static final String EXTRA_POKEMON_ID = 
			"com.example.pokemonster.pokeDexNumID";
	public TextView name;
	public ImageView image;
	public TextView dexNum;
	public ImageView type1;
	public ImageView type2;
	public TextView attack;
	public TextView defense;
	public TextView hp;
	public TextView speed;
	public Pokemon zPokemon;
	
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		UUID pokeDexNumID = (UUID) getActivity().getIntent().getSerializableExtra(EXTRA_POKEMON_ID);
		//mPokemon = new Pokemon();
		//UUID pokeDexNum = (UUID) getArguments().getSerializable(EXTRA_POKEMON_ID);
		zPokemon = PokeLab.get(getActivity()).getPokemon(pokeDexNumID);
		
	}

	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_pokemon, parent, false); 
		name = (TextView)v.findViewById(R.id.pokemon_view_name);
		image = (ImageView)v.findViewById(R.id.pokemon_view_avatar);
		dexNum = (TextView)v.findViewById(R.id.pokemon_view_dexNum);
		type1 = (ImageView)v.findViewById(R.id.type1);
		type2 = (ImageView)v.findViewById(R.id.type2);
		attack = (TextView)v.findViewById(R.id.pokemon_view_attackValue);
		defense = (TextView)v.findViewById(R.id.pokemon_view_defenseValue);
		hp = (TextView)v.findViewById(R.id.pokemon_view_HPValue);
		speed = (TextView)v.findViewById(R.id.pokemon_view_speedValue);
		speed.setText("" + zPokemon.getPokeSpeed());
		hp.setText("" + zPokemon.getPokeHP());
		defense.setText("" + zPokemon.getPokeDefense());
		attack.setText("" + zPokemon.getPokeAttack());
		type2.setImageDrawable(zPokemon.getPokeType2());
		type1.setImageDrawable(zPokemon.getPokeType1());
		dexNum.setText(zPokemon.getCustomDexNum());
		image.setImageDrawable(zPokemon.getImage());
		name.setText(zPokemon.getPokeName());
		return v; 
	}
	
	/*public static PokemonFragment newInstance(UUID pokeDexNum)
	{
		Bundle args = new Bundle();
		args.putSerializable(EXTRA_POKEMON_ID, pokeDexNum);
		
		PokemonFragment fragment = new PokemonFragment();
		fragment.setArguments(args);
		return fragment;
	}*/

	
}
