package com.example.abeday5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abeday5cw2.model.AbeEmployee;


@Repository
public interface AbeEmployeeRepo extends JpaRepository<AbeEmployee,Integer>{
    
}
