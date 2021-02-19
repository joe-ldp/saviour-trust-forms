package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class InitialAssessment extends Fragment {

    Spinner countrySpinner;
    Button nextPage;
    Button previousPage;
    CheckBox maleCB;
    CheckBox transCB;
    CheckBox femaleCB;
    EditText IDField;
    CheckBox IDCheckbox;
    EditText NINField;
    CheckBox NINCheckbox;
    EditText nameField;
    EditText addressField;
    EditText postcodeField;
    EditText phoneNoField;
    EditText altContactNameField;
    EditText altContactPhoneNoField;
    EditText DOBField;
    EditText ageField;
    EditText NOKNameField;
    EditText NOKAddressField;
    EditText NOKPostcodeField;
    EditText NOKPhoneNoField;





    public InitialAssessment() {
        // Required empty public constructor
    }


    public static InitialAssessment newInstance(String param1, String param2) {
        InitialAssessment fragment = new InitialAssessment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_initial_assessment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        nameField = view.findViewById(R.id.NameField);
        addressField = view.findViewById(R.id.AddressField);
        postcodeField = view.findViewById(R.id.Postcode);
        phoneNoField = view.findViewById(R.id.PhoneNoField);
        altContactNameField = view.findViewById(R.id.AltContactName);
        altContactPhoneNoField = view.findViewById(R.id.AltContactPhoneNo);
        DOBField = view.findViewById(R.id.DOBField);
        ageField = view.findViewById(R.id.AgeField);
        NOKNameField = view.findViewById(R.id.NOKNameField);
        NOKAddressField = view.findViewById(R.id.NOKAddressField);
        NOKPostcodeField = view.findViewById(R.id.NOKPostcode);
        NOKPhoneNoField = view.findViewById(R.id.NOKPhoneNoField);

        nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(view14 ->
                NavHostFragment.findNavController(InitialAssessment.this).navigate(R.id.action_InitialAssessment_to_InitialAssessment2));

        previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment.this).navigate(R.id.action_InitialAssessment_to_Homepage);
            }
        });

        maleCB = view.findViewById(R.id.GenderMaleCheckbox);
        femaleCB = view.findViewById(R.id.GenderFemaleCheckbox);
        transCB = view.findViewById(R.id.GenderTransCheckbox);

        maleCB.setOnClickListener(view13 -> {
            if (femaleCB.isChecked() || transCB.isChecked())
            {
                femaleCB.setChecked(false);
                transCB.setChecked(false);
            }
        });

        femaleCB.setOnClickListener(view12 -> {
            if (maleCB.isChecked() || transCB.isChecked())
            {
                maleCB.setChecked(false);
                transCB.setChecked(false);
            }
        });

        transCB.setOnClickListener(view1 -> {
            if (femaleCB.isChecked() || maleCB.isChecked())
            {
                femaleCB.setChecked(false);
                maleCB.setChecked(false);
            }
        });

        NINCheckbox = view.findViewById(R.id.ProofOfNINCheckbox);
        NINField = view.findViewById(R.id.NINField);
        IDCheckbox = view.findViewById(R.id.IDProducedCheckbox);
        IDField = view.findViewById(R.id.IDDetailsField);

        NINCheckbox.setOnClickListener(view15 -> Utilities.doVisibility(NINCheckbox.isChecked(), NINField));

        IDCheckbox.setOnClickListener(view16 -> Utilities.doVisibility(IDCheckbox.isChecked(), IDField));
        
        countrySpinner = view.findViewById(R.id.DropdownCountries);

        Locale[] locale = Locale.getAvailableLocales();
        ArrayList<String> countries = new ArrayList<String>();
        for (Locale loc : locale) {
            String country = loc.getDisplayCountry();
            if (country.trim().length() > 0 && !countries.contains(country) && !country.equals("United Kingdom")) {
                countries.add(country);
            }
        }
        Collections.sort(countries, String.CASE_INSENSITIVE_ORDER);
        countries.add(0, "United Kingdom");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        countrySpinner.setAdapter(adapter);
    }

}