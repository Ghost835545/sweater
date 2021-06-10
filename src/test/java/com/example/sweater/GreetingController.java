package com.example.sweater;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@SpringBootTest
class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
    @GetMapping
    public String main(Map<String, Object> model){
        model.put("some","hello ivan!");
        return "main";
    }
}
