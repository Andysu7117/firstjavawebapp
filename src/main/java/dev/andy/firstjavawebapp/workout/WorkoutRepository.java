package dev.andy.firstjavawebapp.workout;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WorkoutRepository {
    private Map<Integer, Workout> workouts = new HashMap<>();

    List<Workout> findAll() {
        return new ArrayList<>(workouts.values());
    }

    Optional<Workout> findById(Integer id) {
        return Optional.ofNullable(workouts.get(id));
    }

    void createNewWorkout(Workout workout) {
        workouts.put(workout.getId(), workout);
    }

    void updateWorkout(Integer id, Workout updatedWorkout) {
        Workout existing = workouts.get(id);

        if (updatedWorkout.getWorkoutName() != null) {
            existing.setWorkoutName(updatedWorkout.getWorkoutName());
        }
    }

    Optional<List<WorkoutSet>> findAllSets(Integer id) {
        return Optional.ofNullable(workouts.get(id).getSets());
    }

    @PostConstruct
    private void init() {
        workouts.put(1, new Workout(1,
                        "Workout1"));
        workouts.put(2, new Workout(2,
                        "Workout2"));
    }
}
