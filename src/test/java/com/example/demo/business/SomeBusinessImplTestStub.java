package com.example.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessImplTestStub {
//we are writing stubs for data layers
    @Test
    void findTheGreatestFromAllData_withFiveValues() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllData_withFiveValues = " + theGreatestFromAllData);
        assertEquals(52, theGreatestFromAllData);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub2());
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllData_withOneValue = " + theGreatestFromAllData);
        assertEquals(12, theGreatestFromAllData);
    }
}

class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{12, 5, 52, 22, 11};
    }
}

class DataServiceStub2 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{12};
    }
}