package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mycollection")
public class ModelClass {
    @Id
    private String id;
    private String name;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}