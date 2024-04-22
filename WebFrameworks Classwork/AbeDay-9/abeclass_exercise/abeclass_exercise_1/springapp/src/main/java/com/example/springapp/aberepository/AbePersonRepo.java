package com.example.springapp.aberepository
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.abemodel.AbePerson;

public interface AbePersonRepo extends JpaRepository<AbePerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AbePerson> findByAge(int age);
}
