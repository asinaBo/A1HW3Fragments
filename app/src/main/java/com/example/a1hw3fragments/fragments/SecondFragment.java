package com.example.a1hw3fragments.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a1hw3fragments.R;
import com.example.a1hw3fragments.adapters.FirstAdapter;
import com.example.a1hw3fragments.adapters.SecondAdapter;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {
    private Button btn_second;
    private SecondAdapter adapter1;
    private RecyclerView rcViewSecond;
    private List<String> namess;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        rcViewSecond = view.findViewById(R.id.rcVSecond);
        btn_second = view.findViewById(R.id.btn_second);
        namess= new ArrayList<>();
        for (int i =0; i<10;i++){
            namess.add(Integer.toString(i).concat("lll"));
        }
        adapter1 = new SecondAdapter(namess);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        rcViewSecond.setLayoutManager(linearLayoutManager1);
        rcViewSecond.setAdapter(adapter1);

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.placeHolder, thirdFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}