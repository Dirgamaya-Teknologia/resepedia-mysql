package com.dyakta.resepediadyakta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BahanAdapter adapter;
    private ArrayList<Bahan> bahanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameTxt = findViewById(R.id.textView2);
        TextView list_resep = findViewById(R.id.textView3);

        list_resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, ListResepActivity.class));
            }
        });


        //RECEIVE DATA
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");


        //bind data
        nameTxt.setText(name);

        addData();

        recyclerView =  findViewById(R.id.rv_bahan);

        adapter = new BahanAdapter(this, bahanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DetailActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

//        ItemTouchHelper.Callback callback=new SwipeHelper(adapter);
//        ItemTouchHelper helper=new ItemTouchHelper(callback);
//        helper.attachToRecyclerView(recyclerView);

    }

    private void addData() {
        bahanArrayList = new ArrayList<>();
        bahanArrayList.add(new Bahan("Bahan A","sadsd"));
        bahanArrayList.add(new Bahan("Bahan B","sadsd"));
        bahanArrayList.add(new Bahan("Bahan C","sadsd"));
        bahanArrayList.add(new Bahan("Bahan D","sadsd"));
    }
}
