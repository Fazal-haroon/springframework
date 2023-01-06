package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //this is not a good practice hardcoding text
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;
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
//        BubbleSortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
//        int[] sort = quickSortAlgorithm.sort(numbers);
//        System.out.println("sort = " + quickSortAlgorithm);
        int[] sort = sortAlgorithm.sort(numbers);
        System.out.println("sort = " + sortAlgorithm);

        //Search the array

        return 3;
    }
    //Sorting an array
    //Search the array
    //Return the result
}
