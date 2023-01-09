package com.example.demo.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
//@Component
public class SomeCdiDao {
    public int[] getData(){
        return new int[]{5, 89, 104};
    }
}
