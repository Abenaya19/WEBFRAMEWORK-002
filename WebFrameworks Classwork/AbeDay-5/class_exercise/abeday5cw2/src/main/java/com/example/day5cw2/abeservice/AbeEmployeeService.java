package com.example.abeday5cw2.service;

import com.example.abeday5cw2.model.AbeEmployee;
import com.example.abeday5cw2.repository.AbeEmployeeRepo;

@Service
public class AbeEmployeeService {
    public AbeEmployeeRepo employeeRepo;
    public AbeEmployeeService(AbeEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AbeEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AbeEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
