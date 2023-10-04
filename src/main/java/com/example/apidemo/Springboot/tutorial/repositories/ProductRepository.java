package com.example.apidemo.Springboot.tutorial.repositories;

import com.example.apidemo.Springboot.tutorial.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
