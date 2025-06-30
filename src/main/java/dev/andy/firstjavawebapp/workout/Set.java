package dev.andy.firstjavawebapp.workout;

import java.time.LocalDateTime;

public class Set {
    private Integer reps;
    private LocalDateTime setStarted;
    private LocalDateTime setCompleted;
    private Integer duration;

    public Set(Integer reps, LocalDateTime setStarted, LocalDateTime setCompleted, Integer duration) {
        this.reps = reps;
        this.setStarted = setStarted;
        this.setCompleted = setCompleted;
        this.duration = duration;
    }

    public Integer getReps() {
        return this.reps;
    }

    public LocalDateTime getStarted() {
        return this.setStarted;
    }

    public LocalDateTime getCompleted() {
        return this.setCompleted;
    }

    public Integer getDuration() {
        return this.duration;
    }
}
