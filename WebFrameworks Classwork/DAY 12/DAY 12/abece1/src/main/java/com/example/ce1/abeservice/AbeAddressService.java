package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abece1.model.AbeAddress;
import com.example.abece1.repository.AbeAddressRepo;
import com.example.abece1.repository.AbeEmployeeRepo;

@Service
public class AbeAddressService {
    @Autowired
    AbeAddressRepo addressRepo;
    @Autowired
    AbeEmployeeRepo employeeRepo;
    public Address setAddressById(int id,Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
