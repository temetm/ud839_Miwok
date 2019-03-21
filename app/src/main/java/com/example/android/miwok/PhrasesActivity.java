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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ListView listLayout = (ListView) findViewById(R.id.list);
        listLayout.setBackgroundColor(getResources().getColor(R.color.category_phrases));

        ArrayList<Word> Phrases = new ArrayList<Word>();
        Phrases.add(new Word("Where are you going?", "minto wuksus"));
        Phrases.add(new Word("What is your name?", "tinnә oyaase'nә"));
        Phrases.add(new Word("My name is...", "oyaaset..."));
        Phrases.add(new Word("How are you feeling?", "michәksәs?"));
        Phrases.add(new Word("I’m feeling good.", "kuchi achit"));
        Phrases.add(new Word("Are you coming?", "әәnәs'aa?"));
        Phrases.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        Phrases.add(new Word("I’m coming.", "әәnәm"));
        Phrases.add(new Word("Let’s go.", "yoowutis"));
        Phrases.add(new Word("Come here.", "әnni'nem"));

        WordAdapter adapter = new WordAdapter(this, Phrases, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
