package com.example.springapp.abeservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.AbePerson;
import com.example.springapp.aberepository.AbePersonRepo;

@Service
public class AbePersonService {
    @Autowired
    private AbePersonRepo rep;

    public boolean post(AbePerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AbePerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AbePerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
