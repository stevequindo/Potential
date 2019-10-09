package com.example.potential.datetimepicker;

import android.util.Log;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class DateTimeListener implements DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {


    private static final String TAG = "poop";
    private static DateTimeListener INSTANCE;
    private int year;
    private int month;
    private int dayOfMonth;
    private int hour;
    private int minute;

    private DateTimeListener() {
        // Private constructor so this class can't be instantiated without using
        // getDateTimeListener().
        // Singleton pattern.
    }

    public static DateTimeListener getDateTimeListener() {
        if (INSTANCE == null) {
            synchronized (DateTimeListener.class) {      //Why we do this
                if (INSTANCE == null) {
                    // Create DateTimeListener.
                    INSTANCE = new DateTimeListener();
                }
            }
        }
        return INSTANCE;
    }




    @Override
    public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * Hour and minute will return in 24 hour format. 5pm will return hour = 17.
     */
    @Override
    public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
