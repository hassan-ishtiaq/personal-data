package com.hassan.api.personaldata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {

    @GetMapping("/ping")
    public String ping(){
        return "OK";
    }
}
