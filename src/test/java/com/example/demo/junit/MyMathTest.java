package com.example.demo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    void calculateSum_ThreeDigitArray() {
        //empty of method is success test pass msg
        //Test condition or Assert to check the behaviours
        assertEquals(15, myMath.calculateSum(new int[] {1, 2, 3, 5, 4}));
    }

    @Test
    void calculateSum_ZeroDigitArray() {
        Assertions.assertEquals(0, myMath.calculateSum(new int[] {}));
    }
}