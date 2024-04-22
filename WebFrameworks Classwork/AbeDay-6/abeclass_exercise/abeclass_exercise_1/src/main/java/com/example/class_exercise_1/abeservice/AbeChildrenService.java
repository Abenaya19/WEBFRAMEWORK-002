package com.example.abeclass_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.abeclass_exercise_1.abemodel.AbeChildren;
import com.example.abeclass_exercise_1.aberepository.AbeChildrenRepo;

@Service
public class AbeChildrenService {

     @Autowired
     public AbeChildrenRepo childrenRepo;

     public List<AbeChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AbeChildren save(AbeChildren children) {
          return childrenRepo.save(children);

     }

     public List<AbeChildren> sortedPage(int offset, int pagesize, String field) {
          Page<AbeChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AbeChildren> pagination(int offset, int pagesize) {
          Page<AbeChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
