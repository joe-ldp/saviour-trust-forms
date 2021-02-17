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
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialAssessment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InitialAssessment5 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InitialAssessment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_service_user_form_5.
     */
    // TODO: Rename and change types and number of parameters
    public static InitialAssessment5 newInstance(String param1, String param2) {
        InitialAssessment5 fragment = new InitialAssessment5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
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
                NavHostFragment.findNavController(InitialAssessment5.this).navigate(R.id.action_initialAssessment5_to_initialAssessment6);
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



    }
}