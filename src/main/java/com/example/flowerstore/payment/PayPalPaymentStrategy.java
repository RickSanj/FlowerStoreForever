package com.example.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Paying with PayPal" + price);
    }
}
