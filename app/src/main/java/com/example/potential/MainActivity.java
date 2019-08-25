package com.example.potential;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.potential.createplan.CreatePlanActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PlanPagerAdapter adapter;
    ArrayList<Plan> plans = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setViewPager();
        setFloatingActionButton();


    }

    /**
     * Connects the adapter to the data
     */
    private void setViewPager() {
        // TODO: you should make a model? eh idk
        adapter = new PlanPagerAdapter(plans, this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        // Padding lets the other pages overlap
        viewPager.setPadding(100, 0, 100, 0);
    }

    private void setFloatingActionButton() {
        FloatingActionButton floatingActionButton = findViewById(R.id.floating_action_button);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CreatePlanActivity.class));
            }
        });
    }
}
