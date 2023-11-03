package com.example.flowerstore.delivery;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void delivery() {
        System.out.println("DHL delivery");
    }
}
