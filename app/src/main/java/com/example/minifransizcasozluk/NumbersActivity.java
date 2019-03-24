package com.example.minifransizcasozluk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {
List<language> languages=new ArrayList<>();
ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        languages.add(new language("bir","one",R.drawable.bir,R.raw.ses));
        languages.add(new language("iki","two",R.drawable.iki,R.raw.ses));
        languages.add(new language("üç","three",R.drawable.uc,R.raw.ses));
        languages.add(new language("dört","four",R.drawable.dort,R.raw.ses));
        languages.add(new language("beş","five",R.drawable.bes,R.raw.ses));

        LanguageAdapter adapter=new LanguageAdapter(this,languages,R.color.category_numbers);
        liste=(ListView)findViewById(R.id.listV);
        liste.setAdapter(adapter);
    }
}
