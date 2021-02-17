package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

public class ServiceUserForm extends Fragment {

    EditText editTextSurname;
    String surname;
    EditText editTextForename;
    String forename;
    EditText editTextMiddleNames;
    String middleNames;
    EditText editTextPhone;
    String phone;
    EditText editTextAddress;
    String address;
    EditText editTextRoomNo;
    String roomNo;
    EditText editTextArrivalDate;
    String arrivalDate;
    EditText editTextLeavingDate;
    String leavingDate;
    EditText editTextRentDebt;
    String rentDebt;
    EditText editTextOtherDebt;
    String otherDebt;
    EditText editTextBenefit;
    String benefit;
    EditText editTextNatInsNo;
    String natInsNo;
    EditText editTextDoB;
    String doB;
    EditText editTextMoveOn;
    String moveOn;
    EditText editTextReferralOutcome;
    String referralOutcome;
    EditText editTextOutcomeOne;
    String outcomeOne;
    CheckBox checkBoxIDSeen;
    boolean idSeen;
    CheckBox checkBoxSupportWorker;
    boolean supportWorker;
    CheckBox checkBoxRiskAlert;
    boolean riskAlert;

    public ServiceUserForm() {
        // Required empty public constructor
    }

    public static ServiceUserForm newInstance() {
        ServiceUserForm fragment = new ServiceUserForm();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_service_user_form, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editTextSurname = (EditText) view.findViewById(R.id.editTextSurname);
        editTextForename = (EditText) view.findViewById(R.id.editTextForename);
        editTextMiddleNames = (EditText) view.findViewById(R.id.editTextMiddleNames);
        editTextPhone = (EditText) view.findViewById(R.id.editTextPhone);
        editTextAddress = (EditText) view.findViewById(R.id.editTextAddress);
        editTextRoomNo = (EditText) view.findViewById(R.id.editTextRoomNo);
        editTextArrivalDate = (EditText) view.findViewById(R.id.editTextArrivalDate);
        editTextLeavingDate = (EditText) view.findViewById(R.id.editTextLeavingDate);
        editTextRentDebt = (EditText) view.findViewById(R.id.editTextRentDebt);
        editTextOtherDebt = (EditText) view.findViewById(R.id.editTextOtherDebt);
        editTextBenefit = (EditText) view.findViewById(R.id.editTextBenefit);
        editTextNatInsNo = (EditText) view.findViewById(R.id.editTextNatInsNo);
        editTextDoB = (EditText) view.findViewById(R.id.editTextDoB);
        editTextMoveOn = (EditText) view.findViewById(R.id.editTextMoveOn);
        editTextReferralOutcome = (EditText) view.findViewById(R.id.editTextReferralOutcome);
        editTextOutcomeOne = (EditText) view.findViewById(R.id.editTextOutcomeOne);
        checkBoxIDSeen = (CheckBox) view.findViewById(R.id.checkBoxIDSeen);
        checkBoxSupportWorker = (CheckBox) view.findViewById(R.id.checkBoxSupportWorker);
        checkBoxRiskAlert = (CheckBox) view.findViewById(R.id.checkBoxRiskAlert);

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                surname = editTextSurname.getText().toString();
                forename = editTextForename.getText().toString();
                middleNames = editTextMiddleNames.getText().toString();
                phone = editTextPhone.getText().toString();
                address = editTextAddress.getText().toString();
                roomNo = editTextRoomNo.getText().toString();
                arrivalDate = editTextArrivalDate.getText().toString();
                leavingDate = editTextLeavingDate.getText().toString();
                rentDebt = editTextRentDebt.getText().toString();
                otherDebt = editTextOtherDebt.getText().toString();
                benefit = editTextBenefit.getText().toString();
                natInsNo = editTextNatInsNo.getText().toString();
                doB = editTextDoB.getText().toString();
                moveOn = editTextMoveOn.getText().toString();
                referralOutcome = editTextReferralOutcome.getText().toString();
                outcomeOne = editTextOutcomeOne.getText().toString();
                idSeen = checkBoxIDSeen.isChecked();
                supportWorker = checkBoxSupportWorker.isChecked();
                riskAlert = checkBoxRiskAlert.isChecked();

                NavHostFragment.findNavController(ServiceUserForm.this).navigate(R.id.action_serviceUserForm_to_Homepage);
            }
        });
    }
}