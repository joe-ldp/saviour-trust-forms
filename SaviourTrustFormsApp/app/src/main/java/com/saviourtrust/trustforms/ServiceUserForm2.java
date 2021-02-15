package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ServiceUserForm2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServiceUserForm2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServiceUserForm2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_service_user_form_2.
     */
    // TODO: Rename and change types and number of parameters
    public static ServiceUserForm2 newInstance(String param1, String param2) {
        ServiceUserForm2 fragment = new ServiceUserForm2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                NavHostFragment.findNavController(ServiceUserForm2.this)
                        .navigate(R.id.action_ServiceUserForm2_to_ServiceUserForm3);

            }
        });

        CheckBox rentCheckbox = view.findViewById(R.id.CHSRentCheckbox);
        EditText rentField = view.findViewById(R.id.CHSRentField);
        CheckBox injunctionCheckbox = view.findViewById(R.id.CHSInjunctionCheckbox);
        EditText injunctionField = view.findViewById(R.id.CHSInjunctionField);
        CheckBox concernCheckbox = view.findViewById(R.id.CHSConcernCheckbox);
        EditText concernField = view.findViewById(R.id.CHSConcernField);

        rentCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //doVisibility(rentCheckbox.isChecked(), rentField);
            }
        });

        injunctionCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //doVisibility(injunctionCheckbox.isChecked(), injunctionField);
            }
        });

        concernCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //doVisibility(concernCheckbox.isChecked(), concernField);
            }
        });
    }

}

