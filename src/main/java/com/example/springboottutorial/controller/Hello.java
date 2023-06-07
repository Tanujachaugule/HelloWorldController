package com.example.springboottutorial.controller;

import com.example.springboottutorial.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @GetMapping(value = {"","/","/Tanuja"})
    public String helloWorld(){return "Hello From BridgeLabz";}

    @RequestMapping(value = {"/param"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+ name + "!";
    }

    @GetMapping(value = {"","/","/Get"})
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+"!";
    }

    @PostMapping("/post-name")
    public String sayHello(@RequestBody Person person) {

        return "Hello "+person.getFirstName()+" "+person.getLastName();
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+"!";
    }
}
