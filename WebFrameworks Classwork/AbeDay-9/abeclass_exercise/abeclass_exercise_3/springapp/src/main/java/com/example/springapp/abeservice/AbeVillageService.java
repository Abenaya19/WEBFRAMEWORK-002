package com.example.springapp.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.AbeVillage;
import com.example.springapp.aberepository.AbeVillageRepo;

@Service
public class AbeVillageService {
    @Autowired
    private AbeVillageRepo rep;

    public boolean post(AbeVillage person)
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

    public AbeVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AbeVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<Village> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
