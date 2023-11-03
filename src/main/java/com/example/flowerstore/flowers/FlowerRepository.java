package com.example.flowerstore.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
