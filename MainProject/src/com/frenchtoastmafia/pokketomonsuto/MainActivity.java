package com.frenchtoastmafia.pokketomonsuto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends SingleFragmentActivity {
	
	private ImageButton pokeButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pokeButton = (ImageButton)findViewById(R.id.imageView1);
		pokeButton.setOnClickListener(new View.OnClickListener() {
			
			//@Override
			public void onClick(View v) {
				setContentView(R.layout.pokemon_activity);
				
			}
	});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new pokemonListFragment();
	}

}
