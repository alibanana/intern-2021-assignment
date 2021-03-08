package com.intern.demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.mockito.MockitoAnnotations.initMocks;

public class CapitalizationTest {

    @InjectMocks
    private SearchServiceImpl searchService;

    @Before
    public void setUp(){
        initMocks(this);
    }

    @Test
    public void convertToMapTest() {
        List<Book> books = searchService.findAllBooks();
        System.out.println(books);
        assertNotNull(books);

        Map<String, List<String>> results = Capitalization.convertToMap(books);
        System.out.println(results);

        //TODO COMPLETE THIS
        assertNotNull(results);
    }
}
