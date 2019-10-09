package com.example.potential.datetimepicker;


import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.example.potential.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends Fragment {

    private static String TAG = "poop";

    public DatePickerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_date_picker, container, false);
        DatePicker datePicker = view.findViewById(R.id.date_picker);

        // They can only choose dates starting from tomorrow.
        datePicker.setMinDate(System.currentTimeMillis() + 86400000 - 1000);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            datePicker.setOnDateChangedListener(DateTimeListener.getDateTimeListener());
        }
        return view;
    }

}
