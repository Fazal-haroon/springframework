package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    //Constructor injection, setter injection and no setter or constructor
    //setter injection and no setter or constructor are same
    //mandatory dependency then use constructor, if it's optional dependency, go for setter injection
    //there is not a lot of difference in terms of mandatory or optional dependences.

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Implementing Sorting Logic

        //implement bubbleSort here, this is tight coupling
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sort = sortAlgorithm.sort(numbers);
        System.out.println("sort = " + sortAlgorithm);

        //Search the array

        return 3;
    }
    //Sorting an array
    //Search the array
    //Return the result
}
