package com.dyakta.resepediadyakta;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProdukAdapter extends RecyclerView.Adapter<ProdukViewHolder> {
    private Context mContext;
    private ArrayList<Produk> mData;
    Produk produk;

    public ProdukAdapter(Context mContext, ArrayList<Produk> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public ProdukViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_produk, parent, false);
        return new ProdukViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukViewHolder holder, int position) {
        holder.nama_produk.setText(mData.get(position).getNama_produk());

        holder.setItemTouchListener(new ItemTouchListener() {
            @Override
            public void onItemTouch(int pos) {
                produk=mData.get(pos);
            }
        });
    }


    @Override
    public int getItemCount() {
        return (mData != null) ? mData.size() : 0;
    }

    public void openDetailActivity()
    {
        Intent i=new Intent(mContext, DetailActivity.class);

        //PACK DATA
        i.putExtra("NAME_KEY",produk.getNama_produk());

        //OPEN ACTIVITY
        mContext.startActivity(i);
    }



}
