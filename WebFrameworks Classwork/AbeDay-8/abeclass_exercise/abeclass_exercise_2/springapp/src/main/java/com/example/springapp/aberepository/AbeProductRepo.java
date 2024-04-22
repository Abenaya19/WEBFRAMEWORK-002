package com.example.springapp.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.abemodel.AbeProduct;
import java.util.List;


@Repository
public interface AbeProductRepo extends JpaRepository<AbeProduct,Integer>{

    List<Product> findByProductNameStartingWith(String name);
    List<Product> findByProductNameEndingWith(String name);
    
}
