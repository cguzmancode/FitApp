package com.example.fitapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class WorkoutFragment extends Fragment {

   List<ListElement> elements;
   RecyclerView recyclerViewExercise;
   ListAdapter listAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workout, container, false);
        recyclerViewExercise = view.findViewById(R.id.recyclerView);
        elements=new ArrayList<>();
        //cargar la lista
        loadList();
        //mostar lista
        showData();
        return view;
    }

    private void showData() {
        listAdapter = new ListAdapter(elements, getContext());
        recyclerViewExercise.setHasFixedSize(true);
        recyclerViewExercise.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewExercise.setAdapter(listAdapter);
    }


    public void loadList(){
        elements.add(new ListElement("Press Banca", "3"));
        elements.add(new ListElement("Sentadilla", "6"));
        elements.add(new ListElement("Curl Biceps", "2"));
        elements.add(new ListElement("Peso Muerto", "7"));
        elements.add(new ListElement("Peso Muerto Rumano", "3"));
    }





}