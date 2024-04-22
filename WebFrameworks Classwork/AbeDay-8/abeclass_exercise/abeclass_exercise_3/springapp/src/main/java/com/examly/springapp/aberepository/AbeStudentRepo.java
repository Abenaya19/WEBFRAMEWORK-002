package com.examly.springapp.aberepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.abemodel.AbeStudent;
import java.util.List;

@Repository
public interface AbeStudentRepo extends JpaRepository<AbeStudent, Long> {

    List<Student> findByMarksGreaterThan(int mark);

    List<Student> findByMarksLessThan(int mark);

}
