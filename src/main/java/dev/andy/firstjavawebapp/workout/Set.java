package dev.andy.firstjavawebapp.workout;

import java.time.LocalDateTime;
import java.util.Objects;

public class Set {
    private String exercise;
    private Integer reps;
    private LocalDateTime setStarted;
    private LocalDateTime setCompleted;
    private Integer duration;

    public Set(String exercise, Integer reps, LocalDateTime setStarted, LocalDateTime setCompleted, Integer duration) {
        this.exercise = exercise;
        this.reps = reps;
        this.setStarted = setStarted;
        this.setCompleted = setCompleted;
        this.duration = duration;
    }

    public String getExercise() {
        return this.exercise;
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
        if (!Objects.equals(exercise, set.getExercise())) {
            return false;
        }

        if (!Objects.equals(reps, set.getReps())) {
            return false;
        }

        if (!Objects.equals(setStarted, set.getStarted())) {
            return false;
        }

        if (!Objects.equals(setCompleted, set.getCompleted())) {
            return false;
        }

        if (!Objects.equals(duration, set.getDuration())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Set{" +
                "Exercise=" + exercise +
                ", Reps=" + reps +
                ", Started=" + setStarted +
                ", Completed" + setCompleted +
                ", Duration" + duration +
                "}";
    }
}
