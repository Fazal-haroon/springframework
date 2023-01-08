package com.example.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void findTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataService() {
            @Override
            public int[] retrieveAllData() {
                return new int[]{12, 5, 52, 22, 11};
            }
        });
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllData = " + theGreatestFromAllData);
        assertEquals(52, theGreatestFromAllData);
    }
}