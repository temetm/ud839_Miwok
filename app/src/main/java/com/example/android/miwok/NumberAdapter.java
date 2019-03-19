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

public class NumberAdapter extends ArrayAdapter<Word> {

    public NumberAdapter(Activity context, ArrayList<Word> listA) {
        super(context, 0, listA);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentNumber = getItem(position);

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentNumber.getMiwokTranslation());

        TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentNumber.getDefaultTranslation());

        ImageView numberPicture = (ImageView) convertView.findViewById(R.id.list_picture);
        numberPicture.setImageResource(currentNumber.getPictureID());

        return convertView;
    }
}
