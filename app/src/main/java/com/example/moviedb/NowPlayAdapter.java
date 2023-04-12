package com.example.moviedb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NowPlayAdapter extends RecyclerView.Adapter<NowPlayAdapter.NowPlayViewHolder>  {

    List<NowPlayModel> nowPlayModelList;

    public NowPlayAdapter(List<NowPlayModel> nowPlayModelList) {
        this.nowPlayModelList = nowPlayModelList;
    }

    @NonNull
    @Override
    public NowPlayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_movie, parent, false);
        return new NowPlayViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NowPlayViewHolder holder, int position) {
        holder.tvGenres.setText(nowPlayModelList.get(position).getPage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NowPlayViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMovie;
        TextView tvGenres, tvName;

        public NowPlayViewHolder(@NonNull View v) {
            super(v);
            ivMovie = v.findViewById(R.id.ivMovie);
            tvName = v.findViewById(R.id.tvName);
            tvGenres = v.findViewById(R.id.tvGenres);


        }
    }
}
