package com.example.potential;

import android.os.Parcel;
import android.os.Parcelable;

public class Goal implements Parcelable {

    private String goalDescription;
    private String purpose;                     // Why do they want to achieve their goal.
    private String deadline;

    public Goal() {

    }

    protected Goal(Parcel in) {
        goalDescription = in.readString();
        purpose = in.readString();
        deadline = in.readString();
    }

    public static final Creator<Goal> CREATOR = new Creator<Goal>() {
        @Override
        public Goal createFromParcel(Parcel in) {
            return new Goal(in);
        }

        @Override
        public Goal[] newArray(int size) {
            return new Goal[size];
        }
    };

    public String getPurpose() {
        return purpose;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(goalDescription);
        parcel.writeString(purpose);
        parcel.writeString(deadline);
    }
}
