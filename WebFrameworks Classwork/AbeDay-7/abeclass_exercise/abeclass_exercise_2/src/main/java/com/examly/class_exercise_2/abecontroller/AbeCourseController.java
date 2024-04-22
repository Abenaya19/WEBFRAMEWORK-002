package com.examly.abeclass_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.abeclass_exercise_2.abemodel.AbeCourse;
import com.examly.abeclass_exercise_2.abeservice.AbeCourseService;

@RestController
public class AbeCourseController {

     @Autowired
     public AbeCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AbeCourse> postMethodName(@RequestBody AbeCourse entity) {

          AbeCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AbeCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AbeCourse>> getMethodName() {

          List<AbeCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AbeCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AbeCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AbeCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}