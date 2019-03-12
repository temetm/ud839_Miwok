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

        ArrayList<Family> relatives = new ArrayList<Family>();
        relatives.add(new Family("father", "әpә"));
        relatives.add(new Family("mother", "әṭa"));
        relatives.add(new Family("son", "angsi"));
        relatives.add(new Family("daughter", "tune"));
        relatives.add(new Family("older brother", "taachi"));
        relatives.add(new Family("younger brother", "chalitti"));
        relatives.add(new Family("older sister", "teṭe"));
        relatives.add(new Family("younger sister", "kolliti"));
        relatives.add(new Family("grandfather", "paapa"));
        relatives.add(new Family("grandmother", "ama"));

        FamilyAdapter adapter = new FamilyAdapter(this, relatives);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
