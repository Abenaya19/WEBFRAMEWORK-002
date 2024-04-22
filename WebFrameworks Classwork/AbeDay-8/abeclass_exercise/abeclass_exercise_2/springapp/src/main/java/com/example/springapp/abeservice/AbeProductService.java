package com.example.springapp.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.AbeProduct;
import com.example.springapp.aberepository.AbeProductRepo;

@Service
public class AbeProductService {
    @Autowired
    private AbeProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AbeProduct person)
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

    public List<AbeProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AbeProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AbeProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
