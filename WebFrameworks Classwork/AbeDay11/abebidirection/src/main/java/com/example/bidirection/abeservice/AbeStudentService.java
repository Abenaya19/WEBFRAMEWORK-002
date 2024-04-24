package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.Student;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.repository.StudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class AbeStudentService {
    public AbeStudentRepository studentRepository;
    public AbeStudentInfoRepository studentInfoRepository;
    public AbeStudentService(AbeStudentRepository studentRepository,AbeStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AbeStudent saveStudent(AbeStudent student)
    {
        return studentRepository.save(student);
    }
    public AbeStudentInfo saveStudentInfo(AbeStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AbeStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
