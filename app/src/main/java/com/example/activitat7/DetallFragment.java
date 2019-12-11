package com.example.activitat7;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class DetallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_detall, container, false);
    }
    public void mostrarDetall(String vi){
        TextView textView = getView().findViewById(R.id.Texto);
        textView.setText(vi);

        // layout de la llista
        Button botomp3 = getActivity().findViewById(R.id.btnMP3);
        botomp3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.a);
                mp.start(); // per aturar faríem servir mp.stop()
            }
        });

        // Quan seleccionem una puntuació
        final RatingBar rating = getActivity().findViewById(R.id.ratingBar);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getActivity(), getString(R.string.puntuacio) + " " + rating,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
