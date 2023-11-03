package com.example.flowerstore.decorators;

import com.example.flowerstore.item.Item;
import lombok.Setter;

@Setter
public class RibbonDecorator extends ItemDecorator {
    Item item;
    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}
