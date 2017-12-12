package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        setTitle("Phrases");

        final ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("Minto Wukses", "Where are you going", R.raw.phrase_where_are_you_going));
        familyList.add(new Word("Tinne Ayesse'ne", "What is your name", R.raw.phrase_what_is_your_name));
        familyList.add(new Word("Ayaaset", "My name is", R.raw.phrase_my_name_is));
        familyList.add(new Word("Michekses", "How are you feeling", R.raw.phrase_how_are_you_feeling));
        familyList.add(new Word("Kuchi Achit", "I am feeling good", R.raw.phrase_im_feeling_good));
        familyList.add(new Word("Eneessaa", "Are you coming", R.raw.phrase_are_you_coming));
        familyList.add(new Word("He eenem", "Yes I am coming", R.raw.phrase_yes_im_coming));
        familyList.add(new Word("Eenem", " I am coming", R.raw.phrase_im_coming));
        familyList.add(new Word("Yee Woiutes", "Let's Go", R.raw.phrase_lets_go));
        familyList.add(new Word("Anniem", "Come here", R.raw.phrase_come_here));


        WordAdapter phrasesAdapter = new WordAdapter(this, familyList, R.color.category_phrases);

        ListView phrasesListView = (ListView) findViewById(R.id.phrases);
        phrasesListView.setAdapter(phrasesAdapter);

        phrasesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = familyList.get(position);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioId());
                mediaPlayer.start();
            }
        });
    }
}
