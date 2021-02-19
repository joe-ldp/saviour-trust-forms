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

    public void CSV(String name) throws IOException {
        Context context = MainActivity.getContext();
        String path = context.getFilesDir() + "/" + name + ".csv";
        FileWriter csvWriter = new FileWriter(path);

        for (int i = 0; i < this.headers.size(); i++) {
            csvWriter.append(this.headers.get(i));
            if (i < this.headers.size()) csvWriter.append(",");
        }
        csvWriter.append("\n");

        for (int i = 0; i < this.formData.size(); i++) {
            csvWriter.append(this.formData.get(i));
            if (i < this.formData.size()) csvWriter.append(",");
        }
        csvWriter.append("\n");

        csvWriter.flush();
        csvWriter.close();
    }
}