package com.geektech.continents.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.continents.R;
import com.geektech.continents.model.Countries;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private ArrayList<Countries> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_countries, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void addItems(ArrayList<Countries> countries){
        list.addAll(countries);
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView city;
        private ImageView flag;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            city = itemView.findViewById(R.id.tv_content_city);
            flag = itemView.findViewById(R.id.iv_continent);
        }

        public void onBind(Countries countries) {

            name.setText(countries.getName());
            city.setText(countries.getCity());
            flag.setImageResource(countries.getFlag());
        }
    }
}
