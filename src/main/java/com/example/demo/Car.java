package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;
import java.util.Date;

@Document(collection = "mycollection")
public class Car {
    @Id
    String id;
    String name;
    String brand;
    String model;
    LocalDate date;

    public Car(String name, String brand, String model, LocalDate date) {
        this.brand = brand;
        this.name = name;
        this.model = model;
        this.date = date;

    }

    ;

    public LocalDate getDate() {
        return date;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setData(Car car) {
        this.setBrand(car.getBrand());
        this.setName(car.getName());
        this.setDate(car.getDate());
        this.setModel(car.getModel());

    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }
}
