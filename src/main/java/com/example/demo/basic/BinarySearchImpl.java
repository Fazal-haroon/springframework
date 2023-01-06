package com.example.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype") //this is not a good practice hardcoding text
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

//    private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postConstruct(){
        logger.info("PostConstruct ***");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy ***");
    }
}
