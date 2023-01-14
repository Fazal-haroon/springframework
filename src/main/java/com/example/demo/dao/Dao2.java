package com.example.demo.dao;

import com.example.demo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao2";
    }
}
