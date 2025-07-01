package dev.andy.firstjavawebapp.workout;

import java.util.List;

public record Workout(
    Integer id,
    String workoutName,
    List<Set> sets
) {}