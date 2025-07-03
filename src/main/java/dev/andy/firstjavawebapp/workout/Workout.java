package dev.andy.firstjavawebapp.workout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Workout {
    Integer id;
    String workoutName;
    List<WorkoutSet> sets = new ArrayList<>();

    public Workout(Integer id, String workoutName) {
        this.id = id;
        this.workoutName = workoutName;
    }

    public Integer getId() {
        return this.id;
    }

    public String getWorkoutName() {
        return this.workoutName;
    }

    public List<WorkoutSet> getSets() {
        return this.sets;
    }

    public void addSet(WorkoutSet set) {
        sets.add(set);
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        
        Workout workout = (Workout) o;

        if (id != workout.getId()) {
            return false;
        }

        if (!workoutName.equals(workout.getWorkoutName())) {
            return false;
        }

        if (!sets.equals(workout.getSets())) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "WorkoutName=" + workoutName +
                ", sets=" + sets +
                "}";
    }
}