package com.example.potential.createplan;

import android.os.Bundle;

import com.example.potential.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class CreatePlanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_plan);

        ViewPager viewPager = findViewById(R.id.createPlanViewPager);
        viewPager.setAdapter(new CreatePlanViewPagerAdapter(getSupportFragmentManager(), this));
        viewPager.setOffscreenPageLimit(3);

    }



}
