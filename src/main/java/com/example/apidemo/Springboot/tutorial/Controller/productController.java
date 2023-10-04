package com.example.apidemo.Springboot.tutorial.Controller;

import com.example.apidemo.Springboot.tutorial.models.Product;
import com.example.apidemo.Springboot.tutorial.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products")
public class productController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
