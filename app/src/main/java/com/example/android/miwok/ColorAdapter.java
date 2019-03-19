package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Word> {

    public ColorAdapter(Activity context, ArrayList<Word> listA) {
        super(context, 0, listA);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentColor = getItem(position);

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentColor.getMiwokTranslation());

        TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentColor.getDefaultTranslation());

        ImageView colorImage = (ImageView) convertView.findViewById(R.id.list_picture);
        colorImage.setImageResource(currentColor.getPictureID());

        return convertView;
    }
}
