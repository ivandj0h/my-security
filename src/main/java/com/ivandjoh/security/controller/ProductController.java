package com.ivandjoh.security.controller;

import com.ivandjoh.security.dto.Product;
import com.ivandjoh.security.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page";
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
