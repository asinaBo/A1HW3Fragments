package com.example.a1hw3fragments.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a1hw3fragments.R;
import com.example.a1hw3fragments.adapters.FirstAdapter;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    private Button btn_next;
    private FirstAdapter adapter;
    private RecyclerView rcViewFirst;
    private List<String> names;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first,container,false);
        rcViewFirst = view.findViewById(R.id.rcVFirst);
        btn_next = view.findViewById(R.id.btNext);
        names= new ArrayList<>();

        adapter = new FirstAdapter(names);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcViewFirst.setLayoutManager(linearLayoutManager);
        rcViewFirst.setAdapter(adapter);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.placeHolder, secondFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;

    }
}




