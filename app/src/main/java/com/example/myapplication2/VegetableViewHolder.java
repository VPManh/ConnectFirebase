package com.example.myapplication2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VegetableViewHolder extends RecyclerView.ViewHolder {

    TextView txName,txMota;
    ImageView imgHinh;

    public VegetableViewHolder(@NonNull View itemView) {
        super(itemView);

        txName = itemView.findViewById(R.id.tx_name);
        txMota = itemView.findViewById(R.id.tx_title);
        imgHinh = itemView.findViewById(R.id.imgHinh);

    }
}
