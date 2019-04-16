package com.spring.learning.dacelearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DaceLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaceLearningApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
