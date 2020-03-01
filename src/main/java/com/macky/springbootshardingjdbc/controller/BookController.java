package com.macky.springbootshardingjdbc.controller;

import com.macky.springbootshardingjdbc.entity.Book;
import com.macky.springbootshardingjdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> getItems() {
        return bookService.getBookList();
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Boolean saveItem(Book book) {
        return bookService.save(book);
    }
}
