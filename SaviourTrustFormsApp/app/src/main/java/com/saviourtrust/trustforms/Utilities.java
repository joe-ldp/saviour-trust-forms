package com.saviourtrust.trustforms;

import android.view.View;
import android.widget.EditText;

public class Utilities
{
    public static void doVisibility(boolean checked, View view)
    {
        if (checked)
        {
            view.setVisibility(View.VISIBLE);
        }
        else
        {
            view.setVisibility(View.GONE);
        }
    }
}