package com.supmti.tp02.banque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MonController {

    @GetMapping
    public String hello() {
        return "HELLO";
    }

    @GetMapping(value = "/bar")
    public String bar() {
        return "BAR";
    }

    @PostMapping(value = "/post")
    public String post() {
        return "BAR";
    }
}
