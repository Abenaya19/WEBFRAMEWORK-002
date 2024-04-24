package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.AbeStudent;
import com.example.relation.service.AbeStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AbeStudentController {
    public AbeStudentService studentService;
    public AbeStudentController(AbeStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AbeStudent postMethodName(@RequestBody AbeStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AbeStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
