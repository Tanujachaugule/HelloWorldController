package com.example.springboottutorial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @GetMapping(value = {"","/","/Tanuja"})
    public String helloWorld(){return "Hello From BridgeLabz";}

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+ name + "!";
    }

    @GetMapping(value = {"","/","/Get"})
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+"!";
    }

    @PostMapping("/post-name")
    public String sayHello(@RequestBody User user) {
        User user1 =new User();
        return "Hello "+user1.getFirstName()+" "+user1.getLastName();
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+"!";
    }
}