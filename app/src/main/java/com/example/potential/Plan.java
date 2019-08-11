package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Plan {

    private String planName;            // Name of plan.
    private Goal goal;                  // Goal for this plan.
    private Date startDate;             // Date and time when plan was created = start of plan execution.

    public Plan(String planName, Goal goal, Date startDate) {
        this.planName = planName;
        this.goal = goal;
        this.startDate = startDate;
    }



}
