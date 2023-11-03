package com.example.flowerstore.delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void delivery() {
        System.out.println("Post delivery");
    }
}
