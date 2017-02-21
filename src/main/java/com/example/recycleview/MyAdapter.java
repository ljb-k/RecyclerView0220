package com.example.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 日不落 on 2017/2/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Dog> mDogList;
    public MyAdapter(List<Dog> mDogList){
        this.mDogList = mDogList;

    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView dogImg;
        TextView dogName;

        public ViewHolder(View itemView) {
            super(itemView);
            dogImg = (ImageView) itemView.findViewById(R.id.dogImg);
            dogName = (TextView) itemView.findViewById(R.id.dogName);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog = mDogList.get(position);
        holder.dogImg.setImageResource(dog.imgId);
        holder.dogName.setText(dog.name);

    }

    @Override
    public int getItemCount() {
        return mDogList.size();
    }


}
