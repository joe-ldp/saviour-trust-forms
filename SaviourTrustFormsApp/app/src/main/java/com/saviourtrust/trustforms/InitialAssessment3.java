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

public class InitialAssessment3 extends Fragment {

    EditText familySituationField;
    SwitchCompat substanceMisuseSwitch;
    SwitchCompat illicitSubstanceSwitch;
    EditText substanceField;
    SwitchCompat WWA;
    EditText WWADetails;
    EditText WWAName;
    EditText WWANumber;
    SwitchCompat criminalRecordSwitch;
    EditText CRField;
    SwitchCompat probationSwitch;
    SwitchCompat mappaSwitch;
    EditText detailsField;
    EditText POField;
    EditText areaField;
    LinearLayout riskCheckboxes;
    TextView RALabel;
    EditText RABox;
    TextView RALabel2;
    EditText RABox2;
    EditText RABox3;
    CheckBox mediumRiskCB;
    CheckBox lowRiskCB;
    CheckBox highRiskCB;
    TextView RALabel3;

    public static InitialAssessment3 newInstance(String param1, String param2) {
        InitialAssessment3 fragment = new InitialAssessment3();
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
        return inflater.inflate(R.layout.fragment_initial_assessment3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage;
        nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment3.this).navigate(R.id.action_InitialAssessment3_to_InitialAssessment4);
            }
        });

        Button previousPage;
        previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment3.this).navigate(R.id.action_InitialAssessment3_to_InitialAssessment2);
            }
        });

        familySituationField = view.findViewById(R.id.FamilySituationField);
        substanceMisuseSwitch = view.findViewById(R.id.SubstanceMisuseSwitch);
        illicitSubstanceSwitch = view.findViewById(R.id.IllicitSubstancesSwitch);
        substanceField = view.findViewById(R.id.SubstanceDetailsField);

        WWA = view.findViewById(R.id.WorkingWithAgencySwitch);
        WWADetails = view.findViewById(R.id.WWADetailsField);
        WWAName = view.findViewById(R.id.ContactNameField);
        WWANumber = view.findViewById(R.id.ContactNumberField);

        criminalRecordSwitch = view.findViewById(R.id.CriminalRecordSwitch);
        CRField = view.findViewById(R.id.CRDetailsField);

        probationSwitch = view.findViewById(R.id.ProbationSwitch);
        mappaSwitch = view.findViewById(R.id.MappaSwitch);
        detailsField = view.findViewById(R.id.ProbationDetailsField);
        POField = view.findViewById(R.id.ProbationOfficerNameField);

        areaField = view.findViewById(R.id.AreaField);
        riskCheckboxes = view.findViewById(R.id.RiskCheckboxLayout);

        RALabel = view.findViewById(R.id.RALabel);
        RABox = view.findViewById(R.id.RABox);

        RALabel2 = view.findViewById(R.id.RALabel2);
        RABox2 = view.findViewById(R.id.RABox2);

        RALabel3 = view.findViewById(R.id.RALabel3);
        RABox3 = view.findViewById(R.id.RABox3);


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

        highRiskCB = view.findViewById(R.id.HighRiskCheckbox);
        mediumRiskCB = view.findViewById(R.id.MediumRiskCheckbox);
        lowRiskCB = view.findViewById(R.id.LowRiskCheckbox);

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