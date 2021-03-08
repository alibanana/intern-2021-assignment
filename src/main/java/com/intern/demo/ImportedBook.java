package com.intern.demo;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ImportedBook extends Book {
    private String translator;

    public ImportedBook(String author, String title, String translator) {
        super.setAuthor(author);
        super.setTitle(title);
        this.translator = translator;
    }
}
