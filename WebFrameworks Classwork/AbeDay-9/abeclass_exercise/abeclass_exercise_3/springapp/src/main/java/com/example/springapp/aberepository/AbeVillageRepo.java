package com.example.springapp.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.abemodel.AbeVillage;
import java.util.List;

@Repository
public interface AbeVillageRepo extends JpaRepository<AbeVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AbeVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AbeVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AbeVillage> findByPopulation(int population);

}
