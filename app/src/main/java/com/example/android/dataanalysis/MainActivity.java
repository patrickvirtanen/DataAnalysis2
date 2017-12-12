package com.example.android.dataanalysis;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    BarChart mBarChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBarChart = findViewById(R.id.bargraph);

        ArrayList<BarEntry> entries = new ArrayList<>();
        ArrayList<String> theDates = new ArrayList<>();

        entries.add(new BarEntry(44f,0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));
        BarDataSet barDataSet = new BarDataSet(entries, "Dates");

        theDates.add("Januari");
        theDates.add("Februari");
        theDates.add("Mars");
        theDates.add("April");
        theDates.add("Maj");
        theDates.add("Juni");

        BarData barData = new BarData(theDates, barDataSet);
        mBarChart.setData(barData);

        mBarChart.setTouchEnabled(true);




    }
}
