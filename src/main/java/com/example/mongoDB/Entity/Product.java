package com.example.mongoDB.Entity;

import com.example.mongoDB.Entity.Review;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Getter
@Setter
public class Product {

    @Id
    private String id;
    private int productId;
    private String name;
    private String description;
    private double price;
    private String category;
    private int stock;
    private List<String> tags;
    private List<Review> reviews;

}