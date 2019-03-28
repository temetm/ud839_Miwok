package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorId = 0;
    MediaPlayer mp;
    public WordAdapter(Activity context, ArrayList<Word> listA, int colorID) {
        super(context, 0, listA);
        mColorId = colorID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word currentWordObject = getItem(position);

        int color = ContextCompat.getColor(getContext(), mColorId);

        LinearLayout listLayoutColor = (LinearLayout) convertView.findViewById(R.id.listRootLayout);
        listLayoutColor.setBackgroundColor(color);

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWordObject.getMiwokTranslation());
        miwokTextView.setBackgroundColor(color);

        TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWordObject.getDefaultTranslation());
        defaultTextView.setBackgroundColor(color);

        ImageView wordImage = (ImageView) convertView.findViewById(R.id.list_picture);
        if (currentWordObject.hasImage()){
            wordImage.setImageResource(currentWordObject.getPictureID());
            wordImage.setVisibility(View.VISIBLE);
        }else {
            wordImage.setVisibility(View.GONE);
        }



        //TextView numbers = (TextView) findViewById(R.id.numbers);
        // Set a click listener on that View
        listLayoutColor.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // to play audio code here
                mp = MediaPlayer.create(getContext(),currentWordObject.getAudioId());
                mp.start();
            }
        });


        return convertView;
    }

}