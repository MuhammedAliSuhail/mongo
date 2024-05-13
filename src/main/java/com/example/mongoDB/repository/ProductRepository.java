package com.example.mongoDB.repository;

import com.example.mongoDB.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{ productId: :productId }")
    List<Product> findByProductId(int productId);
}
