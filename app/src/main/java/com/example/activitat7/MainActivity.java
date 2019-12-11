package com.example.activitat7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        LlistaFragment.VinsListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Cercam el fragment de llista (present a les dues orientacions)
        LlistaFragment frgLlista=(LlistaFragment)
                getSupportFragmentManager().findFragmentById(R.id.FrgLlistat);
        frgLlista.setVinsListener(this); // assignam la resposta a través de
        //la interfície (onViSeleccionat)
    }
    @Override
    public void onViSeleccionat(String vi) {
        // Mirar l'orientació
        boolean horitzontal=getResources().getBoolean(R.bool.modeHoritzontal);
        if(horitzontal) {
            // estam en horitzontal
            ((DetallFragment) getSupportFragmentManager().findFragmentById(R.id.FrgDetall)).mostrarDetall(vi);

        }
        else {

            // estam en vertical
            Intent i = new Intent(this, DetallActivity.class);
            i.putExtra("nomvi", vi);
            startActivity(i);
        }
    }
}
