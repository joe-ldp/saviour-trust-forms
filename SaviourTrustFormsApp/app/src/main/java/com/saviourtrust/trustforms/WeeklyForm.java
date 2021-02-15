package com.saviourtrust.trustforms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WeeklyForm extends Fragment
{
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weekly_form, container, false);
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

        String date_n = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
        textDate.setText(date_n);

        Calendar c = Calendar.getInstance();
        int hr = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        StringBuilder time_n = new StringBuilder();
        time_n.append(hr);
        time_n.append(":");
        time_n.append(mm);

        textTime.setText(time_n);

        CheckBox cbSmokeAlarms = view.findViewById(R.id.checkBoxSmokeAlarms);
        EditText etSmokeAlarms = view.findViewById(R.id.editTextSmokeAlarms);
        cbSmokeAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(cbSmokeAlarms.isChecked(), etSmokeAlarms);
            }
        });

        CheckBox cbCarbonMonoxideAlarms = view.findViewById(R.id.checkBoxCarbonMonoxideAlarms);
        EditText etCarbonMonoxideAlarms = view.findViewById(R.id.editTextCarbonMonoxideAlarms);
        cbCarbonMonoxideAlarms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Utilities.doVisibility(cbCarbonMonoxideAlarms.isChecked(), etCarbonMonoxideAlarms);
            }
        });

        view.findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                NavHostFragment.findNavController(WeeklyForm.this)
                        .navigate(R.id.action_WeeklyForm_to_Homepage);


            }
        });


    }

/*    public void doVisibility(boolean checked, EditText et)
    {
        if (checked)
        {
            et.setVisibility(View.VISIBLE);
        }
        else
        {
            et.setVisibility(View.GONE);
        }
    }*/
}