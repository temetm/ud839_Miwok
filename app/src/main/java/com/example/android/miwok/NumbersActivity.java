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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti", R.mipmap.number_one));
        numbers.add(new Word("two", "otiiko", R.mipmap.number_two));
        numbers.add(new Word("three", "tolookosu", R.mipmap.number_three));
        numbers.add(new Word("four", "oyyisa", R.mipmap.number_four));
        numbers.add(new Word("five", "massokka", R.mipmap.number_five));
        numbers.add(new Word("six", "temmokka", R.mipmap.number_six));
        numbers.add(new Word("seven", "kenekaku", R.mipmap.number_seven));
        numbers.add(new Word("eight", "kawinta", R.mipmap.number_eight));
        numbers.add(new Word("nine", "wo’e", R.mipmap.number_nine));
        numbers.add(new Word("ten", "na’aacha", R.mipmap.number_ten));

        WordAdapter adapter = new WordAdapter(this, numbers, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



        //Log.v("Teme words array", "Position 4 = " + words.get(4));
    }
}
