package com.example.flowerstore.decorators;

import com.example.flowerstore.item.Item;
import lombok.Setter;

@Setter
public class PaperDecorator extends ItemDecorator {
    Item item;
    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}
