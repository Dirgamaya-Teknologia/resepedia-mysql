package com.dyakta.resepediadyakta;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BahanAdapter extends RecyclerView.Adapter<BahanViewHolder> {
    private Context mContext;
    private ArrayList<Bahan> mData;
    Bahan bahan;

    public BahanAdapter(Context mContext, ArrayList<Bahan> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public BahanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list_bahan, parent, false);
        return new BahanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BahanViewHolder holder, int position) {
        holder.nama_produk.setText(mData.get(position).getNama_bahan());

        holder.setItemTouchListener(new ItemTouchListener() {
            @Override
            public void onItemTouch(int pos) {
                bahan=mData.get(pos);
            }
        });
    }


    @Override
    public int getItemCount() {
        return (mData != null) ? mData.size() : 0;
    }

    public void openDetailActivity()
    {
        Intent i=new Intent(mContext, ListResepActivity.class);

        //PACK DATA
        i.putExtra("NAME_KEY",bahan.getNama_bahan());

        //OPEN ACTIVITY
        mContext.startActivity(i);
    }



}
