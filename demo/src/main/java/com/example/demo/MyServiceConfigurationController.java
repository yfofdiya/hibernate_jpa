package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceConfigurationController {

    @Autowired
    private MyServiceConfiguration configuration;

    @GetMapping("/configuration")
    public MyServiceConfiguration getConfiguration(){
        return configuration;
    }

}
