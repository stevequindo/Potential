package com.example.potential;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

public class PlanPagerAdapter extends PagerAdapter {

    private List<Plan> plans;
    private Context context;
    private LayoutInflater layoutInflater;

    public PlanPagerAdapter(List<Plan> plans, Context context) {
        this.plans = plans;
        this.context = context;
    }

    @Override
    public int getCount() {
        return plans.size();
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

        ImageView imageView;
        TextView planName, purpose;

        imageView = view.findViewById(R.id.image);
        planName = view.findViewById(R.id.title);
        purpose = view.findViewById(R.id.purpose);

        imageView.setImageResource(R.drawable.lightbulb);
        planName.setText(plans.get(position).getPlanName());
        purpose.setText(plans.get(position).getPurpose());

        container.addView(view, 0);

        return view;
    }




}
