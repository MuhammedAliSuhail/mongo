package com.example.mongoDB.Controller;

import com.example.mongoDB.Entity.Product;
import com.example.mongoDB.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class testController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getProduct(){
        return  productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public List<Product> getProductById(@PathVariable("id") int id){

        return  productRepository.findByProductId(id);
    }
}
