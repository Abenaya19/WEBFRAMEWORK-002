package com.example.abecw1.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abecw1.abemodel.abeEmployee;
import com.example.abecw1.aberepository.abeEmployeeRepo;

@Service
public class abeEmployeeService {
    @Autowired
    abeEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public abeEmployee setEmployee(abeEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<abeEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<abeEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
