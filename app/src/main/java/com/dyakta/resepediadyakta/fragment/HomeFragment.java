package com.dyakta.resepediadyakta.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dyakta.resepediadyakta.MainActivity;
import com.dyakta.resepediadyakta.Produk;
import com.dyakta.resepediadyakta.ProdukAdapter;
import com.dyakta.resepediadyakta.R;
import com.dyakta.resepediadyakta.SwipeHelper;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProdukAdapter adapter;
    private ArrayList<Produk> produkArrayList;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        addData();

        recyclerView =  view.findViewById(R.id.rv_produk);

        adapter = new ProdukAdapter(getContext(), produkArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        ItemTouchHelper.Callback callback=new SwipeHelper(adapter);
        ItemTouchHelper helper=new ItemTouchHelper(callback);
        helper.attachToRecyclerView(recyclerView);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    private void addData() {
        produkArrayList = new ArrayList<>();
        produkArrayList.add(new Produk("Produk A"));
        produkArrayList.add(new Produk("Produk B"));
        produkArrayList.add(new Produk("Produk C"));
        produkArrayList.add(new Produk("Produk D"));
    }
}
