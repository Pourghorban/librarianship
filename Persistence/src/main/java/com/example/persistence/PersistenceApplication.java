package com.example.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.domain.model")
public class PersistenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersistenceApplication.class, args);
    }
}
