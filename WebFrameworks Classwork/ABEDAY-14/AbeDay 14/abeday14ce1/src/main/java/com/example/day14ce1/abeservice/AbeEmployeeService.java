package com.example.day14ce1.abeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.abemodel.AbeEmployee;
import com.example.day14ce1.aberepository.AbeEmployeeRepo;

@Service

public class AbeEmployeeService {
    @Autowired
    AbeEmployeeRepo employeeRepo;

    public AbeEmployee addEmployee(AbeEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AbeEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<AbeEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
