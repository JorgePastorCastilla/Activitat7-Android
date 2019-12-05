package com.example.activitat7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        // layout de la llista
        return inflater.inflate(R.layout.fragment_detall, container, false);
    }
    public void mostrarDetall(String vi){
        TextView textView = getView().findViewById(R.id.Texto);
        textView.setText(vi);
    }
}
