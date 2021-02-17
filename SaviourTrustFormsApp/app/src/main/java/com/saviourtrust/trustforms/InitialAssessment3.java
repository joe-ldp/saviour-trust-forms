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
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InitialAssessment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InitialAssessment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InitialAssessment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_service_user_form_3.
     */
    // TODO: Rename and change types and number of parameters
    public static InitialAssessment3 newInstance(String param1, String param2) {
        InitialAssessment3 fragment = new InitialAssessment3();
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
        return inflater.inflate(R.layout.fragment_initial_assessment3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment3.this).navigate(R.id.action_initialAssessment3_to_initialAssessment4);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment3.this).navigate(R.id.action_initialAssessment3_to_initialAssessment2);
            }
        });


        SwitchCompat substanceMisuseSwitch = view.findViewById(R.id.SubstanceMisuseSwitch);
        SwitchCompat illicitSubstanceSwitch = view.findViewById(R.id.IllicitSubstancesSwitch);
        EditText substanceField = view.findViewById(R.id.SubstanceDetailsField);

        SwitchCompat WWA = view.findViewById(R.id.WorkingWithAgencySwitch);
        EditText WWADetails = view.findViewById(R.id.WWADetailsField);
        EditText WWAName = view.findViewById(R.id.ContactNameField);
        EditText WWANumber = view.findViewById(R.id.ContactNumberField);

        SwitchCompat criminalRecordSwitch = view.findViewById(R.id.CriminalRecordSwitch);
        EditText CRField = view.findViewById(R.id.CRDetailsField);

        SwitchCompat probationSwitch = view.findViewById(R.id.ProbationSwitch);
        SwitchCompat mappaSwitch = view.findViewById(R.id.MappaSwitch);
        EditText detailsField = view.findViewById(R.id.ProbationDetailsField);
        EditText POField = view.findViewById(R.id.ProbationOfficerNameField);

        EditText areaField = view.findViewById(R.id.AreaField);
        LinearLayout riskCheckboxes = view.findViewById(R.id.RiskCheckboxLayout);

        TextView RALabel = view.findViewById(R.id.RALabel);
        EditText RABox = view.findViewById(R.id.RABox);

        TextView RALabel2 = view.findViewById(R.id.RALabel2);
        EditText RABox2 = view.findViewById(R.id.RABox2);

        TextView RALabel3 = view.findViewById(R.id.RALabel3);
        EditText RABox3 = view.findViewById(R.id.RABox3);


        probationSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (!mappaSwitch.isChecked()) {
                    Utilities.doVisibility(probationSwitch.isChecked(), detailsField);
                    Utilities.doVisibility(probationSwitch.isChecked(), POField);
                    Utilities.doVisibility(probationSwitch.isChecked(), areaField);
                    Utilities.doVisibility(probationSwitch.isChecked(), riskCheckboxes);
                    Utilities.doVisibility(criminalRecordSwitch.isChecked(), RABox3);
                    Utilities.doVisibility(criminalRecordSwitch.isChecked(), RALabel3);

                }
            }
        });

        mappaSwitch.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               if (!probationSwitch.isChecked()) {
                   Utilities.doVisibility(mappaSwitch.isChecked(), detailsField);
                   Utilities.doVisibility(mappaSwitch.isChecked(), POField);
                   Utilities.doVisibility(mappaSwitch.isChecked(), areaField);
                   Utilities.doVisibility(mappaSwitch.isChecked(), riskCheckboxes);
               }
           }
        });

        substanceMisuseSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(!illicitSubstanceSwitch.isChecked())
                    Utilities.doVisibility(substanceMisuseSwitch.isChecked(), substanceField);
            }
        });

        illicitSubstanceSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(!substanceMisuseSwitch.isChecked())
                    Utilities.doVisibility(illicitSubstanceSwitch.isChecked(), substanceField);
            }
        });

        WWA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(WWA.isChecked(), WWADetails);
                Utilities.doVisibility(WWA.isChecked(), WWAName);
                Utilities.doVisibility(WWA.isChecked(), WWANumber);
                Utilities.doVisibility(WWA.isChecked(), RALabel);
                Utilities.doVisibility(WWA.isChecked(), RABox);
            }
        });

        criminalRecordSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(criminalRecordSwitch.isChecked(), CRField);
                Utilities.doVisibility(criminalRecordSwitch.isChecked(), RALabel2);
                Utilities.doVisibility(criminalRecordSwitch.isChecked(), RABox2);
            }
        });

        CheckBox highRiskCB = view.findViewById(R.id.HighRiskCheckbox);
        CheckBox mediumRiskCB = view.findViewById(R.id.MediumRiskCheckbox);
        CheckBox lowRiskCB = view.findViewById(R.id.LowRiskCheckbox);

        highRiskCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (mediumRiskCB.isChecked() || lowRiskCB.isChecked())
                {
                    mediumRiskCB.setChecked(false);
                    lowRiskCB.setChecked(false);
                }
            }
        });

        mediumRiskCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (highRiskCB.isChecked() || lowRiskCB.isChecked())
                {
                    highRiskCB.setChecked(false);
                    lowRiskCB.setChecked(false);
                }
            }
        });

        lowRiskCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (mediumRiskCB.isChecked() || highRiskCB.isChecked())
                {
                    mediumRiskCB.setChecked(false);
                    highRiskCB.setChecked(false);
                }
            }
        });


    }
}