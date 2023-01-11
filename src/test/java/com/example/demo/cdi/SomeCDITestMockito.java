package com.example.demo.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDITestMockito {

    //Inject Mock
    @InjectMocks
    SomeCDI someCDI;

    //Create Mock
    @Mock
    SomeCdiDao daoMockData;

    @Test
    public void testBasicScenario_MockArrayElements(){
        Mockito.when(daoMockData.getData()).thenReturn(new int[]{32, 54, 62, 2});
        int actualResult = someCDI.findGreatest();
        assertEquals(62, actualResult);
    }

    @Test
    public void testBasicScenario_NoElements(){
        Mockito.when(daoMockData.getData()).thenReturn(new int[]{});
        int actualResult = someCDI.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testBasicScenario_IfEqualElements(){
        Mockito.when(daoMockData.getData()).thenReturn(new int[]{5,5});
        int actualResult = someCDI.findGreatest();
        assertEquals(5, actualResult);
    }

    @Test
    public void getSomeCdiDao() {
    }

    @Test
    public void setSomeCdiDao() {
    }

    @Test
    public void findGreatest() {
    }
}