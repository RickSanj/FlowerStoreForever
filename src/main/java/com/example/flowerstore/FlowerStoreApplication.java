package com.example.flowerstore;

import com.example.flowerstore.flowers.Flower;
import com.example.flowerstore.flowers.FlowerColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }

}