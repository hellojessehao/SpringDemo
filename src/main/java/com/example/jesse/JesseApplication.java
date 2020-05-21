package com.example.jesse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.jesse.controller"})
public class JesseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JesseApplication.class, args);
    }

}
