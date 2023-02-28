package com.example.ej10practicaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ej10practicaSpring")
@Import(AppConfig.class)
public class ej10Main {

    public static void main(String[] args) {
        SpringApplication.run(ej10Main.class, args);
    }
}
