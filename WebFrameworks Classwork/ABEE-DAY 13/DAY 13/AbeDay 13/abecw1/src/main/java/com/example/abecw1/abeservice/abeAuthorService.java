package com.example.abecw1.abeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abecw1.abemodel.abeAuthor;
import com.example.abecw1.aberepository.abeAuthorRepository;

@Service
public class abeAuthorService {
    @Autowired
    private abeAuthorRepository authorRepository;

    public abeAuthor saveAuthor(abeAuthor author) {
        return authorRepository.save(author);
    }

    public abeAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<abeAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public abeAuthor updateAuthor(Long id, abeAuthor author) {
        abeAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
