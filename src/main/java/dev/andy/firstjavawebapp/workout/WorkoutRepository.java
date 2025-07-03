package dev.andy.firstjavawebapp.workout;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class WorkoutRepository {
    private List<Workout> workouts = new ArrayList<>();

    List<Workout> findAll() {
        return workouts;
    }

    Workout findById(Integer id) {
        return workouts.stream()
                .filter(workout -> workout.getId() == id)
                .findFirst()
                .get();
    }

    @PostConstruct
    private void init() {
        workouts.add(new Workout(1,
                        "Workout1"));
        workouts.add(new Workout(2,
                        "Workout2"));
    }
}
