package com.examly.springapp.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.abemodel.AbeDoor;
import com.examly.springapp.aberepository.AbeDoorRepo;

@Service
public class AbeDoorService {
    @Autowired
    private AbeDoorRepo doorRepo;

    public AbeDoor postData(AbeDoor door) {
        return doorRepo.save(door);
    }

    public List<AbeDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AbeDoor updateDetail(int doorid, AbeDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AbeDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AbeDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AbeDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}