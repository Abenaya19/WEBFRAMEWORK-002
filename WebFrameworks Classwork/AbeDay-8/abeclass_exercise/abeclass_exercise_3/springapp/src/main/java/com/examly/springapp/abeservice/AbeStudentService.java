package com.examly.springapp.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.abemodel.AbeStudent;
import com.examly.springapp.aberepository.AbeStudentRepo;

@Service
public class AbeStudentService {
    @Autowired
    private AbeStudentRepo studentRepo;

    public boolean post(AbeStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AbeStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AbeStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
