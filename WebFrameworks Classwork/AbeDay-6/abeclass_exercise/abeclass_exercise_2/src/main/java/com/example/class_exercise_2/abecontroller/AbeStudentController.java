package com.example.abeclass_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.abeclass_exercise_2.abemodel.AbeStudent;
import com.example.abeclass_exercise_2.abeservice.AbeStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AbeStudentController {

     @Autowired
     public AbeStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AbeStudent>> getDetails() {
          List<AbeStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AbeStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AbeStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AbeStudent> postMethodName(@RequestBody AbeStudent student) {

          AbeStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AbeStudent>> sortedDetails(@PathVariable String field) {
          List<AbeStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AbeStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AbeStudent>>(list, HttpStatus.OK);

     }
}
