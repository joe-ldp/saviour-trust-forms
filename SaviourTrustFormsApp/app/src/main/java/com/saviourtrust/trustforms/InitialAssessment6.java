package com.saviourtrust.trustforms;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class InitialAssessment6 extends Fragment {
    Button openPad;
    LinearLayout pad;
    Button openPad2;
    LinearLayout pad2;

    public InitialAssessment6() {
    }

    public static InitialAssessment6 newInstance(String param1, String param2) {
        InitialAssessment6 fragment = new InitialAssessment6();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_initial_assessment6, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button nextPage = view.findViewById(R.id.btnNextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment6.this).navigate(R.id.action_InitialAssessment6_to_InitialAssessment7);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment6.this).navigate(R.id.action_InitialAssessment6_to_InitialAssessment5);
            }
        });

        openPad = view.findViewById(R.id.OpenPad);
        pad = view.findViewById(R.id.DrawingPad);
        openPad2 = view.findViewById(R.id.OpenPad2);
        pad2 = view.findViewById(R.id.DrawingPad2);

        openPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.signingpad, pad, false);
                pad.addView(view1);
            }
        });

        openPad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.signingpad, pad2, false);
                pad2.addView(view1);
            }
        });

        EditText RANumber = view.findViewById(R.id.RAScore);


    }
}