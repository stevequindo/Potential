package com.example.potential;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.potential.recyclerview.PlanListAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanListAdapter planListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createRecyclerView();

    }

    /**
     * Creates the recycler view for the word items.
     */
    private void createRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        planListAdapter = new PlanListAdapter();
        recyclerView.setAdapter(planListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
