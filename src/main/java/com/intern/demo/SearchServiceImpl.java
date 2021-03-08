package com.intern.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Override
    public List<Book> findAllBooks() {
        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1", "joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2", "joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3", "joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4", "joHN dOE");

        LocalBook localBook1 = new LocalBook("jaNE stARk", "loCal bOok 1", "gramEDia");
        LocalBook localBook2 = new LocalBook("jaNE stARk", "loCal bOok 2", "gramEDia");
        LocalBook localBook3 = new LocalBook("jaNE stARk", "loCal bOok 3", "gramEDia");
        LocalBook localBook4 = new LocalBook("jaNE stARk", "loCal bOok 4", "gramEDia");

        return Arrays.asList(importedBook1, importedBook2, importedBook3, importedBook4, localBook1, localBook2, localBook3, localBook4);
    }
}
