package com.example.abecw1.abeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abecw1.abemodel.abeAuthor;
import com.example.abecw1.abemodel.abeBook;
import com.example.abecw1.aberepository.abeAuthorRepository;
import com.example.abecw1.aberepository.abeBookRepository;

@Service
public class abeBookService {
    @Autowired
    private abeBookRepository bookRepository;
@Autowired
private abeAuthorRepository authorRepository;
    public abeBook saveBook(Long authorId, abeBook book) {
        abeAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public abeBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

