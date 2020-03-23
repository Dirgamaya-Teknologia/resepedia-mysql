package com.dyakta.resepediadyakta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListResepActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ResepAdapter adapter;
    private ArrayList<Resep> resepArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resep);

        TextView nameTxt = findViewById(R.id.textView);
        nameTxt.setText("List Resep");

        addData();

        recyclerView =  findViewById(R.id.rv_resep);

        adapter = new ResepAdapter(this, resepArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListResepActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);




    }

    private void addData() {
        resepArrayList = new ArrayList<>();
        resepArrayList.add(new Resep("Resep Ikan Bakar"));
        resepArrayList.add(new Resep("Resep Ayam Taliwang"));
        resepArrayList.add(new Resep("Resep Ayam Geprek"));
        resepArrayList.add(new Resep("Resep Ayam Bakar"));
    }
}
