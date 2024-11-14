package com.example.test_project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/health_check")
    public Map<String, String> getHelloWorld() {
        return Map.of("message", "hello world");
    }
}
