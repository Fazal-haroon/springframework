package com.example.demo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void testTrue() {
        boolean test = true; //Result
        assertEquals(true, test);
        assertTrue(test);
    }

    @Test
    void testListContains_AWS() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");
        assertEquals(true, test, "Error Message");
        assertFalse(test2);
    }

    @Test
    void testList_Size() {
        assertEquals(3, todos.size());
    }
}
