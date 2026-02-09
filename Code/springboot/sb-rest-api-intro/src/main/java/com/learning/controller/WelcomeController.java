package com.learning.controller;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/say-hello")
    public String helloMessage() {
        return "Hello, This is my first REST API";
    }

    // http://localhost:8080/say-hi
    @GetMapping("/say-hi")
    public String hiMessage() {
        return "<h1>HI, Welcome To My REST API....</h1>";
    }

    // http://localhost:8080/say-bye?name=Abc
    @GetMapping("/say-bye")
    public String byeMessage(@RequestParam("name") String name) {
        return "<h1>Bye User : "+name+"</h1>";
    }

    // http://localhost:8080/say-bye1?name=Abc
    @GetMapping("/say-bye1")
    public String byeMessage(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "<h1>HTTPSERVLETREQUEST - Bye User : "+name+"</h1>";
    }

}
