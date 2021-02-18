package com.saviourtrust.trustforms;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import android.content.Context;
import android.util.Log;

public class FormData {

    private ArrayList<String> headers;
    private ArrayList<String> formData;

    public FormData() {
        formData = new ArrayList<String>();
        headers = new ArrayList<String>();
    }

    public void addHeader(String header) {
        if (!headers.contains(header)) headers.add(header);
    }

    public void addHeaders(String[] headers) {
        for (String header : headers) {
            if (!this.headers.contains(header)) this.headers.add(header);
        }
    }

    public void addData(String data) {
        if (this.headers.size() == 0) return;
        formData.add(data);
    }

    public void CSV() throws IOException {
        Context context = MainActivity.getContext();
        FileWriter csvWriter = new FileWriter(context.getFilesDir() + "/new.csv");
        //Log.d("bruh", context.getFilesDir().toString());
        for (String header : this.headers) {
            csvWriter.append(header + ",");
        }
        csvWriter.append("\n");

        for (String data : this.formData) {
            csvWriter.append(data + ",");
        }
        csvWriter.append("\n");

        csvWriter.flush();
        csvWriter.close();
    }
}