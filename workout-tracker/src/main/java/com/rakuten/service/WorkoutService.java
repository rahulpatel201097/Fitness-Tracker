package com.rakuten.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.Workout;
import com.rakuten.repository.WorkoutRepository;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	public void save(Workout workout) {
		workoutRepository.save(workout);
		System.out.println("workout saved");
	}
	
	public List<Workout> getAllWorkouts() {
		return workoutRepository.findAll();
	}
	
	public Workout getWorkoutById(int id) throws Exception {
		System.out.println("Get workout by id");
		Optional<Workout> optional = workoutRepository.findById(id);
		if(optional.isEmpty()) {
			throw new Exception();
		}
		return optional.get();
	}
	
	public void deleteWorkoutById(int id) {
		System.out.println("workout deleted");
		workoutRepository.deleteById(id);
	}
	
	public void updateWorkoutById(Workout workout) throws Exception {
		if(!workoutRepository.existsById(workout.getId())) {
			throw new Exception();
		}
		workoutRepository.save(workout);
		System.out.println("Data Updated");
	}
	
}
