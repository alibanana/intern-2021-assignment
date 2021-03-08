package com.intern.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Override
    public List<Book> findAllBooks() {
        ImportedBook importedBook1 = new ImportedBook("joHN dOE");
        importedBook1.setAuthor("joHN dOE");
        importedBook1.setTitle("IMPORTED book 1");
        importedBook1.setType(BookType.IMPORTEDBOOK);

        ImportedBook importedBook2 = new ImportedBook("joHN dOE");
        importedBook2.setAuthor("joHN dOE");
        importedBook2.setTitle("IMPORTED book 2");
        importedBook2.setType(BookType.IMPORTEDBOOK);

        ImportedBook importedBook3 = new ImportedBook("joHN dOE");
        importedBook3.setAuthor("joHN dOE");
        importedBook3.setTitle("IMPORTED book 3");
        importedBook3.setType(BookType.IMPORTEDBOOK);

        ImportedBook importedBook4 = new ImportedBook("joHN dOE");
        importedBook4.setAuthor("joHN dOE");
        importedBook4.setTitle("IMPORTED book 4");
        importedBook4.setType(BookType.IMPORTEDBOOK);

        LocalBook localBook1 = new LocalBook("gramEDia");
        localBook1.setAuthor("jaNE stARk");
        localBook1.setTitle("loCal bOok 1");
        localBook1.setType(BookType.LOCALBOOK);

        LocalBook localBook2 = new LocalBook("gramEDia");
        localBook2.setAuthor("jaNE stARk");
        localBook2.setTitle("loCal bOok 2");
        localBook2.setType(BookType.LOCALBOOK);

        LocalBook localBook3 = new LocalBook("gramEDia");
        localBook3.setAuthor("jaNE stARk");
        localBook3.setTitle("loCal bOok 3");
        localBook3.setType(BookType.LOCALBOOK);

        LocalBook localBook4 = new LocalBook("gramEDia");
        localBook4.setAuthor("jaNE stARk");
        localBook4.setTitle("loCal bOok 4");
        localBook4.setType(BookType.LOCALBOOK);

        return Arrays.asList(importedBook1, importedBook2, importedBook3, importedBook4, localBook1, localBook2, localBook3, localBook4);
    }
}
