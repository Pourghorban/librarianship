package com.example.presentation.dto;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String category;
    private double price;
}
