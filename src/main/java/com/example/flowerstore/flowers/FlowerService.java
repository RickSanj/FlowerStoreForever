package com.example.flowerstore.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
//    public List<Flower> getFlowers(){
//        return  List.of(new Flower(4, 12, FlowerColor.BLUE));
//    }
}
