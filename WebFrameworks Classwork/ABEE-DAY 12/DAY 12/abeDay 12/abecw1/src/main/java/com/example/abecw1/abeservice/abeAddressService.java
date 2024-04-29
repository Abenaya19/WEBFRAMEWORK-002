package com.example.abecw1.abeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abecw1.abemodel.abeAddress;
import com.example.abecw1.aberepository.abeAddressRepo;
import com.example.abecw1.aberepository.abeEmployeeRepo;

@Service
public class abeAddressService {
    @Autowired
    abeAddressRepo addressRepo;
    @Autowired
    abeEmployeeRepo employeeRepo;
    public abeAddress setAddressById(int id,abeAddress address)
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
