package dev.andy.firstjavawebapp.workout;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Workout {
    private List<Set> sets = new ArrayList<>();
    private String workoutName;

    public Workout(List<Set> sets, String workOutName) {
        this.sets = sets;
        this.workoutName = workOutName;
    }

    public List<Set> getSets() {
        return this.sets;
    }

    public String getWorkoutName() {
        return this.workoutName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Workout workout = (Workout) o;
        return Objects.equals(sets, workout.getSets()) && Objects.equals(workoutName, workout.getWorkoutName());
    }

    @Override
    public String toString() {
        return "Workout{" +
                "WorkoutName=" + workoutName +
                ", sets=" + sets +
                "}";
    }
}
