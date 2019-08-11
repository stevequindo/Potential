package com.example.potential.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.potential.R;

import java.util.LinkedList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanListAdapter extends RecyclerView.Adapter<PlanListAdapter.PlanViewHolder> {


    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.planlist_item, parent, false);
        return new PlanViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        holder.bindTo();

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PlanViewHolder extends RecyclerView.ViewHolder {

        private TextView planTitle;
        private TextView goalPotential;

        private PlanListAdapter planListAdapter;

        public PlanViewHolder(@NonNull View itemView, PlanListAdapter adapter) {
            super(itemView);
            planTitle = itemView.findViewById(R.id.plan_title);
            goalPotential = itemView.findViewById(R.id.goal_purpose);
            planListAdapter = adapter;

        }

        public void bindTo() {
        }
    }
}
