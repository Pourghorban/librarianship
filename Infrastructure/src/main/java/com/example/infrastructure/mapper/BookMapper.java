package com.example.infrastructure.mapper;

import com.example.domain.model.Book;
import com.example.presentation.dto.BookDTO;

public class BookMapper {
    public static Book toEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPublisher(bookDTO.getPublisher());
        book.setYear(bookDTO.getYear());
        book.setCategory(bookDTO.getCategory());
        book.setPrice(bookDTO.getPrice());
        return book;
    }

    public static BookDTO toDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setPublisher(book.getPublisher());
        bookDTO.setYear(book.getYear());
        bookDTO.setCategory(book.getCategory());
        bookDTO.setPrice(book.getPrice());
        return bookDTO;
    }
}
