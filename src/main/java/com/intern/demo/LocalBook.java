package com.intern.demo;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LocalBook extends Book {
    private String store;

    public LocalBook(String author, String title, String store) {
        super.setAuthor(author);
        super.setTitle(title);
        this.store = store;
    }
}
