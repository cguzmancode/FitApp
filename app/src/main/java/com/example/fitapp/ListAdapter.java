package com.example.fitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;


    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element, parent, false);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items) {
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView exerciseName, exerciseSet;
        ImageButton deleteExercise;

        ViewHolder(View itemView){
            super(itemView);
            exerciseName = itemView.findViewById(R.id.exerciseName);
            exerciseSet = itemView.findViewById(R.id.exerciseSets);
            deleteExercise = itemView.findViewById(R.id.deleteExerciseButton);
        }


        //definimos que dato va a tener cada item de exercise_item.xml

        void bindData(final ListElement item){
            exerciseName.setText(item.getExerciseName());
            exerciseSet.setText(item.getExerciseSet());

        }
    }
}
