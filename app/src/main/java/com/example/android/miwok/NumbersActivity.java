package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setTitle("Numbers");

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        Log.v("Numbers Activity", "Number at word[0]:" + words.get(0));
        Log.v("Numbers Activity", "Number at word[1]:" + words.get(1));
        Log.v("Numbers Activity", "Number at word[2]:" + words.get(2));
        Log.v("Numbers Activity", "Number at word[3]:" + words.get(3));
        Log.v("Numbers Activity", "Number at word[4]:" + words.get(4));
        Log.v("Numbers Activity", "Number at word[5]:" + words.get(5));
        Log.v("Numbers Activity", "Number at word[6]:" + words.get(6));
        Log.v("Numbers Activity", "Number at word[7]:" + words.get(7));
        Log.v("Numbers Activity", "Number at word[8]:" + words.get(8));
        Log.v("Numbers Activity", "Number at word[9]:" + words.get(9));
    }
}
