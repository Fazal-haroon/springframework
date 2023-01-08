package com.example.demo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSum() {
        //empty of method is success test pass msg
        //Test condition or Assert to check the behaviours
        MyMath myMath = new MyMath();
        int[] numberArray = {1, 2, 3, 5, 4};
        int i = myMath.calculateSum(numberArray);
        System.out.println("i = " + i);
        Assertions.assertEquals(i,15);
    }
}