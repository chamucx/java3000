package com.example.java3000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java3000Application {

    @GetMapping("/mensaje")

    public  String mesaje(){
        return "Welcome from Java to Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(Java3000Application.class, args);
    }

}
