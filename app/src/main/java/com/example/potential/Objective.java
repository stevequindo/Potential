package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Objective {

    private String objectiveDescription;
    private ArrayList<Task> taskArrayList;
    private Date deadline;

    public Objective(String objectiveDescription, Task task, Date deadline) {
        this.objectiveDescription = objectiveDescription;
        taskArrayList.add(task);
        this.deadline = deadline;
    }



}
