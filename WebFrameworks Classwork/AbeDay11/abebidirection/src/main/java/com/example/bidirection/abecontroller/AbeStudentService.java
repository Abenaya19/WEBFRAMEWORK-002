package com.example.abebidirection.abecontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.abebidirection.model.AbeStudent;
import com.example.abebidirection.model.AbeStudentInfo;
import com.example.abebidirection.service.AbeStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AbeStudentService {
    public AbeStudentService studentService;
    public StudentController(AbeStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public AbeStudent postMethodName(@RequestBody AbeStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AbeStudentInfo postMethodName(@RequestBody AbeStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AbeStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}