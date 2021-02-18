package com.saviourtrust.trustforms;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class InitialAssessment2 extends Fragment {


    public InitialAssessment2() {
        // Required empty public constructor
    }

    public static InitialAssessment2 newInstance(String param1, String param2) {
        InitialAssessment2 fragment = new InitialAssessment2();
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
        return inflater.inflate(R.layout.fragment_initial_assessment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment2.this).navigate(R.id.action_InitialAssessment2_to_InitialAssessment3);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment2.this).navigate(R.id.action_InitialAssessment2_to_InitialAssessment);
            }
        });

        CheckBox rentCheckbox = view.findViewById(R.id.CHSRentCheckbox);
        EditText rentField = view.findViewById(R.id.CHSRentField);
        CheckBox injunctionCheckbox = view.findViewById(R.id.CHSInjunctionCheckbox);
        EditText injunctionField = view.findViewById(R.id.CHSInjunctionField);
        CheckBox concernCheckbox = view.findViewById(R.id.CHSConcernCheckbox);
        EditText concernField = view.findViewById(R.id.CHSConcernField);

        FloatingActionButton newRowButton = view.findViewById(R.id.AddNewRowButton);
        TableLayout housingTable = view.findViewById(R.id.HousingTable);

        newRowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.fragment_housing_table, housingTable, false);
                housingTable.addView(view1);

            }
        });

        rentCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(rentCheckbox.isChecked(), rentField);
            }
        });

        injunctionCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(injunctionCheckbox.isChecked(), injunctionField);
            }
        });

        concernCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(concernCheckbox.isChecked(), concernField);
            }
        });
    }



}

