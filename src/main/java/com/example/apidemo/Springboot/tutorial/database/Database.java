package com.example.apidemo.Springboot.tutorial.database;

import com.example.apidemo.Springboot.tutorial.models.Product;
import com.example.apidemo.Springboot.tutorial.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product a = new Product("quang",1997,"quangUrl");
                logger.info("insert: "+ productRepository.save(a));
            }
        };
    }
}
