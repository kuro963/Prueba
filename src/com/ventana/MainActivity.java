package com.ventana;

import android.support.v7.app.ActionBarActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	 public void lanzar(View view) {
         Intent i = new Intent(this, AcercaDe.class );  /*metodo que abrira la segunda ventana al presionar el boton Opcion 'X' */
         startActivity(i);
   }

	
}
