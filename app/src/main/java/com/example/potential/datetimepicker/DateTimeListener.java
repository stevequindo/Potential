package com.example.potential.datetimepicker;

import android.util.Log;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class DateTimeListener implements DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {


    private static final String TAG = "poop";
    private int year;
    private int month;
    private int dayOfMonth;
    private int hour;
    private int minute;

    // make this a singleton

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


}
