package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.Employee;
import com.example.ce1.repository.EmployeeRepo;

@Service
public class AbeEmployeeService {
    @Autowired
    AbeEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AbeEmployee setEmployee(AbeEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AbeEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AbeEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
