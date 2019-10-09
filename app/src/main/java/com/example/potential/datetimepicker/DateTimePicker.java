package com.example.potential.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;

import com.example.potential.R;

public class DateTimePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_date_time_picker);

        setAdapter();

    }

    /**
     * Connects the viewpager to the adapter for the date time picker.
     */
    private void setAdapter() {
        Adapter adapter = new Adapter(getSupportFragmentManager(), this);
        ViewPager myViewPager = findViewById(R.id.date_time_picker_view_pager);

        // Turn swiping off.
        myViewPager.setPagingEnabled(false);

        adapter.addFragment("DATE", new DatePickerFragment());
        adapter.addFragment("TIME", new TimePickerFragment());

        myViewPager.setAdapter(adapter);
    }

    /**
     * This method is called when the user presses the cancel button from the date/time picker.
     * @param view
     */
    public void cancelButton(View view) {
        Log.d("poop", "cancelButton: pressed!");
    }

    /**
     * This method is called whe the user presses the save button from the date/time picker.
     * Saves the current date and time set by the user.
     * @param view
     */
    public void saveButton(View view) {
        Log.d("poop", "=====================");
        Log.d("poop", "Hour: " + DateTimeListener.getDateTimeListener().getHour());
        Log.d("poop", "Minute: " + DateTimeListener.getDateTimeListener().getMinute());
        Log.d("poop", "=====================");
        Log.d("poop", "Year: " + DateTimeListener.getDateTimeListener().getYear());
        Log.d("poop", "Month: " + DateTimeListener.getDateTimeListener().getMonth());
        Log.d("poop", "Day Of Month: " + DateTimeListener.getDateTimeListener().getDayOfMonth());
        Log.d("poop", "=====================");




    }
}
