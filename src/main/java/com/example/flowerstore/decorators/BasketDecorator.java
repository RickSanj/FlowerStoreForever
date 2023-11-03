package com.example.flowerstore.decorators;

import com.example.flowerstore.item.Item;
import lombok.Setter;

@Setter
public class BasketDecorator extends ItemDecorator {
    Item item;
    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
