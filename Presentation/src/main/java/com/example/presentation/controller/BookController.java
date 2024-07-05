package com.example.presentation.controller;

import com.example.application.service.BookService;
import com.example.domain.model.Book;
import com.example.presentation.dto.BookDTO;
import com.example.infrastructure.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return books.stream()
                .map(BookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return BookMapper.toDTO(book);
    }

    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
        System.out.println(bookDTO);
        Book book = BookMapper.toEntity(bookDTO);
        book = bookService.saveBook(book);
        return BookMapper.toDTO(book);
    }

    @PutMapping("/{id}")
    public BookDTO updateBook(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
        Book book = BookMapper.toEntity(bookDTO);
        book.setId(id);
        book = bookService.saveBook(book);
        return BookMapper.toDTO(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
