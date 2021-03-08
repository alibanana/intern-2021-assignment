package com.intern.demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
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
        Map<String, List<String>> expexted = new HashMap<>();
        expexted.put("Jane Stark", Arrays.asList("Local Book 1", "Local Book 2", "Local Book 3", "Local Book 4"));
        expexted.put("John Doe", Arrays.asList("Imported Book 1", "Imported Book 2", "Imported Book 3", "Imported Book 4"));
        assertEquals(expexted, results);
    }
}
