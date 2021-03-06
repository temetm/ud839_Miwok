/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "weṭeṭṭi", R.raw.color_red, R.mipmap.color_red));
        colors.add(new Word("green", "chokokki", R.raw.color_green, R.mipmap.color_green));
        colors.add(new Word("brown", "ṭakaakki", R.raw.color_brown, R.mipmap.color_brown));
        colors.add(new Word("gray", "ṭopoppi", R.raw.color_gray, R.mipmap.color_gray));
        colors.add(new Word("black", "kululli", R.raw.color_black, R.mipmap.color_black));
        colors.add(new Word("white", "kelelli", R.raw.color_white, R.mipmap.color_white));
        colors.add(new Word("dusty yellow", "ṭopiisә", R.raw.color_dusty_yellow, R.mipmap.color_dusty_yellow));
        colors.add(new Word("mustard yellow", "chiwiiṭә", R.raw.color_mustard_yellow, R.mipmap.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
