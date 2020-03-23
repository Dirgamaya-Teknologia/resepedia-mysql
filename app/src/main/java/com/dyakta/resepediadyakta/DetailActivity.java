package com.dyakta.resepediadyakta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameTxt = findViewById(R.id.textView2);


        //RECEIVE DATA
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");


        //bind data
        nameTxt.setText(name);

    }
}
