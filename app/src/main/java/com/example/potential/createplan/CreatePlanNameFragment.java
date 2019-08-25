package com.example.potential.createplan;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.potential.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatePlanNameFragment extends Fragment {


    public CreatePlanNameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_plan_name, container, false);
    }

}
