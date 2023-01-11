package com.example.demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl business;

    @Test
    void findTheGreatestFromAllDataUseMockito_withFiveValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{12, 5, 52, 22, 11});
        int theGreatestFromAllData = business.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllDataUseMockito_withFiveValues = " + theGreatestFromAllData);
        assertEquals(52, theGreatestFromAllData);
    }

    @Test
    void findTheGreatestFromAllDataUseMockito_withOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{12});
        int theGreatestFromAllData = business.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllDataUseMockito_withOneValue = " + theGreatestFromAllData);
        assertEquals(12, theGreatestFromAllData);
    }

    @Test
    void findTheGreatestFromAllDataUseMockito_withEmptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int theGreatestFromAllData = business.findTheGreatestFromAllData();
        System.out.println("theGreatestFromAllDataUseMockito_withEmptyArray = " + theGreatestFromAllData);
        assertEquals(Integer.MIN_VALUE, theGreatestFromAllData);
    }

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
