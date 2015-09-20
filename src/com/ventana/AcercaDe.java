package com.ventana;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;


public class AcercaDe extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   /**metodo OnCreate enlaza la clase AcercaDe con el archivo xml creado acercade */
        setContentView(R.layout.acercade);
    }
	public void cerrar(View view) {            /** método que da la funcionalidad al botón Regresar */
	     finish();
	    }

}
