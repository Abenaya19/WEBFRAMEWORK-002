package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.abemodel.AbeRecipe;
import java.util.List;


@Repository
public interface AbeRecipeRepo extends JpaRepository<AbeRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<AbeRecipe> findByProduct(String name);
    
}
