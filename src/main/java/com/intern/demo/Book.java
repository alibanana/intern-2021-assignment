package com.intern.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Book {
    private String author;
    private String title;
    private BookType type;
}
