package com.example.potential;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class PlanPagerAdapter extends PagerAdapter {

    public static final boolean INSTANTIATED = false;

    private ArrayList<Plan> plans;
    private Context context;
    private LayoutInflater layoutInflater;

    public PlanPagerAdapter(ArrayList<Plan> plans, Context context) {
        this.plans = plans;
        this.context = context;
    }

    @Override
    public int getCount() {
        if (!plans.isEmpty()) {
            return plans.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.plan_item, container, false);
//
//        ImageView imageView;
//        TextView planName, purpose;
//
//        imageView = view.findViewById(R.id.image);
//        imageView.setImageResource(R.drawable.lightbulb);


        // THE HECK IS THIS LINE DO
        container.addView(view, 0);


        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
