package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prudhvimandapati on 11/30/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private  int backgroundcolor;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor){
        super(context, 0, words);
        backgroundcolor = backgroundColor;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_itemview, parent, false);
        }

        Word currentWordAdapter = getItem(position);

        TextView milname = (TextView) listItemView.findViewById(R.id.Milwakeword);
        milname.setText(currentWordAdapter.getMilName());

        TextView engname = (TextView) listItemView.findViewById(R.id.Englishword);
        engname.setText(currentWordAdapter.getEngName());

        ImageView imageId = (ImageView) listItemView.findViewById(R.id.Image);

        if(currentWordAdapter.hasImage()){
            imageId.setImageResource(currentWordAdapter.getImageId());
            imageId.setVisibility(View.VISIBLE);
        }
        else {
            imageId.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), backgroundcolor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
