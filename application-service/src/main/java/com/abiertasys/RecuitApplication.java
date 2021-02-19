package com.abiertasys;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abiertasys.*")
public class RecuitApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecuitApplication.class, args);
    }
}
