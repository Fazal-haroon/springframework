package com.example.demo.service;

import com.example.demo.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        //Business Logic
        return dao1.retrieveSomething();
    }
}
