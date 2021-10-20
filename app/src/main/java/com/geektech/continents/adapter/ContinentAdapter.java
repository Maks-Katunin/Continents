package com.geektech.continents.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.continents.OnItemClickListener;
import com.geektech.continents.R;
import com.geektech.continents.model.Continents;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ViewHolder> {

    private ArrayList<Continents> list = new ArrayList<>();
    private OnItemClickListener onItemClickListener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_continents, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addItem(ArrayList<Continents> continents){
        list.addAll(continents);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_continent);
        }

        public void onBind(Continents continents) {

            name.setText(continents.getName());
            itemView.setOnClickListener(view -> {
                onItemClickListener.click(continents);
            });

        }
    }
}
