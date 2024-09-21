package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  MyModelRepo extends MongoRepository<Car ,String> {
    Car findByName(String name);
    List<Car> findByBrand(String brand);
    Car findByIdAndBrand(String id,String brand);
}
