package com.example.potential.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.potential.Plan;
import com.example.potential.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanListAdapter extends RecyclerView.Adapter<PlanListAdapter.PlanViewHolder> {

    private ArrayList<Plan> planArrayList;
    private static ClickListener clickListener;

    public PlanListAdapter(ArrayList<Plan> planArrayList) {
        this.planArrayList = planArrayList;
    }

    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.planlist_item, parent, false);
        return new PlanViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        holder.bindTo(planArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        if (planArrayList != null) return planArrayList.size();
        else return 0;
    }

    public class PlanViewHolder extends RecyclerView.ViewHolder {

        private TextView planTitle;
        private TextView goalPurpose;


        public PlanViewHolder(@NonNull View itemView) {
            super(itemView);
            planTitle = itemView.findViewById(R.id.plan_title);
            goalPurpose = itemView.findViewById(R.id.goal_purpose);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.onItemClick(view, getAdapterPosition());
                }
            });

        }

        public void bindTo(Plan plan) {
            planTitle.setText(plan.getPlanName());
            goalPurpose.setText(plan.getPurpose());
        }

    }

    /**
     * Listener interface to listen to when an item in the recycle view has been clicked.
     */
    public interface ClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        PlanListAdapter.clickListener = clickListener;
    }


}
