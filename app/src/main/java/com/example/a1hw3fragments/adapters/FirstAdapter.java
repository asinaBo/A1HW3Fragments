package com.example.a1hw3fragments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw3fragments.R;

import java.util.List;

public class FirstAdapter  extends RecyclerView.Adapter<FirstAdapter.FirstViewHolder> {

    List<String> names;

    public FirstAdapter(List<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FirstViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {
        holder.txtFirst.setText(names.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class FirstViewHolder extends RecyclerView.ViewHolder{
        TextView txtFirst;
        public FirstViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFirst = itemView.findViewById(R.id.tvFirst);
        }
    }
}




