package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abebidirection.abemodel.AbeStudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<AbeStudentInfo,Integer>{
    
}