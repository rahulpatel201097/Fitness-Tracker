package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}
