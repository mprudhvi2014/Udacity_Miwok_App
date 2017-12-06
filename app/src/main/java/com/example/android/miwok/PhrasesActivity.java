package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        setTitle("Phrases");

        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("Minto Wukses", "Where are you going"));
        familyList.add(new Word("Tinne Ayesse'ne", "What is your name"));
        familyList.add(new Word("Ayaaset", "My name is"));
        familyList.add(new Word("Michekses", "How are ypu feeling"));
        familyList.add(new Word("Kuchi Achit", "I am feeling good"));
        familyList.add(new Word("Eneessaa", "Are you coming"));
        familyList.add(new Word("He eenem", "Yes I am coming"));
        familyList.add(new Word("Eenem", " I am coming"));
        familyList.add(new Word("Yee Woiutes", "Let's Go"));
        familyList.add(new Word("Anniem", "Come here"));


        WordAdapter phrasesAdapter = new WordAdapter(this, familyList, R.color.category_phrases);

        ListView phrasesListView = (ListView) findViewById(R.id.phrases);
        phrasesListView.setAdapter(phrasesAdapter);
    }
}
