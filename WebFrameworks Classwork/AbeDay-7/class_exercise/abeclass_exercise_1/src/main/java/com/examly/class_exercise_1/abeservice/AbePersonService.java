package com.examly.abeclass_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.abeclass_exercise_1.abemodel.AbePerson;
import com.examly.abeclass_exercise_1.aberepository.AbePersonRepo;

@Service
public class AbePersonService {

     @Autowired
     public AbePersonRepo personRepo;

     public AbePerson SaveEntity(AbePerson entity) {
          return personRepo.save(entity);

     }

     public List<AbePerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AbePerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
