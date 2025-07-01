package dev.andy.firstjavawebapp.workout;

import java.util.List;

public record Workout(
    List<Set> sets,
    String workoutName
) {}