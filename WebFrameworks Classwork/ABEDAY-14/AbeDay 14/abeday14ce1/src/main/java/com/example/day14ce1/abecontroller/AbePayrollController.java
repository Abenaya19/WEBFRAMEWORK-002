package com.example.day14ce1.abecontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.abemodel.AbePayroll;
import com.example.day14ce1.abeservice.AbePayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AbePayrollController {
    @Autowired
    AbePayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public AbePayroll addPayroll(@PathVariable Long employeeId,@RequestBody AbePayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<AbePayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
