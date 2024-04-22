package com.examly.abeclass_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.abeclass_exercise_1.abemodel.AbePerson;

@Repository
public interface AbePersonRepo extends JpaRepository<AbePerson, Integer> {

     List<Person> findByAge(int byAge);
}