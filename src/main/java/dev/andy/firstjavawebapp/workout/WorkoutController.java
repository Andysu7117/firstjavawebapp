package dev.andy.firstjavawebapp.workout;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    private WorkoutRepository workoutRepository;

    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }
    
    @GetMapping("")
    List<Workout> findAll() {
        return workoutRepository.findAll();
    }

    @GetMapping("/{id}")
    Workout findById(@PathVariable("id") Integer id) {
        Optional<Workout> workout = workoutRepository.findById(id);
        if (workout.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return workout.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void createWorkout(@RequestBody Workout workout) {
        workoutRepository.createNewWorkout(workout);
    }
    

    @GetMapping("/{id}/sets")
    List<WorkoutSet> findAllSets(@PathVariable("id") Integer id) {
        Optional<List<WorkoutSet>> sets = workoutRepository.findAllSets(id);
        if (sets.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return sets.get();
    }
}
