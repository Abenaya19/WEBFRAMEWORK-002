package com.example.abecw1.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abecw1.abemodel.abeAuthor;
@Repository
public interface abeAuthorRepository extends JpaRepository<abeAuthor, Long> {
}
