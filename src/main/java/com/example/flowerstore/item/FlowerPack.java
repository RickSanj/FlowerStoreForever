package com.example.flowerstore.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack() {
        this.flower = new Flower(flower);
        this.quantity = quantity;

    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public void setQuantity() {
        if (quantity < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;

        }
    }
}
