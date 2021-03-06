package com.dyakta.resepediadyakta;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class BahanViewHolder extends RecyclerView.ViewHolder implements View.OnTouchListener{

    public TextView nama_produk;
    ItemTouchListener itemTouchListener;

    public BahanViewHolder(@NonNull View itemView) {
        super(itemView);
        nama_produk =  itemView.findViewById(R.id.txt_nama_bahan);

        itemView.setOnTouchListener(this);
    }
    public void setItemTouchListener(ItemTouchListener itemTouchListener)
    {
        this.itemTouchListener=itemTouchListener;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.itemTouchListener.onItemTouch(this.getLayoutPosition());
        return false;
    }
}
