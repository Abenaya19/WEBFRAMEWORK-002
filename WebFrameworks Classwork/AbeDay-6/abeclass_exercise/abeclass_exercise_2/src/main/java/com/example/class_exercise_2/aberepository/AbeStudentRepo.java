package com.example.abeclass_exercise_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abeclass_exercise_2.abemodel.AbeStudent;

@Repository
public interface AbeStudentRepo extends JpaRepository<AbeStudent, Integer> {

}