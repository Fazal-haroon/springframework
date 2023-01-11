package com.example.demo.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepCdiApp.class)
public class SomeCDITest {

    @Autowired
    SomeCDI someCDI;

    @Test
    public void testBasicScenario(){
        int actualResult = someCDI.findGreatest();
        assertEquals(104, actualResult);
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