package com.example.alproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlprojectApplication {
    @GetMapping("/main")
    public String welcome(){
        return "welcome to javatechie ";
    }

    public static void main(String[] args) {
        SpringApplication.run(AlprojectApplication.class, args);
    }

}
