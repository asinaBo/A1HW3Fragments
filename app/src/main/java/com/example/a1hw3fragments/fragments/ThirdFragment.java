package com.example.a1hw3fragments.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a1hw3fragments.R;
import com.example.a1hw3fragments.adapters.SecondAdapter;

import java.util.ArrayList;
import java.util.List;


public class ThirdFragment extends Fragment {

    private Button btn_third;
    private SecondAdapter adapter;
    private RecyclerView rcViewThird;
    private List<String> namess;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third,container,false);
        rcViewThird = view.findViewById(R.id.rcViewThird);
        btn_third = view.findViewById(R.id.btn_third);
        namess= new ArrayList<>();
        for (int i =0; i<10;i++){
            namess.add(Integer.toString(i).concat("bbb"));
        }

        adapter = new SecondAdapter(namess);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        rcViewThird.setLayoutManager(linearLayoutManager1);
        rcViewThird.setAdapter(adapter);
        return view;
    }
}