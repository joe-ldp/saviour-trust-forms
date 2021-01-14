package com.saviourtrust.trustforms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SecondFragment extends Fragment
{
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        /*view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });*/

        EditText textDate = (EditText) view.findViewById(R.id.editTextDate);
        EditText textTime = (EditText) view.findViewById(R.id.editTextTime);

        String date_n = new SimpleDateFormat("dd/mm/yyyy", Locale.getDefault()).format(new Date());

        Calendar c = Calendar.getInstance();
        int hr = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        StringBuilder time_n = new StringBuilder();
        time_n.append(hr);
        time_n.append(":");
        time_n.append(mm);

        textDate.setText(date_n);
        textTime.setText(time_n);

        CheckBox cbSmokeAlarms = view.findViewById(R.id.checkBoxSmokeAlarms);
        EditText etSmokeAlarms = view.findViewById(R.id.editTextSmokeAlarms);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbSmokeAlarms.isChecked(), etSmokeAlarms);
            }
        });

        CheckBox cbCarbonMonoxideAlarms = view.findViewById(R.id.checkBoxCarbonMonoxideAlarms);
        EditText etCarbonMonoxideAlarms = view.findViewById(R.id.editTextCarbonMonoxideAlarms);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbCarbonMonoxideAlarms.isChecked(), etCarbonMonoxideAlarms);
            }
        });

        CheckBox cbFridgeFreezer = view.findViewById(R.id.checkBoxFridgeFreezer);
        EditText etFridgeFreezer = view.findViewById(R.id.editTextFridgeFreezer);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbFridgeFreezer.isChecked(), etFridgeFreezer);
            }
        });

        CheckBox cbWasher = view.findViewById(R.id.checkBoxWasher);
        EditText etWasher = view.findViewById(R.id.editTextWasher);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbWasher.isChecked(), etWasher);
            }
        });

        CheckBox cbMicrowave = view.findViewById(R.id.checkBoxMicrowave);
        EditText etMicrowave = view.findViewById(R.id.editTextMicrowave);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbMicrowave.isChecked(), etMicrowave);
            }
        });

        CheckBox cbKettle = view.findViewById(R.id.checkBoxKettle);
        EditText etKettle = view.findViewById(R.id.editTextKettle);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbKettle.isChecked(), etKettle);
            }
        });

        CheckBox cbHoover = view.findViewById(R.id.checkBoxHoover);
        EditText etHoover = view.findViewById(R.id.editTextHoover);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbHoover.isChecked(), etHoover);
            }
        });

        CheckBox cbFryer = view.findViewById(R.id.checkBoxFryer);
        EditText etFryer = view.findViewById(R.id.editTextFryer);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbFryer.isChecked(), etFryer);
            }
        });

        CheckBox cbToaster = view.findViewById(R.id.checkBoxToaster);
        EditText etToaster = view.findViewById(R.id.editTextToaster);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doVisibility(cbToaster.isChecked(), etToaster);
            }
        });


    }

    public void doVisibility(boolean checked, EditText et)
    {
        if (checked)
        {
            et.setVisibility(View.VISIBLE);
        }
        else
        {
            et.setVisibility(View.INVISIBLE);
        }
    }
}