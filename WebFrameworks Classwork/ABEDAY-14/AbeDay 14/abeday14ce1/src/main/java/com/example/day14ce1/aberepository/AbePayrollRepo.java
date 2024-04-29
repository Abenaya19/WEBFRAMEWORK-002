package com.example.day14ce1.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.abemodel.AbePayroll;

@Repository
public interface AbePayrollRepo extends JpaRepository<AbePayroll,Long> {
    
}
