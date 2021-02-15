package com.saviourtrust.trustforms;

import android.view.View;
import android.widget.EditText;

public class Utilities
{
    public static void doVisibility(boolean checked, EditText et)
    {
        if (checked)
        {
            et.setVisibility(View.VISIBLE);
        }
        else
        {
            et.setVisibility(View.GONE);
        }
    }
}