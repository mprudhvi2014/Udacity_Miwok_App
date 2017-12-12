package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        setTitle("Family");


        final ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("epe", "Father", R.drawable.family_father, R.raw.family_father));
        familyList.add(new Word("Eta", "Mother", R.drawable.family_mother, R.raw.family_mother));
        familyList.add(new Word("Angsi", "Son", R.drawable.family_son, R.raw.family_son));
        familyList.add(new Word("une", "Daughter", R.drawable.family_daughter, R.raw.family_daughter));
        familyList.add(new Word("Chaliti", "Younger Brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyList.add(new Word("Taachi", "Older Brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyList.add(new Word("Tete", "Older Sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyList.add(new Word("Koliti", "Younger Sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyList.add(new Word("Ama", "Grand Mother", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyList.add(new Word("Pappa", "Grand Father", R.drawable.family_grandfather, R.raw.family_grandfather));


        WordAdapter familyAdapter = new WordAdapter(this, familyList, R.color.category_family);

        final ListView familyListView = (ListView) findViewById(R.id.family);
        familyListView.setAdapter(familyAdapter);

        familyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = familyList.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioId());
                mediaPlayer.start();
            }
        });
    }
}
