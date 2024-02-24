package com.example.configclient.controller;

import com.example.configclient.feign.BookServiceFeignClient;
import com.example.configclient.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ConfigClientController {
    private final BookServiceFeignClient bookServiceFeignClient;

    @Autowired
    public ConfigClientController(BookServiceFeignClient bookServiceFeignClient) {
        this.bookServiceFeignClient = bookServiceFeignClient;
    }

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return bookServiceFeignClient.getAllBooks();
    }
}
