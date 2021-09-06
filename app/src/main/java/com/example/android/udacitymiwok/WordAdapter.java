package com.example.android.udacitymiwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;


public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,@ColorRes int category_colors) {
        super(context, 0, words);
        mColorResourceId = category_colors;
    }

    // override getView to let ListView use the custom list item defined in list_item.xml

    /**
     * Provides a view for an Adapter View (ListView, GridView, etc.)
     *
     * @param position    The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate
     * @param parent      The parent ViewGroup that is used for inflation
     * @return The View for the position in the AdapterView (in this case is the ListView)
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // check if the View provided is reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the Word object in the adapter with the requested position
        Word currentWord = getItem(position);

        TextView tvDefaultWord = listItemView.findViewById(R.id.tv_default_word);

        // set default word on TextView
        tvDefaultWord.setText(currentWord.getDefaultTranslation());

        TextView tvMiwokWord = listItemView.findViewById(R.id.tv_miwok_word);

        // set miwok word on TextView
        tvMiwokWord.setText(currentWord.getMiwokTranslation());

        ImageView ivWordImage = listItemView.findViewById(R.id.iv_word_image);

        if (currentWord.hasImage()) {
            // set Image for word
            ivWordImage.setImageResource(currentWord.getImageResID());
            ivWordImage.setVisibility(View.VISIBLE);
        } else {
            ivWordImage.setVisibility(View.GONE);
        }

        LinearLayout textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
