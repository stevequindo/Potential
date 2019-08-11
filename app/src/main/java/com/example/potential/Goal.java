package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Goal {

    private ArrayList<Objective> objectiveArrayList;
    private String purpose;                     // Why do they want to achieve their goal.
    private Date deadline;

    public Goal(Objective objective, String purpose) {
        objectiveArrayList.add(objective);
        this.purpose = purpose;
    }




}
