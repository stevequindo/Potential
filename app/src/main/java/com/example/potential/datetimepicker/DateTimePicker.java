package com.example.potential.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

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
}
