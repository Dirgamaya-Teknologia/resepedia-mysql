package com.dyakta.resepediadyakta.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dyakta.resepediadyakta.Produk;
import com.dyakta.resepediadyakta.ProdukAdapter;
import com.dyakta.resepediadyakta.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProdukFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProdukAdapter adapter;
    private ArrayList<Produk> produkArrayList;

    public ProdukFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_produk, container, false);

        Button produk = view.findViewById(R.id.button2);

        addData();

        recyclerView =  view.findViewById(R.id.rv_produk2);

        adapter = new ProdukAdapter(getContext(), produkArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        recyclerView.setVisibility(View.GONE);

        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }

    private void addData() {
        produkArrayList = new ArrayList<>();
        produkArrayList.add(new Produk("Produk A"));
        produkArrayList.add(new Produk("Produk B"));
        produkArrayList.add(new Produk("Produk C"));
        produkArrayList.add(new Produk("Produk D"));
    }
}
