package com.example.flowerstore.payment;

public class CreditCartPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Paying with card " + price);
    }
}
