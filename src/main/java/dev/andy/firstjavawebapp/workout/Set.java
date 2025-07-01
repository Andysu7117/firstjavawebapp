package dev.andy.firstjavawebapp.workout;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Set set = (Set) o;
        if (Objects.equals(reps, set.getReps())) {
            return true;
        }

        if (Objects.equals(setStarted, set.getStarted())) {
            return true;
        }

        if (Objects.equals(setCompleted, set.getCompleted())) {
            return true;
        }

        if (Objects.equals(duration, set.getDuration())) {
            return true;
        }

        return false;
    }
}
