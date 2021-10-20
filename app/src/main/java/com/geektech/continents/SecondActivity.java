package com.geektech.continents;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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


        id = getIntent().getIntExtra("key", 1);

        switch (id) {


            case 1:

                list.add(new Countries("Абхазия", "Сухум", R.drawable.test));
                list.add(new Countries("Белоруссия", "Минск", R.drawable.test));
                list.add(new Countries("Германия", "Берлин", R.drawable.test));
                list.add(new Countries("Ирак", "Багдад", R.drawable.test));
                list.add(new Countries("Исландия", "Рейкьявик", R.drawable.test));
                list.add(new Countries("Киргизия", "Бишкек", R.drawable.test));
                list.add(new Countries("Латвия", "Рига", R.drawable.test));
                list.add(new Countries("Малайзия", "Куала-Лумпур", R.drawable.test));
                list.add(new Countries("Монголия", "Улан-Батор", R.drawable.test));
                list.add(new Countries("Пакистан", "Исламабад", R.drawable.test));
                break;
            case 2:
                list.add(new Countries("Алжир", "Алжир", R.drawable.test));
                list.add(new Countries("Буркина-Фасо", "Уагадугу", R.drawable.test));
                list.add(new Countries("Гвинея", "Конакри", R.drawable.test));
                list.add(new Countries("Джибути", "Джибути", R.drawable.test));
                list.add(new Countries("Зимбабве", "Хараре", R.drawable.test));
                list.add(new Countries("Камерун", "Яунде", R.drawable.test));
                list.add(new Countries("Ливия", "Триполи", R.drawable.test));
                list.add(new Countries("Марокко", "Рабат", R.drawable.test));
                list.add(new Countries("Нигерия", "Абуджа", R.drawable.test));
                list.add(new Countries("Сомали", "Могадишо", R.drawable.test));
                break;
            case 3:
                list.add(new Countries("Багамы", "Нассау", R.drawable.test));
                list.add(new Countries("Гватемала", "Гватемала", R.drawable.test));
                list.add(new Countries("Коста-Рика", "Сан-Хосе", R.drawable.test));
                list.add(new Countries("Мексика", "Мехико", R.drawable.test));
                list.add(new Countries("Сальвадор", "Сан-Сальвадор", R.drawable.test));
                list.add(new Countries("Сент-Люсия", "Кастри", R.drawable.test));
                list.add(new Countries("Сент-Китс и Невис", "Бастер", R.drawable.test));
                list.add(new Countries("Белиз", "Бельмопан", R.drawable.test));
                list.add(new Countries("Гаити", "Порт-о-Пренс", R.drawable.test));
                list.add(new Countries("Доминика", "Розо", R.drawable.test));
                break;
            case 4:
                list.add(new Countries("Kyrgyzfghgstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyznngstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzvvstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                break;
            case 5:
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzvvstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                list.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.test));
                break;
            case 6:
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                list.add(new Countries("ghnjm,", "Bishkek", R.drawable.test));
                break;
        }
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);


    }
}