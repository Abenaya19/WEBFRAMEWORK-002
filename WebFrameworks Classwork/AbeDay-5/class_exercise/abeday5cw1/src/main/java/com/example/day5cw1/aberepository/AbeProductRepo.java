package com.example.abeday5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abeday5cw1.model.Product;

@Repository
public interface AbeProductRepo extends JpaRepository<AbeProduct,Integer>{
    
}
