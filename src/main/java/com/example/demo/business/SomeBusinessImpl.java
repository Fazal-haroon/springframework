package com.example.demo.business;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] ints = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : ints) {
            if(value > greatestValue){
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}

interface DataService {
    int[] retrieveAllData();
}
