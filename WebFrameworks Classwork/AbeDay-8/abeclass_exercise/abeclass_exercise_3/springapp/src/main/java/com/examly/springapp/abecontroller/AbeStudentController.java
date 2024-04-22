package com.examly.springapp.abecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.abemodel.AbeStudent;
import com.examly.springapp.abeservice.AbeStudentService;

@RestController
public class AbeStudentController {
    @Autowired
    private AbeStudentService studentService;

    @PostMapping("/Student")
    public ResponseEntity<AbeStudent> post(@RequestBody AbeStudent student) {
        if (studentService.post(student)) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Student/marksGreaterThan/{mark}")
    public ResponseEntity<List<AbeStudent>> getAll(@PathVariable int mark) {
        List<AbeStudent> li = studentService.start(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Student/marksLessThan/{mark}")
    public ResponseEntity<List<AbeStudent>> getbyAge(@PathVariable int mark) {
        List<AbeStudent> li = studentService.end(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
