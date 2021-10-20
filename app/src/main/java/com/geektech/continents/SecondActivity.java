package com.geektech.continents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geektech.continents.adapter.CountryAdapter;
import com.geektech.continents.model.Countries;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private CountryAdapter adapter = new CountryAdapter();
    private ArrayList<Countries> list = new ArrayList<>();
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        id = getIntent().getIntExtra("key",1);

        if (id == 1){

            list.add(new Countries("Kyrgyzstan","Bishkek",R.drawable.test));
            list.add(new Countries("Kyrgyzstan","Bishkek",R.drawable.test));
            list.add(new Countries("Kyrgyzstan","Bishkek",R.drawable.test));
            list.add(new Countries("Kyrgyzstan","Bishkek",R.drawable.test));
            list.add(new Countries("Kyrgyzstan","Bishkek",R.drawable.test));
        }

        if (id== 2){
            list.add(new Countries("Russia","Bishkek",R.drawable.test));
            list.add(new Countries("Russia","Bishkek",R.drawable.test));
            list.add(new Countries("Russia","Bishkek",R.drawable.test));
            list.add(new Countries("Russia","Bishkek",R.drawable.test));
            list.add(new Countries("Russia","Bishkek",R.drawable.test));
            list.add(new Countries("Russia","Bishkek",R.drawable.test));

        }
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);


    }
}