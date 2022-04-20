package com.appwebsimple.appwebsimplegit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET)

    public String home(){
        return "Buenas Tardes USACH";
    }
}