package com.example.springapp.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.abemodel.AbePerson;
import java.util.List;


@Repository
public interface AbePersonRepo extends JpaRepository<AbePerson,Integer>{

    List<Person> findByNameStartingWith(String name);
    List<Person> findByNameEndingWith(String name);
    
}
