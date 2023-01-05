package com.example.demo.impl;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

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
