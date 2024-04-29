package com.example.springapp.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.abeStudent;
import com.example.springapp.aberepository.abeStudentRepository;

@Service
public class abeStudentService {
    @Autowired
    abeStudentRepository studentRepository;
    public abeStudent addStudents(abeStudent student)
    {
        return studentRepository.save(student);
    }
    public List<abeStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<abeStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<abeStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
