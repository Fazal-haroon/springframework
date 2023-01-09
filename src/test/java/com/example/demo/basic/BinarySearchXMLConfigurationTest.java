package com.example.demo.basic;

import com.example.demo.SpringIn5StepBasicApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {

    //Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void binarySearch() {
        //call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        //check if the value is correct
        assertEquals(3, actualResult);
    }

    @Test
    public void postConstruct() {
    }

    @Test
    public void preDestroy() {
    }
}