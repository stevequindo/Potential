package com.example.potential;

import android.content.Intent;
import android.os.Bundle;

import com.example.potential.recyclerview.PlanListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    public static final int NEW_PLAN_ACTIVITY_REQUEST_CODE = 1;

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
                gotoCreateNewPlanActivity();

            }
        });

        createRecyclerView();
        listenForItemClicks();

    }

    /**
     * Goes to the new activity where the user will create a new plan.
     */
    private void gotoCreateNewPlanActivity() {
        Intent intent = new Intent(this, CreatePlanActivity.class);
        startActivityForResult(intent, NEW_PLAN_ACTIVITY_REQUEST_CODE);
    }


    /**
     * Creates the recycler view for the plan items.
     */
    private void createRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        planListAdapter = new PlanListAdapter(planArrayList);
        recyclerView.setAdapter(planListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private void listenForItemClicks() {
        planListAdapter.setOnItemClickListener(new PlanListAdapter.ClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                // TODO: logic for modify plan
                Toast.makeText(ScrollingActivity.this, "hi", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==  NEW_PLAN_ACTIVITY_REQUEST_CODE & resultCode == RESULT_OK) {
            Plan plan = data.getParcelableExtra(CreatePlanActivity.EXTRA_REPLY);
            planArrayList.add(plan);
            planListAdapter.notifyItemInserted(planArrayList.size() - 1);
        }
    }


}
