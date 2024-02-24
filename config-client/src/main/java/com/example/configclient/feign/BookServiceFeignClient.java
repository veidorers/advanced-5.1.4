package com.example.configclient.feign;

import com.example.configclient.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface BookServiceFeignClient {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
