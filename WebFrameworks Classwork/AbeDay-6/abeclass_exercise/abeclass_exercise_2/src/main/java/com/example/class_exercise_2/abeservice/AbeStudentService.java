package com.example.abeclass_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abeclass_exercise_2.abemodel.AbeStudent;
import com.example.abeclass_exercise_2.aberepository.AbeStudentRepo;

@Service
public class AbeStudentService {

     @Autowired
     public AbeStudentRepo studentRepo;

     public List<AbeStudent> getAll() {
          return studentRepo.findAll();
     }

     public AbeStudent post(AbeStudent student) {
          return studentRepo.save(student);
     }

     public List<AbeStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
