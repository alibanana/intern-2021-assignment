package com.intern.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    private static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"

        List<String> input_list = Arrays.asList(input.split("\\s+"));

        // Convert all to lowercase
        input_list = input_list.stream().map(String::toLowerCase).collect(Collectors.toList());

        // Convert first letter to uppercase
        input_list = input_list.stream().map(word -> (Character.toUpperCase(word.charAt(0)) + word.substring(1))).collect(Collectors.toList());

        return String.join(" ", input_list);
    }

    public static Map<String, List<String>> convertToMap (List<Book> books) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>

        return books.stream()
                .collect(Collectors.groupingBy(book -> capitalize(book.getAuthor()),
                        Collectors.mapping(book -> capitalize(book.getTitle()), Collectors.toList())));
    }
}
