package com.ventana;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;


public class AcercaDe extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   /**metodo OnCreate enlaza la clase AcercaDe con el archivo xml creado acercade */
        setContentView(R.layout.acercade);
    }
	public void cerrar(View view) {            /** m�todo que da la funcionalidad al bot�n Regresar */
	     finish();
	    }

}
