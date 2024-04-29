package com.example.day14ce1.abeservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.abemodel.AbePayroll;
import com.example.day14ce1.aberepository.AbePayrollRepo;

@Service
public class AbePayrollService {
    @Autowired
    AbePayrollRepo payrollRepo;

    public AbePayroll addPayroll(Long id,AbePayroll payroll)
    {
        AbePayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<AbePayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
