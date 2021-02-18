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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialAssessment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InitialAssessment4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InitialAssessment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_service_user_form_4.
     */
    // TODO: Rename and change types and number of parameters
    public static InitialAssessment4 newInstance(String param1, String param2) {
        InitialAssessment4 fragment = new InitialAssessment4();
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
        return inflater.inflate(R.layout.fragment_initial_assessment4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment4.this).navigate(R.id.action_InitialAssessment4_to_InitialAssessment5);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment4.this).navigate(R.id.action_InitialAssessment4_to_InitialAssessment3);
            }
        });

        SwitchCompat SOSwitch = view.findViewById(R.id.SexOffenderSwitch);
        EditText SOField = view.findViewById(R.id.SOField);

        SwitchCompat arsonSwitch = view.findViewById(R.id.ArsonSwitch);
        EditText arsonField = view.findViewById(R.id.ArsonDetailsField);

        SwitchCompat LMSwitch = view.findViewById(R.id.LegalMattersSwitch);
        EditText LMField = view.findViewById(R.id.LegalMattersField);

        SwitchCompat disabilitySwitch = view.findViewById(R.id.DisabilitySwitch);
        EditText disabilityField = view.findViewById(R.id.DisabilityField);

        SwitchCompat GPSwitch = view.findViewById(R.id.GPSwitch);
        EditText GPField = view.findViewById(R.id.GPDetailsField);

        SwitchCompat MHISwitch = view.findViewById(R.id.MentalHealthIssuesSwitch);
        EditText MHIField = view.findViewById(R.id.MHIDetailsField);

        SwitchCompat MCSwitch = view.findViewById(R.id.MedicalConditionSwitch);
        EditText MCField = view.findViewById(R.id.MedicalConditionDetailsField);

        SwitchCompat RWASwitch = view.findViewById(R.id.RegisteredWithAgencySwitch);
        EditText RWAField = view.findViewById(R.id.RWADetailsField);

        SwitchCompat DASwitch = view.findViewById(R.id.DomesticAbuseSwitch);
        EditText DAField = view.findViewById(R.id.DADetailsField);

        SwitchCompat supportSwitch = view.findViewById(R.id.SupportSwitch);
        EditText supportField = view.findViewById(R.id.SupportDetailsField);

        CheckBox PACB = view.findViewById(R.id.PermanentAccommodationCheckbox);
        CheckBox MHCB = view.findViewById(R.id.MentalHealthCheckbox);
        CheckBox employmentCB = view.findViewById(R.id.EmploymentCheckbox);
        CheckBox budgetCB = view.findViewById(R.id.BudgetCheckbox);
        CheckBox otherCB = view.findViewById(R.id.OtherCheckbox);

        TextView RALabel = view.findViewById(R.id.RALabel);
        EditText RABox = view.findViewById(R.id.RABox);

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