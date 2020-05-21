package com.example.jesse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.jesse.controller",
        "com.example.jesse.service",
        "com.example.jesse.service.dao"})
public class JesseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JesseApplication.class, args);
    }

}
