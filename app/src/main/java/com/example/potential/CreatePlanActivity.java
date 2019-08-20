package com.example.potential;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CreatePlanActivity extends AppCompatActivity {


    public static final String EXTRA_REPLY = "com.example.potential.REPLY";

    private TextInputEditText planNameEditText;
    private TextInputEditText goalEditText;
    private TextInputEditText purposeEditText;
    private Button createButton;

    private Plan plan = new Plan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_plan);

        planNameEditText = findViewById(R.id.planEditText);
        goalEditText = findViewById(R.id.goalEditText);
        purposeEditText = findViewById(R.id.purposeEditText);
        createButton = findViewById(R.id.createButton);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPlan();
            }
        });

    }

    /**
     * Creates a plan with the given inputs by the users.
     */
    private void createPlan() {
        String planName = planNameEditText.getText().toString();
        String goalDescription = goalEditText.getText().toString();
        String purpose = purposeEditText.getText().toString();

        plan.setPlanName(planName);
        plan.setGoalDescription(goalDescription);
        plan.setPurpose(purpose);
        plan.setDeadline("fake deadline");

        returnBackToScrollingActivity(plan);

    }

    private void returnBackToScrollingActivity(Plan plan) {
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, plan);
        setResult(RESULT_OK, replyIntent);
        finish();
    }


}
