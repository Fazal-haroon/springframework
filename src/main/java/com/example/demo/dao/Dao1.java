package com.example.demo.dao;

import com.example.demo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

//    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
