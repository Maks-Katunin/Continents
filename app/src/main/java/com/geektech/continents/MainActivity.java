package com.geektech.continents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.geektech.continents.adapter.ContinentAdapter;
import com.geektech.continents.model.Continents;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ContinentAdapter adapter = new ContinentAdapter();
    private ArrayList<Continents> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview_continent);
        recyclerView.setAdapter(adapter);
        adapter.addItem(list);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void click(Continents continents) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", continents.getId());
                startActivity(intent);
            }
        });
    }

    private void createList() {
        list.add(new Continents("Africa",1));
        list.add(new Continents("America",2));
        list.add(new Continents("Europe",3));
        list.add(new Continents("Asia",4));
    }
}