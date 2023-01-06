package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
//@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers){
        //Logic for Quick Sort
        return numbers;
    }
}
