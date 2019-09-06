package com.example.potential.createplan;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CreatePlanViewPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments;

    public CreatePlanViewPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);

        fragments = new Fragment[] {
                new CreatePlanNameFragment(),
                new CreateGoalFragment(),
                new CreatePurposeFragment(),
                new CreateDeadlineFragment(context)
        };
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return 4;
    }

}
