package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setTitle("Numbers");

        String[] numbers = new  String[10];
        numbers[0] = "One";
        numbers[1] = "Two";
        numbers[2] = "Three";
        numbers[3] = "Four";
        numbers[4] = "Five";
        numbers[5] = "Six";
        numbers[6] = "Seven";
        numbers[7] = "Eight";
        numbers[8] = "Nine";
        numbers[9] = "Ten";

        Log.v("Numbers Activity", "Number at word[0]:" + numbers[0]);
        Log.v("Numbers Activity", "Number at word[1]:" + numbers[1]);
        Log.v("Numbers Activity", "Number at word[2]:" + numbers[2]);
        Log.v("Numbers Activity", "Number at word[3]:" + numbers[3]);
        Log.v("Numbers Activity", "Number at word[4]:" + numbers[4]);
        Log.v("Numbers Activity", "Number at word[5]:" + numbers[5]);
        Log.v("Numbers Activity", "Number at word[6]:" + numbers[6]);
        Log.v("Numbers Activity", "Number at word[7]:" + numbers[7]);
        Log.v("Numbers Activity", "Number at word[8]:" + numbers[8]);
        Log.v("Numbers Activity", "Number at word[9]:" + numbers[9]);
    }
}
