package com.example.flowerstore;

import com.example.flowerstore.decorators.BasketDecorator;
import com.example.flowerstore.decorators.PaperDecorator;
import com.example.flowerstore.decorators.RibbonDecorator;
import com.example.flowerstore.item.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTests {

    private Item item;

    @BeforeEach
    public void setUp() {
        // Initialize an example item for testing.
        item = new Item() {
            @Override
            public String getDescription() {
                return "Mocked Item Description";
            }

            @Override
            public double getPrice() {
                return 10.0;
            }
        };
    }

    @Test
    public void testBasketDecorator() {
        BasketDecorator basketDecorator = new BasketDecorator();
        basketDecorator.setItem(item);

        // Ensure that the BasketDecorator correctly calculates the price.
        assertEquals(14.0, basketDecorator.getPrice(), 0.001);
    }

    @Test
    public void testPaperDecorator() {
        PaperDecorator paperDecorator = new PaperDecorator();
        paperDecorator.setItem(item);

        // Ensure that the PaperDecorator correctly calculates the price.
        assertEquals(23.0, paperDecorator.getPrice(), 0.001);
    }

    @Test
    public void testRibbonDecorator() {
        RibbonDecorator ribbonDecorator = new RibbonDecorator();
        ribbonDecorator.setItem(item);

        // Ensure that the RibbonDecorator correctly calculates the price.
        assertEquals(50.0, ribbonDecorator.getPrice(), 0.001);
    }

    @Test
    public void testCombinedDecorators() {
        // Create a chain of decorators: Ribbon -> Paper -> Basket
        RibbonDecorator ribbonDecorator = new RibbonDecorator();
        PaperDecorator paperDecorator = new PaperDecorator();
        BasketDecorator basketDecorator = new BasketDecorator();

        // Set the item for each decorator in the chain.
        ribbonDecorator.setItem(item);
        paperDecorator.setItem(ribbonDecorator);
        basketDecorator.setItem(paperDecorator);

        // Ensure that the combined decorators calculate the price correctly.
        assertEquals(87.0, basketDecorator.getPrice(), 0.001);
    }
}
}
