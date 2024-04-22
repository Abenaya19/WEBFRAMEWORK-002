package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.abemodel.AbePerson;
import com.example.springapp.aberepository.AbePersonRepo;

@Service
public class AbePersonService {
    public AbePersonRepo personRepo;

    public AbePersonService(AbePersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AbePerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AbePerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
