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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> relatives = new ArrayList<Word>();
        relatives.add(new Word("father", "әpә", R.raw.family_father, R.mipmap.family_father));
        relatives.add(new Word("mother", "әṭa", R.raw.family_mother, R.mipmap.family_mother));
        relatives.add(new Word("son", "angsi", R.raw.family_son, R.mipmap.family_son));
        relatives.add(new Word("daughter", "tune", R.raw.family_daughter, R.mipmap.family_daughter));
        relatives.add(new Word("older brother", "taachi", R.raw.family_older_brother, R.mipmap.family_older_brother));
        relatives.add(new Word("younger brother", "chalitti", R.raw.family_younger_brother, R.mipmap.family_younger_brother));
        relatives.add(new Word("older sister", "teṭe", R.raw.family_older_sister, R.mipmap.family_older_sister));
        relatives.add(new Word("younger sister", "kolliti", R.raw.family_younger_sister, R.mipmap.family_younger_sister));
        relatives.add(new Word("grandfather", "paapa", R.raw.family_grandfather, R.mipmap.family_grandfather));
        relatives.add(new Word("grandmother", "ama", R.raw.family_grandmother, R.mipmap.family_grandmother));

        WordAdapter adapter = new WordAdapter(this, relatives, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
