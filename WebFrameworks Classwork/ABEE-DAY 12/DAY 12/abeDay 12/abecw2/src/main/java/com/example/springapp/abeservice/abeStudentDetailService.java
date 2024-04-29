package com.example.springapp.abeservice;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.abeStudentDetail;
import com.example.springapp.aberepository.abeStudentDetailRepository;
import com.example.springapp.aberepository.abeStudentRepository;

@Service
public class abeStudentDetailService {
    @Autowired
    abeStudentDetailRepository studentDetailRepository;
    @Autowired
    abeStudentRepository studentRepository;
    public abeStudentDetail addStudentDetail(int id,abeStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }

}
