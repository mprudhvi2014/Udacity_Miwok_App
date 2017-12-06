package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        setTitle("Colors");

        ArrayList<Word> colorList = new ArrayList<Word>();
        colorList.add(new Word("weṭeṭṭi", "Red", R.drawable.color_red));
        colorList.add(new Word("Chokoki", "Green", R.drawable.color_green));
        colorList.add(new Word("Takakki", "Brown", R.drawable.color_brown));
        colorList.add(new Word("Toppopi", "Gray", R.drawable.color_gray));
        colorList.add(new Word("Kullili", "Black", R.drawable.color_black));
        colorList.add(new Word("Kellili", "White", R.drawable.color_white));
        colorList.add(new Word("Toplisa", "Dusty Yellow", R.drawable.color_dusty_yellow));
        colorList.add(new Word("Chiwitta", "Mustard Yellow", R.drawable.color_mustard_yellow));

        WordAdapter colorAdapter = new WordAdapter(this, colorList, R.color.category_colors);

        ListView colorListview =(ListView) findViewById(R.id.colorsGrid);
        colorListview.setAdapter(colorAdapter);


    }
}
