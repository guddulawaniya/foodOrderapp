package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foodorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayList<module> list = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));
        list.add(new module("Masala", "this is good masala", R.drawable.image));

        Madapter adapter = new Madapter(list, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }


}
