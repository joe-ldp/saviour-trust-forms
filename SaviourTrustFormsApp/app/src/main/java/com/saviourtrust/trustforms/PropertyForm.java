package com.saviourtrust.trustforms;

import android.location.Address;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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


    public PropertyForm() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PropertyForm newInstance(String param1, String param2) {
        PropertyForm fragment = new PropertyForm();
        Bundle args = new Bundle();
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

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addressString = editTextAddress.getText().toString();
                //address = .getText().toString();
                postcode = editTextPostcode.getText().toString();
                ownerName = editTextOwnerName.getText().toString();
                ownerPhoneString = editTextOwnerPhone.getText().toString();
                ownerPhone = Integer.parseInt(ownerPhoneString);
                rentPaidString = editTextRentPaid.getText().toString();
                rentPaid = Double.parseDouble(rentPaidString);
                roomRateString = editTextRoomRate.getText().toString();
                roomRate = Double.parseDouble(roomRateString);
                numRoomsString = editTextNumRooms.getText().toString();
                numRooms = Integer.parseInt(numRoomsString);
                numVoidsString = editTextNumVoids.getText().toString();
                numVoids = Integer.parseInt(numVoidsString);
                dateString = editTextDate.getText().toString();
                //date = dateString;
                electCertExpiryString = editTextElectCertExpiry.getText().toString();
                //electCertExpiry = electCertExpiryString;
                electSerialNo = editTextElectSerialNo.getText().toString();
                electProvider = editTextElectProvider.getText().toString();
                electMeter = editTextElectMeter.getText().toString();
                gasCertExpiryString = editTextGasCertExpiry.getText().toString();
                //gasCertExpiry = gasCertExpiryString;
                gasSerialNo = editTextGasSerialNo.getText().toString();
                gasProvider = editTextGasProvider.getText().toString();
                gasMeter = editTextGasMeter.getText().toString();

                NavHostFragment.findNavController(PropertyForm.this).navigate(R.id.action_PropertyForm_to_Homepage);

            }
        });
    }
}