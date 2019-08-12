package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Plan {

    private String planName;            // Name of plan.
    private Goal goal;                  // Goal for this plan.
    //private Date startDate;             // Date and time when plan was created = start of plan execution.
    private String startDate;

    public Plan(String planName, Goal goal, String startDate) {
        this.planName = planName;
        this.goal = goal;
        this.startDate = startDate;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
