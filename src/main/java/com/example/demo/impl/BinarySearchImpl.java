package com.example.demo.impl;

public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Implementing Sorting Logic

        //implement bubbleSort here, this is tight coupling
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sort = bubbleSortAlgorithm.sort(numbers);

        //Search the array

        return 3;
    }
    //Sorting an array
    //Search the array
    //Return the result
}
