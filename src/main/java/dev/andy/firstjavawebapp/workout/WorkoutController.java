package dev.andy.firstjavawebapp.workout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    
    @GetMapping("/hello")
    String home() {
        return "Welcome to your workouts";
    }
}
