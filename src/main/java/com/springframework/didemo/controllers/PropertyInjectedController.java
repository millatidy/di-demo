package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImp")
    GreetingService greetingServiceImp;

    public String sayHello() {
        return greetingServiceImp.sayGreeting();
    }
}
