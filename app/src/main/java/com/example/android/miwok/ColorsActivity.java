package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        setTitle("Colors");

        final ArrayList<Word> colorList = new ArrayList<Word>();
        colorList.add(new Word("weṭeṭṭi", "Red", R.drawable.color_red, R.raw.color_red));
        colorList.add(new Word("Chokoki", "Green", R.drawable.color_green, R.raw.color_green));
        colorList.add(new Word("Takakki", "Brown", R.drawable.color_brown, R.raw.color_brown));
        colorList.add(new Word("Toppopi", "Gray", R.drawable.color_gray, R.raw.color_gray));
        colorList.add(new Word("Kullili", "Black", R.drawable.color_black, R.raw.color_black));
        colorList.add(new Word("Kellili", "White", R.drawable.color_white, R.raw.color_white));
        colorList.add(new Word("Toplisa", "Dusty Yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorList.add(new Word("Chiwitta", "Mustard Yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter colorAdapter = new WordAdapter(this, colorList, R.color.category_colors);

        ListView colorListview =(ListView) findViewById(R.id.colorsGrid);
        colorListview.setAdapter(colorAdapter);

        colorListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colorList.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioId());
                mediaPlayer.start();
            }
        });


    }
}
