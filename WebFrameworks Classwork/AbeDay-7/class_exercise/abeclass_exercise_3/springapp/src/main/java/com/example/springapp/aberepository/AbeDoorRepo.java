package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.abemodel.AbeDoor;
import java.util.List;

@Repository
public interface AbeDoorRepo extends JpaRepository<AbeDoor,Integer>{

    List<Door> findByDoorId(int doorId);
    List<Door> findByAccessType(String accessType);
    
}
