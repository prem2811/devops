package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PremApplication {

    public static void main(String[] args) {
        SpringApplication.run(PremApplication.class, args);
        System.out.println("Application started successfully!");
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Spring Boot running on Kubernetes!";
    }
}
