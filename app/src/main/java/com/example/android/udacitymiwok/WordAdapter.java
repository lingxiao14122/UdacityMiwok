package com.example.android.udacitymiwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    // override getView to let ListView use the custom list item defined in list_item.xml
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // check if the View provided is reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the Word object in the adapter with the correct position
        Word currentWord = getItem(position);

        // bind TextView var to ui
        TextView tvDefaultWord = listItemView.findViewById(R.id.tv_default_word);

        // set default word on TextView
        tvDefaultWord.setText(currentWord.getDefaultTranslation());

        // bind TextView var to ui
        TextView tvMiwokWord = listItemView.findViewById(R.id.tv_miwok_word);

        // set miwok word on TextView
        tvMiwokWord.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}
