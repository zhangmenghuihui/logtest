package com.unitechs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogtestApplication.class, args);
        System.out.println("hello word");
    }

}
