package com.examly.abeclass_exercise_2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.abeclass_exercise_2.abemodel.AbeCourse;

@Repository
public interface AbeCourseRepo extends JpaRepository<AbeCourse, Integer> {

     List<AbeCourse> findByCourseName(String courseName);

}