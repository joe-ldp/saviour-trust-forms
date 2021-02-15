package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ServiceUserForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServiceUserForm extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServiceUserForm() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ServiceUserForm.
     */
    // TODO: Rename and change types and number of parameters
    public static ServiceUserForm newInstance(String param1, String param2) {
        ServiceUserForm fragment = new ServiceUserForm();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
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
        return inflater.inflate(R.layout.fragment_service_user_form, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btnNextPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ServiceUserForm.this).navigate(R.id.action_ServiceUserForm_to_ServiceUserForm2);
            }
        });

        CheckBox maleCB = view.findViewById(R.id.GenderMaleCheckbox);
        CheckBox femaleCB = view.findViewById(R.id.GenderFemaleCheckbox);
        CheckBox transCB = view.findViewById(R.id.GenderTransCheckbox);

        maleCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (femaleCB.isChecked() || transCB.isChecked())
                {
                    femaleCB.setChecked(false);
                    transCB.setChecked(false);
                }
            }
        });

        femaleCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (maleCB.isChecked() || transCB.isChecked())
                {
                    maleCB.setChecked(false);
                    transCB.setChecked(false);
                }
            }
        });

        transCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if (femaleCB.isChecked() || maleCB.isChecked())
                {
                    femaleCB.setChecked(false);
                    maleCB.setChecked(false);
                }
            }
        });

        CheckBox NINCheckbox = view.findViewById(R.id.ProofOfNINCheckbox);
        EditText NINField = view.findViewById(R.id.NINField);
        CheckBox IDCheckbox = view.findViewById(R.id.IDProducedCheckbox);
        EditText IDField = view.findViewById(R.id.IDDetailsField);


        NINCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(NINCheckbox.isChecked(), NINField);
            }
        });

        IDCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(IDCheckbox.isChecked(), IDField);
            }
        });


        /*
        Switch agencySwitch = view.findViewById(R.id.WorkingWithAgencySwitch);
        EditText WWADetails = view.findViewById(R.id.WWADetailsField);
        EditText WWAContactName = view.findViewById(R.id.ContactNameField);
        EditText WWAContactNumber = view.findViewById(R.id.ContactNumberField);

        Switch criminalRecordSwitch = view.findViewById(R.id.CriminalRecordSwitch);
        EditText CRField = view.findViewById(R.id.CRDetailsField);

        Switch sexOffenderSwitch = view.findViewById(R.id.SexOffenderSwitch);
        EditText sexOffenderField = view.findViewById(R.id.SOField);

        Switch arsonSwitch = view.findViewById(R.id.ArsonSwitch);
        EditText arsonField = view.findViewById(R.id.ArsonDetailsField);

        Switch legalMattersSwitch = view.findViewById(R.id.LegalMattersSwitch);
        EditText legalMattersField = view.findViewById(R.id.LegalMattersField);

        Switch disabilitySwitch = view.findViewById(R.id.DisabilitySwitch);
        EditText disabilityField = view.findViewById(R.id.DisabilityField);

        Switch GPSwitch = view.findViewById(R.id.GPSwitch);
        EditText GPField = view.findViewById(R.id.GPDetailsField);

        nextPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(ServiceUserForm.this)
                        .navigate(R.id.action_Homepage_to_InitialAssessment);
            }
        });

        criminalRecordSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(criminalRecordSwitch.isChecked(), CRField);
            }
        });

        sexOffenderSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(sexOffenderSwitch.isChecked(), sexOffenderField);
            }
        });

        arsonSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(arsonSwitch.isChecked(), arsonField);
            }
        });

        legalMattersSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(legalMattersSwitch.isChecked(), legalMattersField);
            }
        });

        disabilitySwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(disabilitySwitch.isChecked(), disabilityField);
            }
        });

        legalMattersSwitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(legalMattersSwitch.isChecked(), legalMattersField);
            }
        });

        agencySwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doVisibility(agencySwitch.isChecked(), WWADetails);
                doVisibility(agencySwitch.isChecked(), WWAContactName);
                doVisibility(agencySwitch.isChecked(), WWAContactNumber);
            }
        });*/
    }
}