package h.jpandullo.mapapptest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import h.jpandullo.mapapptest.Adapters.RecyclerItemAdapter;
import h.jpandullo.mapapptest.Models.ModelReciclerItem;

public class listFragment extends Fragment {
    RecyclerView recyclerItems;
    ArrayList<ModelReciclerItem> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_list,container,false);

        items = new ArrayList<>();
        recyclerItems = vista.findViewById(R.id.recycler);
        recyclerItems.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();

        RecyclerItemAdapter adapter = new RecyclerItemAdapter(items);
        recyclerItems.setAdapter(adapter);
        
        return vista;
    }

    private void llenarLista() {
        items.add(new ModelReciclerItem("Uno","Primer item"));
        items.add(new ModelReciclerItem("Dos","Segundo item"));
        items.add(new ModelReciclerItem("Tres","Tercer item"));
        items.add(new ModelReciclerItem("Cuatro","Cuarto item"));
        items.add(new ModelReciclerItem("Cinco","Quinto item"));
        items.add(new ModelReciclerItem("Seis","Sexto item"));
        items.add(new ModelReciclerItem("Siete","Septimo item"));
        items.add(new ModelReciclerItem("Ocho","Octavo item"));
        items.add(new ModelReciclerItem("Nueve","Noveno item"));
    }
}
