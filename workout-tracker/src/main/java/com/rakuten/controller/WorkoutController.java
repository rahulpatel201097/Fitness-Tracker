package com.rakuten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Workout;
import com.rakuten.service.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	@Autowired
	WorkoutService workoutService;
	
	@PostMapping
	void post(@RequestBody Workout workout) {
		System.out.println(workout.getTitle());
		workoutService.save(workout);
	}
	
	@GetMapping
	List<Workout> getWorkouts() {
		return workoutService.getAllWorkouts();
	}
	
	@GetMapping("/id")
	Workout getWorkoutById(@RequestParam int id) throws Exception {
		System.out.println(id);
		return workoutService.getWorkoutById(id);
	}
	
	@PutMapping("/update")
	void update(@RequestBody Workout workout) throws Exception {
		workoutService.updateWorkoutById(workout);
	}
	
	@DeleteMapping("/delete")
	void delete(@RequestParam int id) {
		workoutService.deleteWorkoutById(id);
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleException() {}
	
}
