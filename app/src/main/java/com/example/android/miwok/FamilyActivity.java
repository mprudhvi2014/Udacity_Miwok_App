package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        setTitle("Family");


        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("epe", "Father", R.drawable.family_father));
        familyList.add(new Word("Eta", "Mother", R.drawable.family_mother));
        familyList.add(new Word("Angsi", "Son", R.drawable.family_son));
        familyList.add(new Word("une", "Daughter", R.drawable.family_daughter));
        familyList.add(new Word("Chaliti", "Younger Brother", R.drawable.family_younger_brother));
        familyList.add(new Word("Taachi", "Older Brother", R.drawable.family_older_brother));
        familyList.add(new Word("Tete", "Older Sister", R.drawable.family_older_sister));
        familyList.add(new Word("Koliti", "Younger Sister", R.drawable.family_younger_sister));
        familyList.add(new Word("Ama", "Grand Mother"));
        familyList.add(new Word("Pappa", "Grand Father"));


        WordAdapter familyAdapter = new WordAdapter(this, familyList, R.color.category_family);

        ListView familyListView = (ListView) findViewById(R.id.family);
        familyListView.setAdapter(familyAdapter);
    }
}
