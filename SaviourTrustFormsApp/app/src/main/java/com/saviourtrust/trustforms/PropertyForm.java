package com.saviourtrust.trustforms;

import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class PropertyForm extends Fragment {

    EditText editTextAddress;
    Address address;
    String addressString;
    EditText editTextPostcode;
    String postcode;
    EditText editTextOwnerName;
    String ownerName;
    EditText editTextOwnerPhone;
    int ownerPhone;
    String ownerPhoneString;
    EditText editTextRentPaid;
    double rentPaid;
    String rentPaidString;
    EditText editTextRoomRate;
    double roomRate;
    String roomRateString;
    EditText editTextNumRooms;
    int numRooms;
    String numRoomsString;
    EditText editTextNumVoids;
    int numVoids;
    String numVoidsString;
    EditText editTextDate;
    Date date;
    String dateString;
    EditText editTextElectCertExpiry;
    Date electCertExpiry;
    String electCertExpiryString;
    EditText editTextElectSerialNo;
    String electSerialNo;
    EditText editTextElectProvider;
    String electProvider;
    EditText editTextElectMeter;
    String electMeter;
    EditText editTextGasCertExpiry;
    Date gasCertExpiry;
    String gasCertExpiryString;
    EditText editTextGasSerialNo;
    String gasSerialNo;
    EditText editTextGasProvider;
    String gasProvider;
    EditText editTextGasMeter;
    String gasMeter;

    View textViewFillOutAll;

    public PropertyForm() {
        // Required empty public constructor
    }

    public static PropertyForm newInstance() {
        PropertyForm fragment = new PropertyForm();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_property_form, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        editTextAddress = (EditText) view.findViewById(R.id.editTextAddress);
        editTextPostcode = (EditText) view.findViewById(R.id.editTextPostcode);
        editTextOwnerName = (EditText) view.findViewById(R.id.editTextOwnerName);
        editTextOwnerPhone = (EditText) view.findViewById(R.id.editTextOwnerPhone);
        editTextRentPaid = (EditText) view.findViewById(R.id.editTextRentPaid);
        editTextRoomRate = (EditText) view.findViewById(R.id.editTextRoomRate);
        editTextNumRooms = (EditText) view.findViewById(R.id.editTextNumRooms);
        editTextNumVoids = (EditText) view.findViewById(R.id.editTextNumVoids);
        editTextDate = (EditText) view.findViewById(R.id.editTextDate);
        editTextElectCertExpiry = (EditText) view.findViewById(R.id.editTextElectCertExpiry);
        editTextElectSerialNo = (EditText) view.findViewById(R.id.editTextElectSerialNo);
        editTextElectProvider = (EditText) view.findViewById(R.id.editTextElectProvider);
        editTextElectMeter = (EditText) view.findViewById(R.id.editTextElectMeter);
        editTextGasCertExpiry = (EditText) view.findViewById(R.id.editTextGasCertExpiry);
        editTextGasSerialNo = (EditText) view.findViewById(R.id.editTextGasSerialNo);
        editTextGasProvider = (EditText) view.findViewById(R.id.editTextGasProvider);
        editTextGasMeter = (EditText) view.findViewById(R.id.editTextGasMeter);

        //textViewFillOutAll = view.findViewById(R.id.textViewFillOutAll);
        //Utilities.doVisibility(false, textViewFillOutAll);

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FormData data = new FormData();
                data.addHeaders(new String[] {"Address", "Postcode", "OwnerName", "OwnerPhone", "RentPaid", "RoomRate", "NumRooms", "NumVoids", "DateProperty", "ElectCertExpiry", "ElectSerialNo", "ElectProvider", "ElectMeter", "GasCertExpiry", "GasSerialNo", "GasProvider", "GasMeter"});

                addressString = editTextAddress.getText().toString();
                //address = ;
                data.addData(addressString);
                postcode = editTextPostcode.getText().toString();
                data.addData(postcode);
                ownerName = editTextOwnerName.getText().toString();
                data.addData(ownerName);
                ownerPhoneString = editTextOwnerPhone.getText().toString();
                //ownerPhone = Integer.parseInt(ownerPhoneString);
                data.addData(ownerPhoneString);
                rentPaidString = editTextRentPaid.getText().toString();
                //rentPaid = Double.parseDouble(rentPaidString);
                data.addData(rentPaidString);
                roomRateString = editTextRoomRate.getText().toString();
                //roomRate = Double.parseDouble(roomRateString);
                data.addData(roomRateString);
                numRoomsString = editTextNumRooms.getText().toString();
                //numRooms = Integer.parseInt(numRoomsString);
                data.addData(numRoomsString);
                numVoidsString = editTextNumVoids.getText().toString();
                //numVoids = Integer.parseInt(numVoidsString);
                data.addData(numVoidsString);
                dateString = editTextDate.getText().toString();
                //date = dateString;
                data.addData(dateString);
                electCertExpiryString = editTextElectCertExpiry.getText().toString();
                //electCertExpiry = electCertExpiryString;
                data.addData(electCertExpiryString);
                electSerialNo = editTextElectSerialNo.getText().toString();
                data.addData(electSerialNo);
                electProvider = editTextElectProvider.getText().toString();
                data.addData(electProvider);
                electMeter = editTextElectMeter.getText().toString();
                data.addData(electMeter);
                gasCertExpiryString = editTextGasCertExpiry.getText().toString();
                //gasCertExpiry = gasCertExpiryString;
                data.addData(gasCertExpiryString);
                gasSerialNo = editTextGasSerialNo.getText().toString();
                data.addData(gasSerialNo);
                gasProvider = editTextGasProvider.getText().toString();
                data.addData(gasProvider);
                gasMeter = editTextGasMeter.getText().toString();
                data.addData(gasMeter);

                //View layout = view.findViewById(R.id.main_layout);
                //Utilities.doVisibility(true, textViewFillOutAll);

                try {
                    data.CSV("PropertyForm");
                }
                catch(java.io.IOException err) {
                    Log.e("IOException", err.toString());
                }

                NavHostFragment.findNavController(PropertyForm.this).navigate(R.id.action_PropertyForm_to_Homepage);

            }
        });
    }
}