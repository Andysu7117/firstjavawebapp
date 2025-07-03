package dev.andy.firstjavawebapp;

import dev.andy.firstjavawebapp.workout.Workout;
import dev.andy.firstjavawebapp.workout.WorkoutSet;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstjavawebappApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(FirstjavawebappApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FirstjavawebappApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			WorkoutSet set1 = new WorkoutSet(1, "Bicep Curls", 8, LocalDateTime.now(), LocalDateTime.now().plus(42, ChronoUnit.SECONDS), 42);
			WorkoutSet set2 = new WorkoutSet(2, "Bicep Curls", 8, LocalDateTime.now().plus(2, ChronoUnit.MINUTES), LocalDateTime.now().plus(3, ChronoUnit.MINUTES), 60);
			Workout workout = new Workout(1, "Workout1");
			workout.addSet(set1);
			workout.addSet(set2);
			logger.info("Workout" + workout);
		};
	}

}