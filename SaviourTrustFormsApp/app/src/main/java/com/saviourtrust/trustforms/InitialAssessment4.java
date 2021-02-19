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


public class InitialAssessment4 extends Fragment {
    SwitchCompat SOSwitch;
    EditText SOField;
    SwitchCompat arsonSwitch;
    EditText arsonField;
    SwitchCompat LMSwitch;
    EditText LMField;
    SwitchCompat disabilitySwitch;
    EditText disabilityField;
    SwitchCompat GPSwitch;
    EditText GPField;
    SwitchCompat MHISwitch;
    EditText MHIField;
    SwitchCompat MCSwitch;
    EditText MCField;
    SwitchCompat RWASwitch;
    EditText RWAField;
    SwitchCompat DASwitch;
    EditText DAField;
    SwitchCompat supportSwitch;
    EditText supportField;
    CheckBox PACB;
    CheckBox MHCB;
    CheckBox employmentCB;
    CheckBox budgetCB;
    EditText RABox;
    CheckBox otherCB;
    TextView RALabel;

    public InitialAssessment4() {
        // Required empty public constructor
    }

    public static InitialAssessment4 newInstance(String param1, String param2) {
        InitialAssessment4 fragment = new InitialAssessment4();
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
        return inflater.inflate(R.layout.fragment_initial_assessment4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage;
        nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment4.this).navigate(R.id.action_InitialAssessment4_to_InitialAssessment5);
            }
        });

        Button previousPage;
        previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment4.this).navigate(R.id.action_InitialAssessment4_to_InitialAssessment3);
            }
        });

        SOSwitch = view.findViewById(R.id.SexOffenderSwitch);
        SOField = view.findViewById(R.id.SOField);

        arsonSwitch = view.findViewById(R.id.ArsonSwitch);
        arsonField = view.findViewById(R.id.ArsonDetailsField);

        LMSwitch = view.findViewById(R.id.LegalMattersSwitch);
        LMField = view.findViewById(R.id.LegalMattersField);

        disabilitySwitch = view.findViewById(R.id.DisabilitySwitch);
        disabilityField = view.findViewById(R.id.DisabilityField);

        GPSwitch = view.findViewById(R.id.GPSwitch);
        GPField = view.findViewById(R.id.GPDetailsField);

        MHISwitch = view.findViewById(R.id.MentalHealthIssuesSwitch);
        MHIField = view.findViewById(R.id.MHIDetailsField);

        MCSwitch = view.findViewById(R.id.MedicalConditionSwitch);
        MCField = view.findViewById(R.id.MedicalConditionDetailsField);

        RWASwitch = view.findViewById(R.id.RegisteredWithAgencySwitch);
        RWAField = view.findViewById(R.id.RWADetailsField);

        DASwitch = view.findViewById(R.id.DomesticAbuseSwitch);
        DAField = view.findViewById(R.id.DADetailsField);

        supportSwitch = view.findViewById(R.id.SupportSwitch);
        supportField = view.findViewById(R.id.SupportDetailsField);

        PACB = view.findViewById(R.id.PermanentAccommodationCheckbox);
        MHCB = view.findViewById(R.id.MentalHealthCheckbox);
        employmentCB = view.findViewById(R.id.EmploymentCheckbox);
        budgetCB = view.findViewById(R.id.BudgetCheckbox);
        otherCB = view.findViewById(R.id.OtherCheckbox);

        RALabel = view.findViewById(R.id.RALabel);
        RABox = view.findViewById(R.id.RABox);

        MHISwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(MHISwitch.isChecked(), MHIField);
                Utilities.doVisibility(MHISwitch.isChecked(), RALabel);
                Utilities.doVisibility(MHISwitch.isChecked(), RABox);
            }
        });

        SOSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(SOSwitch.isChecked(), SOField);
            }
        });

        arsonSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(arsonSwitch.isChecked(), arsonField);
            }
        });

        LMSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(LMSwitch.isChecked(), LMField);
            }
        });

        disabilitySwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(disabilitySwitch.isChecked(), disabilityField);
            }
        });

        GPSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(GPSwitch.isChecked(), GPField);
            }
        });

        MCSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(MCSwitch.isChecked(), MCField);
            }
        });

        RWASwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(RWASwitch.isChecked(), RWAField);
            }
        });

        DASwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(DASwitch.isChecked(), DAField);
            }
        });

        supportSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(supportSwitch.isChecked(), supportField);
                Utilities.doVisibility(supportSwitch.isChecked(), PACB);
                Utilities.doVisibility(supportSwitch.isChecked(), MHCB);
                Utilities.doVisibility(supportSwitch.isChecked(), employmentCB);
                Utilities.doVisibility(supportSwitch.isChecked(), budgetCB);
                Utilities.doVisibility(supportSwitch.isChecked(), otherCB);
            }
        });
    }
}