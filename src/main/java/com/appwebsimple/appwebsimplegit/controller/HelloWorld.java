package com.appwebsimple.appwebsimplegit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET)
    
    public String home(){
        return "Aplicación web muy simple";
    }
}
