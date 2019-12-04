package com.example.activitat7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class LlistaFragment extends Fragment {
    private ArrayList<String> llista;
    private ListView lwLlista;
    private VinsListener listener;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // layout de la llista
        return inflater.inflate(R.layout.fragment_llista, container, false);
    }
    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        lwLlista = (ListView)getView().findViewById(R.id.Llista);
        // Creem una llista amb els vins
        llista = new ArrayList<String>();
        llista.add("Anima negra");
        llista.add("Son Bordils");
        llista.add("Franja roja");
        llista.add("Butxet");
        llista.add("Son Ramon");
        // Posem la llista de vins al ListView
        lwLlista.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, llista));
        lwLlista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> list, View view, int pos,
                                long id) {
            if (listener!=null) {
                listener.onViSeleccionat((String)
                        list.getAdapter().getItem(pos));
                // o també listener.onViSeleccionat(llista.get(pos))
            }
        }
    });
    }
    public interface VinsListener {
        void onViSeleccionat(String vi);
    }
    public void setVinsListener(VinsListener listener) {
        this.listener=listener;
    }
}
