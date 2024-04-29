package com.example.day14ce1.abecontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.abemodel.AbeEmployee;
import com.example.day14ce1.abeservice.AbeEmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class AbeEmployeeController {
    @Autowired
    AbeEmployeeService employeeService;

    @PostMapping("/employee")
    public AbeEmployee addEmployee(@RequestBody AbeEmployee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<AbeEmployee> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<AbeEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
