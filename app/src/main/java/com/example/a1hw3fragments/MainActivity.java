package com.example.a1hw3fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a1hw3fragments.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.placeHolder, new FirstFragment()).commit();

    }
}