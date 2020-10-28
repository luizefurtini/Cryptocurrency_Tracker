package com.example.cryptocurrencytracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<CryptoModel> cryptoModels;

    public RecyclerAdapter(ArrayList<CryptoModel> cryptocurrencies) {
        this.cryptoModels = cryptocurrencies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final CryptoModel cryptoModel = cryptoModels.get(position);

        holder.coinName.setText(cryptoModel.getName());

        holder.currencyValue.setText(cryptoModel.getPrice_usd());


        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifyItemRangeChanged(position, cryptoModels.size());
               cryptoModels.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() { return cryptoModels.size(); }
    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.coinName)
        TextView coinName;

        @BindView(R.id.currencyValue)
        TextView currencyValue;

        @BindView(R.id.deleteButton)
        Button deleteButton;


        public ViewHolder (View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
