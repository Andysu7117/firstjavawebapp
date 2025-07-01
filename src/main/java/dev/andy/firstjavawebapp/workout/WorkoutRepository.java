package dev.andy.firstjavawebapp.workout;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@Repository
public class WorkoutRepository {
    private List<Workout> workouts = new ArrayList<>();

    List<Workout> findAll() {
        return workouts;
    }

    Workout findById(Integer id) {
        return workouts.stream()
                .filter(workout -> workout.id() == id)
                .findFirst()
                .get();
    }

    @PostConstruct
    private void init() {
        Set set1 = new Set(1, "Bicep Curls", 8, LocalDateTime.now(), LocalDateTime.now().plus(42, ChronoUnit.SECONDS), 42);
		Set set2 = new Set(2, "Bicep Curls", 8, LocalDateTime.now().plus(2, ChronoUnit.MINUTES), LocalDateTime.now().plus(3, ChronoUnit.MINUTES), 60);
        workouts.add(new Workout(1,
                        "Workout1", 
                        List.of(set1)));
        workouts.add(new Workout(2,
                        "Workout2", 
                        List.of(set2)));
    }
}
