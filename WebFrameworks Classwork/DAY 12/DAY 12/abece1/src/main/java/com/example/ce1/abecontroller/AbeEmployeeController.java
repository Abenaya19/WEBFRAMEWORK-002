package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abece1.model.AbeEmployee;
import com.example.abece1.service.AbeEmployeeService;

@RestController
public class AbeEmployeeController {
    @Autowired
    AbeEmployeeService employeeService;

    @PostMapping("/employee")
    public AbeEmployee setMethod(@RequestBody AbeEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AbeEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AbeEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
