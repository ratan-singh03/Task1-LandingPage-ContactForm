package com.example.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaskApplication.class, args);

        System.out.println("========================================");
        System.out.println("   Spring Boot Server Started");
        System.out.println("   http://localhost:8080");
        System.out.println("========================================");

    }

}