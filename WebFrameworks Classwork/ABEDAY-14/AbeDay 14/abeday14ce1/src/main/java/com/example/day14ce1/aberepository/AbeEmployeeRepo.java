package com.example.day14ce1.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.abemodel.AbeEmployee;

@Repository
public interface AbeEmployeeRepo extends JpaRepository<AbeEmployee,Long> {
    
}
