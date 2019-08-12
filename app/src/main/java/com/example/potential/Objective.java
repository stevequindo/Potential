package com.example.potential;

import java.util.ArrayList;
import java.util.Date;

public class Objective {

    private String objectiveDescription;
    private ArrayList<Task> taskArrayList = new ArrayList<>();
    //private Date deadline;
    private String deadline;

    public Objective(String objectiveDescription, Task task, String deadline) {
        this.objectiveDescription = objectiveDescription;
        taskArrayList.add(task);
        this.deadline = deadline;
    }


    public String getObjectiveDescription() {
        return objectiveDescription;
    }

    public void setObjectiveDescription(String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
