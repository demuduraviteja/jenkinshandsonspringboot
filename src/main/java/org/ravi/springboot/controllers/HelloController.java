package org.ravi.springboot.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello World from Spring boot";
    }
}
