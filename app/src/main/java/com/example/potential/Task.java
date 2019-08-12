package com.example.potential;

/**
 * Tasks are things you need to be doing at a certain day and time at or not at regular intervals.
 *
 * Tasks are something you have to do, whist objectives are something you need to achieve.
 *
 * Tasks are reminders. Tasks are just alarms.
 */
public class Task {

    private String reminderDescription;

    public Task(String reminderDescription) {
        this.reminderDescription = reminderDescription;
    }

    public String getReminderDescription() {
        return reminderDescription;
    }

    public void setReminderDescription(String reminderDescription) {
        this.reminderDescription = reminderDescription;
    }
}
