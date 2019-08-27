package com.example.potential.createplan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.potential.R;
import com.google.android.material.textfield.TextInputEditText;

public class CreatePlanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_plan);

        ViewPager viewPager = findViewById(R.id.createPlanViewPager);
        viewPager.setAdapter(new CreatePlanViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);

    }



}
