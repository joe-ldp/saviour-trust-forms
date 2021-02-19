package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
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
    CheckBox checkBoxIDSeen;
    boolean idSeen;
    String idSeenString;
    CheckBox checkBoxSupportWorker;
    boolean supportWorker;
    String supportWorkerString;
    CheckBox checkBoxRiskAlert;
    boolean riskAlert;
    String riskAlertString;

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
        checkBoxIDSeen = (CheckBox) view.findViewById(R.id.checkBoxIDSeen);
        checkBoxSupportWorker = (CheckBox) view.findViewById(R.id.checkBoxSupportWorker);
        checkBoxRiskAlert = (CheckBox) view.findViewById(R.id.checkBoxRiskAlert);

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FormData data = new FormData();
                data.addHeaders(new String[] {"Surname", "Forename", "MiddleName", "Phone", "Address", "RoomNo", "ArrivalDate", "LeavingDate", "RentDebt", "OtherDebt", "Benefit", "NatInsNo", "DoB", "MoveOn", "Referral", "idSeen", "SupportWorker", "RiskAlert"});

                surname = editTextSurname.getText().toString();
                data.addData(surname);
                forename = editTextForename.getText().toString();
                data.addData(forename);
                middleNames = editTextMiddleNames.getText().toString();
                data.addData(middleNames);
                phone = editTextPhone.getText().toString();
                data.addData(phone);
                address = editTextAddress.getText().toString();
                data.addData(address);
                roomNo = editTextRoomNo.getText().toString();
                data.addData(roomNo);
                arrivalDate = editTextArrivalDate.getText().toString();
                data.addData(arrivalDate);
                leavingDate = editTextLeavingDate.getText().toString();
                data.addData(leavingDate);
                rentDebt = editTextRentDebt.getText().toString();
                data.addData(rentDebt);
                otherDebt = editTextOtherDebt.getText().toString();
                data.addData(otherDebt);
                benefit = editTextBenefit.getText().toString();
                data.addData(benefit);
                natInsNo = editTextNatInsNo.getText().toString();
                data.addData(natInsNo);
                doB = editTextDoB.getText().toString();
                data.addData(doB);
                moveOn = editTextMoveOn.getText().toString();
                data.addData(moveOn);
                referralOutcome = editTextReferralOutcome.getText().toString();
                data.addData(referralOutcome);
                idSeen = checkBoxIDSeen.isChecked();
                idSeenString = idSeen ? "true" : "false";
                data.addData(idSeenString);
                supportWorker = checkBoxSupportWorker.isChecked();
                supportWorkerString = supportWorker ? "true" : "false";
                data.addData(supportWorkerString);
                riskAlert = checkBoxRiskAlert.isChecked();
                riskAlertString = riskAlert ? "true" : "false";
                data.addData(riskAlertString);

                try {
                    data.CSV("ServiceUserForm");
                }
                catch(java.io.IOException err) {
                    Log.e("IOException", err.toString());
                }

                NavHostFragment.findNavController(ServiceUserForm.this).navigate(R.id.action_ServiceUserForm_to_Homepage);
            }
        });
    }
}