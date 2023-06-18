package com.example.a1hw3fragments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw3fragments.R;

import java.util.List;

public class SecondAdapter  extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {

    List<String> namess;

    public SecondAdapter(List<String> names) {
        this.namess = names;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        holder.txtFirst.setText(namess.get(position));

    }

    @Override
    public int getItemCount() {
        return namess.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder{
        TextView txtFirst;
        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFirst = itemView.findViewById(R.id.tvFirst);
        }
    }
}

