package dev.andy.firstjavawebapp.workout;

import java.time.LocalDateTime;

public record Set(
    Integer id,
    String exercise,
    Integer reps,
    LocalDateTime setStarted,
    LocalDateTime setCompleted,
    Integer duration
) {}