package com.example.abecw1.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abecw1.abemodel.abeBook;
@Repository
public interface abeBookRepository extends JpaRepository<abeBook, Long> {
}
