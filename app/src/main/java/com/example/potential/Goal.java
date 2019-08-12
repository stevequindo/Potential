package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Goal {

    private ArrayList<Objective> objectiveArrayList = new ArrayList<>();
    private String purpose;                     // Why do they want to achieve their goal.
    private Date deadline;

    public Goal(Objective objective, String purpose) {
        objectiveArrayList.add(objective);
        this.purpose = purpose;
    }

    public ArrayList<Objective> getObjectiveArrayList() {
        return objectiveArrayList;
    }

    public void setObjectiveArrayList(ArrayList<Objective> objectiveArrayList) {
        this.objectiveArrayList = objectiveArrayList;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
