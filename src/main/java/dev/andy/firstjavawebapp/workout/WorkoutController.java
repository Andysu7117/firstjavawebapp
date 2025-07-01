package dev.andy.firstjavawebapp.workout;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return workoutRepository.findById(id);
    }
    
}
