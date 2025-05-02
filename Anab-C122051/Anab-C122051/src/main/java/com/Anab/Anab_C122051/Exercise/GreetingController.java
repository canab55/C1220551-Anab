package com.Anab.Anab_C122051.Exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    public GreetingController() {
    }

    @GetMapping({"/"})
    public String welcome() {
        return "First REST API!";
    }

    @GetMapping({"/greet/name"})
    public String greet() {
        return "Hello,  Anab ";
    }
}
