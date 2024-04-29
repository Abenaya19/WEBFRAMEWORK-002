package com.example.abecw1.abecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.abecw1.abemodel.abeBook;
import com.example.abecw1.abeservice.abeBookService;

@RestController
public class abeBookController {
    @Autowired
    private abeBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<abeBook> getBookById(@PathVariable Long bookId) {
        abeBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
