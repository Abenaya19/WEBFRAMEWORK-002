package com.examly.abeclass_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.abeclass_exercise_2.abemodel.AbeCourse;
import com.examly.abeclass_exercise_2.aberepository.AbeCourseRepo;

@Service
public class AbeCourseService {

     @Autowired
     public AbeCourseRepo courseRepo;

     public AbeCourse SaveEntity(AbeCourse entity) {
          return courseRepo.save(entity);

     }

     public List<AbeCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<AbeCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
