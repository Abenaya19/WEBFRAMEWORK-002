package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.AbeDoor;
import com.example.springapp.aberepository.AbeDoorRepo;

@Service
public class AbeDoorService {
    @Autowired
    private AbeDoorRepo rep;

    public boolean post(AbeDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AbeDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AbeDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AbeDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
