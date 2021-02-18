package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class InitialAssessment5 extends Fragment {


    public static InitialAssessment5 newInstance(String param1, String param2) {
        InitialAssessment5 fragment = new InitialAssessment5();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_initial_assessment5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment5.this).navigate(R.id.action_InitialAssessment5_to_InitialAssessment6);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment5.this).navigate(R.id.action_InitialAssessment5_to_InitialAssessment4);
            }
        });

        SwitchCompat clothingSwitch = view.findViewById(R.id.ClothingSwitch);
        EditText clothingField = view.findViewById(R.id.ClothingField);

        SwitchCompat foodSwitch = view.findViewById(R.id.FoodSwitch);
        EditText foodField = view.findViewById(R.id.FoodField);

        SwitchCompat workSwitch = view.findViewById(R.id.EmployedSwitch);
        TextView workHoursLabel = view.findViewById(R.id.WeeklyHoursLabel);
        EditText workHoursField = view.findViewById(R.id.WeeklyHoursField);
        EditText workEarningsField = view.findViewById(R.id.WeeklyEarningField);
        TextView workEarningsLabel = view.findViewById(R.id.WeeklyEarningsLabel);

        SwitchCompat educationSwitch = view.findViewById(R.id.EducationSwitch);
        TextView educationLabel = view.findViewById(R.id.CourseLabel);
        EditText educationField = view.findViewById(R.id.CourseField);
        TextView educationHoursLabel = view.findViewById(R.id.CourseHoursLabel);
        EditText educationHoursField = view.findViewById(R.id.CourseHoursField);

        workSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilities.doVisibility(workSwitch.isChecked(), workEarningsField);
                Utilities.doVisibility(workSwitch.isChecked(), workHoursField);
                Utilities.doVisibility(workSwitch.isChecked(), workHoursLabel);
                Utilities.doVisibility(workSwitch.isChecked(), workEarningsLabel);
            }
        });

        educationSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilities.doVisibility(educationSwitch.isChecked(), educationField);
                Utilities.doVisibility(educationSwitch.isChecked(), educationHoursField);
                Utilities.doVisibility(educationSwitch.isChecked(), educationLabel);
                Utilities.doVisibility(educationSwitch.isChecked(), educationHoursLabel);
            }
        });

        clothingSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilities.doVisibility(clothingSwitch.isChecked(), clothingField);
            }
        });

        foodSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilities.doVisibility(foodSwitch.isChecked(), foodField);
            }
        });

        CheckBox weekCB = view.findViewById(R.id.WeeklyPaymentCheckbox);
        CheckBox fortnightCB = view.findViewById(R.id.FortnightlyPaymentCheckbox);

        weekCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fortnightCB.isChecked())
                    fortnightCB.setChecked(false);
            }
        });

        fortnightCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (weekCB.isChecked())
                    weekCB.setChecked(false);
            }
        });
    }
}