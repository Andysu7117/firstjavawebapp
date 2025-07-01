package dev.andy.firstjavawebapp.workout;

import java.util.List;
import java.util.Objects;
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

    public String getExercise() {
        return this.exercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        
        Workout workout = (Workout) o;
        return Objects.equals(sets, workout.getSets()) && Objects.equals(exercise, workout.getExercise());
    }
}
