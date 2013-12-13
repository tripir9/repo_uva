package com.uva.physics_uva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class pantalladeinicio extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pantalladeinicio);
        
        
        //Vamos a declarar un nuevo thread
        Thread timer = new Thread(){
            //El nuevo Thread exige el metodo run
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    //Si no puedo ejecutar el sleep muestro el error
                    e.printStackTrace();
                }finally{
                    //Llamo a la nueva actividad
//startActivity recibe por parametro un objeto del tipo Intent
//El Intent recibibe por parametro el NAME de la actividad que vamos a invocar
//Es el mismo que colocamos en el manifiesto
                    Intent actividaPrincipal = new Intent("com.example.practicas.fisisca.PRINCIPAL");
                    startActivity(actividaPrincipal);
                }                
            }
        };
        //ejecuto el thread
        timer.start();
    }

}
