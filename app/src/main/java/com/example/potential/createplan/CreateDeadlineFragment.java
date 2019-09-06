package com.example.potential.createplan;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.potential.R;
import com.example.potential.datetimepicker.DateTimePicker;
import com.google.android.material.button.MaterialButton;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateDeadlineFragment extends Fragment {

    private Context context;
    private MaterialButton deadlineButton;

    public CreateDeadlineFragment() {
        // Required empty public constructor
    }

    public CreateDeadlineFragment(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_create_deadline, container, false);
        deadlineButton = rootView.findViewById(R.id.deadline);

        deadlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDeadline(view);

            }
        });


        return rootView;


    }

    /**
     * Called when the deadline button is clicked.
     * @param view
     */
    private void setDeadline(View view) {
        startActivity(new Intent(context, DateTimePicker.class));

    }


}
