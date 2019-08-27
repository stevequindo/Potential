package com.example.potential.createplan;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.afollestad.date.DatePicker;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialogKt;
import com.afollestad.materialdialogs.datetime.DateTimePickerExtKt;
import com.afollestad.materialdialogs.datetime.utils.DateTimeExtKt;
import com.example.potential.R;
import com.google.android.material.button.MaterialButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateDeadlineFragment extends Fragment {

    MaterialButton deadlineButton;

    public CreateDeadlineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_create_deadline, container, false);
        deadlineButton = rootView.findViewById(R.id.deadline);

        deadlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        
        
        return rootView;
        

    }


}
