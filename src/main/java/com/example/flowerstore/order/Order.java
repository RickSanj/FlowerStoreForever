package com.example.flowerstore.order;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.item.Item;
import com.example.flowerstore.payment.Payment;
import lombok.Getter;

import java.util.LinkedList;
@Getter
public class Order {
    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void  setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        double total = 0;
        for(Item flower:items){
            total += flower.getPrice();
        }
        return total;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void deleteItem(Item item){
        this.items.remove(item);
    }

}
