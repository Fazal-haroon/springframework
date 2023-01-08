package com.example.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData_withFiveValues() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{12, 5, 52, 22, 11});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllData_withFiveValues = " + theGreatestFromAllData);
        assertEquals(52, theGreatestFromAllData);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{12});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllData_withOneValue = " + theGreatestFromAllData);
        assertEquals(12, theGreatestFromAllData);
    }
}
