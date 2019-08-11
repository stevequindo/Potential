package com.example.potential;

import android.os.Bundle;

import com.example.potential.recyclerview.PlanListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanListAdapter planListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

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
