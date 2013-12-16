package com.example.pokemonster;

import android.support.v4.app.Fragment;

public class PokemonActivity extends SingleFragmentActivity {

  //  @Override
    //protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_pokemon);
        
        //FragmentManager fm = getSupportFragmentManager(); 
        //Fragment fragment = fm.findFragmentById(R.id.fragmentContainer); 
        	//	if(fragment == null) {
        		//	fragment = new PokemonFragment(); 
        			//fm.beginTransaction()
        				//.add(R.id.fragmentContainer, fragment) 
        				//.commit(); 
        		//}
   // }
    
	
//@Override 
protected Fragment createFragment() {
	//UUID pokeDexNum = (UUID)getIntent().getSerializableExtra(PokemonFragment.EXTRA_POKEMON_ID);
	//return PokemonFragment.newInstance(pokeDexNum);
	return new PokemonFragment();
}
}
