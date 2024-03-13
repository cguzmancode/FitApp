package com.example.fitapp;

import android.widget.ImageButton;

public class ListElement {
    public String exerciseName;
    public String exerciseSet;


    public ListElement(String exerciseName, String exerciseSet) {
        this.exerciseName = exerciseName;
        this.exerciseSet = exerciseSet;

    }


    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseSet() {
        return exerciseSet;
    }

    public void setExerciseSet(String exerciseSet) {
        this.exerciseSet = exerciseSet;
    }
}
