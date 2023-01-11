package com.example.demo.controller;

import com.example.demo.config.CurrencyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    @Autowired
    CurrencyServiceConfig currencyServiceConfig;

    @GetMapping("/currency-config")
    public CurrencyServiceConfig retrieveCurrency(){
        return currencyServiceConfig;
    }
}
