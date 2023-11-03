package com.example.flowerstore.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }


    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return flowerService.getFlowers();
    }
//    @GetMapping("/order")
//public String getOrder() {
//        Order a = new Order();
//        a.addItem(new Flower(12, 35, FlowerColor.RED));
//        a.addItem(new Flower(15, 10, FlowerColor.BLUE));
//        double total = a.calculateTotalPrice();
//        a.setDeliveryStrategy(PostDeliveryStrategy delivery);
//    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower){
        flowerService.add(flower);
    }
}
