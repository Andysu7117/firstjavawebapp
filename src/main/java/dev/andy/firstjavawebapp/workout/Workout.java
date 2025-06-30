package dev.andy.firstjavawebapp.workout;

import java.util.List;
import java.util.ArrayList;

public class Workout {
    private List<Set> sets = new ArrayList<>();
    private String exercise;

    public Workout(List<Set> sets, String exercise) {
        this.sets = sets;
        this.exercise = exercise;
    }

    public List<Set> getSets() {
        return this.sets;
    }

    public String exercise() {
        return this.exercise;
    }
}
