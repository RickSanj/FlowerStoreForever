package com.example.flowerstore.flowers;

import com.example.flowerstore.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
public class Flower extends Item {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;

}