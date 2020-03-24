package com.dyakta.resepediadyakta.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dyakta.resepediadyakta.Bahan;
import com.dyakta.resepediadyakta.BahanAdapter;
import com.dyakta.resepediadyakta.DetailActivity;
import com.dyakta.resepediadyakta.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BahanFragment extends Fragment {

    private RecyclerView recyclerView;
    private BahanAdapter adapter;
    private ArrayList<Bahan> bahanArrayList;

    public BahanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bahan, container, false);

        Button bahan = view.findViewById(R.id.button);

        addData();

        recyclerView =  view.findViewById(R.id.rv_bahan2);

        adapter = new BahanAdapter(getContext(), bahanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        recyclerView.setVisibility(View.GONE);

        bahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }

    private void addData() {
        bahanArrayList = new ArrayList<>();
        bahanArrayList.add(new Bahan("Bahan A","sadsd"));
        bahanArrayList.add(new Bahan("Bahan B","sadsd"));
        bahanArrayList.add(new Bahan("Bahan C","sadsd"));
        bahanArrayList.add(new Bahan("Bahan D","sadsd"));
    }
}
