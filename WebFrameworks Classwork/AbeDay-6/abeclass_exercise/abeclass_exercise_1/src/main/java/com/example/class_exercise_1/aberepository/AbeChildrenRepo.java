package com.example.abeclass_exercise_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abeclass_exercise_1.model.AbeChildren;

public interface AbeChildrenRepo extends JpaRepository<AbeChildren, Integer> {

}