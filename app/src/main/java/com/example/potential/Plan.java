package com.example.potential;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Plan implements Parcelable {

    private String planName;            // Name of plan.
    private Goal goal = new Goal();                  // Goal for this plan.
    //private Date startDate;             // Date and time when plan was created = start of plan execution.
    private String startDate;

    public Plan() {

    }

    protected Plan(Parcel in) {
        planName = in.readString();
        goal = in.readParcelable(Goal.class.getClassLoader());
        startDate = in.readString();
    }


    public static final Creator<Plan> CREATOR = new Creator<Plan>() {
        @Override
        public Plan createFromParcel(Parcel in) {
            return new Plan(in);
        }

        @Override
        public Plan[] newArray(int size) {
            return new Plan[size];
        }
    };

    public String getPlanName() {
        return planName;
    }

    public String getPurpose() {
        return goal.getPurpose();
    }


    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setGoalDescription(String goalDescription) {
        goal.setGoalDescription(goalDescription);
    }

    public void setPurpose(String purpose) {
        goal.setPurpose(purpose);
    }

    public void setDeadline(String deadline) {
        goal.setDeadline(deadline);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(planName);
        parcel.writeParcelable(goal, i);
        parcel.writeString(startDate);
    }
}
