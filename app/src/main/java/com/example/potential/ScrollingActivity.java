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

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanListAdapter planListAdapter;
    private ArrayList<Plan> planArrayList = new ArrayList<>();


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
        
        createFakePlanList();
        createRecyclerView();

    }

    private void createFakePlanList() {
        for (int i=0; i < 20; i++) {
            Goal goal = new Goal("I want to be able to give money");
            Plan plan = new Plan("Toilet Paper" + i, goal, "startDateOfPlan");

            planArrayList.add(plan);

        }
    }

    /**
     * Creates the recycler view for the word items.
     */
    private void createRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        planListAdapter = new PlanListAdapter(planArrayList);
        recyclerView.setAdapter(planListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
