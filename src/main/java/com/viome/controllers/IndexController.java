package com.viome.controllers;

import com.viome.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    Product index(){

        Product product = new Product();
        product.id = "1";
        product.name="Test";
        product.description = "Test Description";
        return product;
    }
}
