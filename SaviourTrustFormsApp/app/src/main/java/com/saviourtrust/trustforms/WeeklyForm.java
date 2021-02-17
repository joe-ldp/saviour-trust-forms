package com.saviourtrust.trustforms;

import android.location.Address;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WeeklyForm extends Fragment
{
    EditText editTextName;
    String name;
    EditText editTextDate;
    String dateString;
    Date date;
    EditText editTextTime;
    String timeString;
    Time time;
    EditText editTextAddress;
    String addressString;
    Address address;
    EditText editTextPresent;
    String present;
    EditText editTextHall;
    String hall;
    EditText editTextKitchen;
    String kitchen;
    EditText editTextLivingRoom;
    String livingRoom;
    EditText editTextBathroom;
    String bathroom;
    RadioButton radioButtonToiletGood;

    RadioButton radioButtonToiletOk;

    RadioButton radioButtonToiletPoor;

    EditText editTextRoomOne;
    String roomOne;
    EditText editTextRoomTwo;
    String roomTwo;
    EditText editTextFireDoor;
    String fireDoor;
    CheckBox checkBoxSmokeAlarms;
    boolean bSmokeAlarms;
    EditText editTextSmokeAlarms;
    String smokeAlarms;
    CheckBox checkBoxCarbonMonoxideAlarms;
    boolean bCarbonMonoxideAlarms;
    EditText editTextCarbonMonoxideAlarms;
    String carbonMonoxideAlarms;
    EditText editTextFridgeFreezer;
    String fridgeFreezer;
    EditText editTextWasher;
    String washer;
    EditText editTextMicrowave;
    String microwave;
    EditText editTextKettle;
    String kettle;
    EditText editTextHoover;
    String hoover;
    EditText editTextFryer;
    String fryer;
    EditText editTextToaster;
    String toaster;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weekly_form, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        editTextName = (EditText) view.findViewById(R.id.editTextName);
        editTextDate = (EditText) view.findViewById(R.id.editTextDate);
        editTextTime = (EditText) view.findViewById(R.id.editTextTime);
        editTextAddress = (EditText) view.findViewById(R.id.editTextAddress);
        editTextPresent = (EditText) view.findViewById(R.id.editTextPresent);
        editTextHall = (EditText) view.findViewById(R.id.editTextHall);
        editTextKitchen = (EditText) view.findViewById(R.id.editTextKitchen);
        editTextLivingRoom = (EditText) view.findViewById(R.id.editTextLivingRoom);
        editTextBathroom = (EditText) view.findViewById(R.id.editTextBathroom);
        radioButtonToiletGood = (RadioButton) view.findViewById(R.id.radioButtonToiletGood);
        radioButtonToiletOk = (RadioButton) view.findViewById(R.id.radioButtonToiletOk);
        radioButtonToiletPoor = (RadioButton) view.findViewById(R.id.radioButtonToiletPoor);
        editTextRoomOne = (EditText) view.findViewById(R.id.editTextRoomOne);
        editTextRoomTwo = (EditText) view.findViewById(R.id.editTextRoomTwo);
        editTextFireDoor = (EditText) view.findViewById(R.id.editTextFireDoor);
        checkBoxSmokeAlarms = (CheckBox) view.findViewById(R.id.checkBoxSmokeAlarms);
        editTextSmokeAlarms = (EditText) view.findViewById(R.id.editTextSmokeAlarms);
        checkBoxCarbonMonoxideAlarms = (CheckBox) view.findViewById(R.id.checkBoxCarbonMonoxideAlarms);
        editTextCarbonMonoxideAlarms = (EditText) view.findViewById(R.id.editTextCarbonMonoxideAlarms);
        editTextFridgeFreezer = (EditText) view.findViewById(R.id.editTextFridgeFreezer);
        editTextWasher = (EditText) view.findViewById(R.id.editTextWasher);
        editTextMicrowave = (EditText) view.findViewById(R.id.editTextMicrowave);
        editTextKettle = (EditText) view.findViewById(R.id.editTextKettle);
        editTextHoover = (EditText) view.findViewById(R.id.editTextHoover);
        editTextFryer = (EditText) view.findViewById(R.id.editTextFryer);
        editTextToaster = (EditText) view.findViewById(R.id.editTextToaster);

        String date_n = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
        editTextDate.setText(date_n);

        Calendar c = Calendar.getInstance();
        int hr = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        StringBuilder time_n = new StringBuilder();
        time_n.append(hr);
        time_n.append(":");
        time_n.append(mm);

        editTextTime.setText(time_n);

        checkBoxSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(checkBoxSmokeAlarms.isChecked(), editTextSmokeAlarms);
            }
        });

        checkBoxCarbonMonoxideAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(checkBoxCarbonMonoxideAlarms.isChecked(), editTextCarbonMonoxideAlarms);
            }
        });

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = editTextName.getText().toString();
                dateString = editTextDate.getText().toString();
                timeString = editTextTime.getText().toString();
                addressString = editTextAddress.getText().toString();
                present = editTextPresent.getText().toString();
                hall = editTextHall.getText().toString();
                kitchen = editTextKitchen.getText().toString();
                livingRoom = editTextLivingRoom.getText().toString();
                bathroom = editTextBathroom.getText().toString();
                roomOne = editTextRoomOne.getText().toString();
                roomTwo = editTextRoomTwo.getText().toString();
                fireDoor = editTextFireDoor.getText().toString();
                bSmokeAlarms = checkBoxSmokeAlarms.isChecked();
                smokeAlarms = editTextSmokeAlarms.getText().toString();
                bCarbonMonoxideAlarms = checkBoxCarbonMonoxideAlarms.isChecked();
                carbonMonoxideAlarms = editTextCarbonMonoxideAlarms.getText().toString();
                fridgeFreezer = editTextFridgeFreezer.getText().toString();
                washer = editTextWasher.getText().toString();
                microwave = editTextMicrowave.getText().toString();
                kettle = editTextKettle.getText().toString();
                hoover = editTextHoover.getText().toString();
                fryer = editTextFryer.getText().toString();
                toaster = editTextToaster.getText().toString();

                NavHostFragment.findNavController(WeeklyForm.this).navigate(R.id.action_WeeklyForm_to_Homepage);
            }
        });


    }
}