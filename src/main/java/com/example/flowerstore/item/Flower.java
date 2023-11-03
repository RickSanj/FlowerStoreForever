package com.example.flowerstore.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

    public Flower() {
    }


    public String getColor() {
        return color.toString();
    }
}
