package com.foreachproject.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class DemoController {
    @RequestMapping
    public String demo() {
        return "demo";
    }
}
