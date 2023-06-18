package com.example.a1hw3fragments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1hw3fragments.R;

import java.util.List;

public class ThirdAdapter  extends RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder> {

    List<String> namess;

    public ThirdAdapter(List<String> names) {
        this.namess = names;
    }

    @NonNull
    @Override
    public ThirdAdapter.ThirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ThirdAdapter.ThirdViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first, parent, false));

    }
        @Override
        public void onBindViewHolder(@NonNull ThirdViewHolder holder, int position) {
            holder.txtFirst.setText(namess.get(position));

        }

        @Override
        public int getItemCount() {
            return namess.size();
        }

        class ThirdViewHolder extends RecyclerView.ViewHolder{
            TextView txtFirst;
            public ThirdViewHolder(@NonNull View itemView) {
                super(itemView);
                txtFirst = itemView.findViewById(R.id.tvFirst);
            }
        }
    }


