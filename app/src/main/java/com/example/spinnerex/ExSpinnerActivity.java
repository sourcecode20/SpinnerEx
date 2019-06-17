package com.example.spinnerex;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.example.spinnerex.Adapter.SpinnerAdapter;
import com.example.spinnerex.model.SingleRow;

import java.util.ArrayList;
import java.util.List;

public class ExSpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    List<SingleRow> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_spinner);

        data = new ArrayList<>();

        Resources resources = getResources();

        String[] name = resources.getStringArray(R.array.Name);
        int[] image = {R.drawable.boy1, R.drawable.boy2, R.drawable.boy3, R.drawable.boy4, R.drawable.boy5, R.drawable.boy6};

        for (int positon = 0; positon < 6; positon++) {
            data.add(new SingleRow(name[positon], image[positon]));
        }


        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(new SpinnerAdapter(this, data));


    }
}
