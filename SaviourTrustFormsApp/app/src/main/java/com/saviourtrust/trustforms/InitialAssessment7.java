package com.saviourtrust.trustforms;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;
//import android.support.v7.app.AppCompatActivity;

import com.github.gcacace.signaturepad.views.SignaturePad;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class InitialAssessment7 extends Fragment {

    SignaturePad signaturePad;
    Button openPad;
    LinearLayout pad;
    Button saveButton, clearButton;

    public InitialAssessment7() {
    }

    public static InitialAssessment7 newInstance(String param1, String param2) {
        InitialAssessment7 fragment = new InitialAssessment7();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_initial_assessment7, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        openPad = view.findViewById(R.id.OpenPad);
        pad = view.findViewById(R.id.DrawingPad);

        signaturePad = view.findViewById(R.id.signaturePad);

        saveButton = view.findViewById(R.id.saveButton);
        clearButton = view.findViewById(R.id.clearButton);

        openPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.signingpad, pad, false);
                pad.addView(view1);
            }
        });

        Button submitForm = view.findViewById(R.id.SubmitButton);
        submitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment7.this).navigate(R.id.action_InitialAssessment7_to_Homepage);
            }
        });

        Button previousPage = view.findViewById(R.id.btnPreviousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InitialAssessment7.this).navigate(R.id.action_InitialAssessment7_to_InitialAssessment6);
            }
        });
    }
}