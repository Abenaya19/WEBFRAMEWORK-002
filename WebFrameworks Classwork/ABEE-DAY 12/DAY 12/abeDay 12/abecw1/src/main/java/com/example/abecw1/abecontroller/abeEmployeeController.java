package com.example.abecw1.abecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abecw1.abemodel.abeEmployee;
import com.example.abecw1.abeservice.abeEmployeeService;

@RestController
public class abeEmployeeController {
    @Autowired
    abeEmployeeService employeeService;

    @PostMapping("/employee")
    public abeEmployee setMethod(@RequestBody abeEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<abeEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<abeEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
