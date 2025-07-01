package dev.andy.firstjavawebapp.workout;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WorkoutController {
    private WorkoutRepository workoutRepository;

    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }
    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/api/workouts")
    List<Workout> findAll() {
        return workoutRepository.findAll();
    }

    @GetMapping("/hello")
    String home() {
        return "Welcome to your workouts";
    }
}
