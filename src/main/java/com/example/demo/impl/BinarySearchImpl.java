package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;
    //here we use name of the instance variable to solve the conflict
    //@Primary has higher priority over the name of variable
//    private SortAlgorithm quickSortAlgorithm;

    //Constructor injection, setter injection and no setter or constructor
    //setter injection and no setter or constructor are same
    //mandatory dependency then use constructor, if it's optional dependency, go for setter injection
    //there is not a lot of difference in terms of mandatory or optional dependences.

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Implementing Sorting Logic

        //implement bubbleSort here, this is tight coupling
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        int[] sort = quickSortAlgorithm.sort(numbers);
//        System.out.println("sort = " + quickSortAlgorithm);
        int[] sort = bubbleSortAlgorithm.sort(numbers);
        System.out.println("sort = " + bubbleSortAlgorithm);

        //Search the array

        return 3;
    }
    //Sorting an array
    //Search the array
    //Return the result
}
