package com.examly.abeclass_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.abeclass_exercise_1.abemodel.AbePerson;
import com.examly.abeclass_exercise_1.abeservice.AbePersonService;

@RestController
public class AbePersonController {

     @Autowired
     public AbePersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AbePerson> postMethodName(@RequestBody AbePerson entity) {

          AbePerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<AbePerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AbePerson>> getMethodName() {

          List<AbePerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AbePerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AbePerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AbePerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}