package com.example.potential;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PlanPagerAdapter adapter;
    List<Plan> plans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Plan plan = new Plan();
        plan.setPlanName("Passive Income");
        plan.setPurpose("To make my mama proud.");

        plans = new ArrayList<>();
        plans.add(plan);

        adapter = new PlanPagerAdapter(plans, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        // Padding lets the other pages overlap
        viewPager.setPadding(130, 0, 130, 0);



    }
}
